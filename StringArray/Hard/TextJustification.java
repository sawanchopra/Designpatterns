package LeetCode.StringArray.Hard;

import java.util.ArrayList;
import java.util.List;

public class TextJustification {
    public static void main(String[] args) {
        String[] words = {"This", "is", "an", "example", "of", "text", "justification."};
        int maxWidth = 16;
        System.out.println(fullJustify(words, maxWidth));


    }

    private static List<String> fullJustify(String[] words, int maxWidth) {
        List<String> result = new ArrayList<>();
        int i = 0;
        while (i < words.length) {
            int j = i + 1;
            int lineLength = words[i].length();
            while (j < words.length && lineLength + words[j].length() + (j - i - 1) < maxWidth) {
                lineLength += words[j].length();
                j++;
            }
            StringBuilder builder = new StringBuilder();
            int diff = j - i - 1;
            if (j == words.length || diff == 0) {
                for (int k = i; k < j; k++) {
                    builder.append(words[k]);
                    if (k < j - 1) {
                        builder.append(" ");
                    }
                }
                for (int k = builder.length(); k < maxWidth; k++) {
                    builder.append(" ");
                }
            } else {
                int spaces = (maxWidth - lineLength) / diff;
                int r = (maxWidth - lineLength) % diff;
                for (int k = i; k < j; k++) {
                    builder.append(words[k]);
                    if (k < j - 1) {
                        for (int l = 0; l <= (spaces + ((k - i) < r ? 1 : 0)); l++) {
                            builder.append(" ");
                        }
                    }
                }
            }
            result.add(builder.toString());
            i = j;
        }
        return result;

    }

}
