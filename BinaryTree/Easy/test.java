package LeetCode.BinaryTree.Easy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test {

    public static void main(String[] args) {
        String url = "https://raw.githubusercontent.com/arcjsonapi/expressionDataService/main/test1"; // Update to your URL
        try {
            String jsonData = fetchExpressions(url);
            List<String> output = evaluateExpressions(jsonData);
            for (String line : output) {
                System.out.println(line);
            }
        } catch (Exception e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }

    private static String fetchExpressions(String urlString) throws Exception {
        URL url = new URL(urlString);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");

        if (conn.getResponseCode() != 200) {
            throw new RuntimeException("Failed: HTTP error code: " + conn.getResponseCode());
        }

        BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        StringBuilder response = new StringBuilder();
        String output;
        while ((output = br.readLine()) != null) {
            response.append(output);
        }
        br.close();

        return response.toString();
    }

    private static List<String> evaluateExpressions(String jsonData) {
        List<String> resultList = new ArrayList<>();

        // Remove surrounding brackets
        jsonData = jsonData.trim();
        if (jsonData.startsWith("[") && jsonData.endsWith("]")) {
            jsonData = jsonData.substring(1, jsonData.length() - 1);
        }

        // Split by "}," to isolate each group
        String[] groups = jsonData.split("\\},\\{");

        for (String group : groups) {
            group = group.replaceAll("[\\{\\}]", ""); // Remove remaining braces
            if (group.contains("\"groupName\"")) {
                String groupName = extractValue(group, "groupName");
                StringBuilder groupResult = new StringBuilder(groupName);

                Map<String, String> evaluatedExpressions = new HashMap<>();
                String[] expressions = group.split("\\},"); // Split expressions

                for (String expr : expressions) {
                    if (expr.contains("\"name\"")) {
                        String name = extractValue(expr, "name");
                        String expressionType = extractValue(expr, "expressionType");
                        String expression = extractValue(expr, "expression");

                        if (expressionType.equals("DIRECT")) {
                            evaluatedExpressions.put(name, expression);
                            groupResult.append(":").append(name).append(":").append(expression);
                        } else {
                            String resolvedExpression = resolveDependencies(expression, evaluatedExpressions);
                            evaluatedExpressions.put(name, resolvedExpression);
                            groupResult.append(":").append(name).append(":(").append(resolvedExpression).append(") ")
                                    .append(expressionType.equals("RS_EXPRESSION") ? "RS" : "$");
                        }
                    }
                }
                resultList.add(groupResult.toString());
            }
        }
        return resultList;
    }

    private static String extractValue(String json, String key) {
        String searchKey = "\"" + key + "\"\\s*:\\s*\"?([^\"]+)\"?";
        Pattern pattern = Pattern.compile(searchKey);
        Matcher matcher = pattern.matcher(json);
        return matcher.find() ? matcher.group(1) : "";
    }

    private static String resolveDependencies(String expression, Map<String, String> evaluatedExpressions) {
        for (String key : evaluatedExpressions.keySet()) {
            expression = expression.replace("${" + key + "}", evaluatedExpressions.get(key));
        }
        return expression;
    }
}
