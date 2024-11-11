package TicTacToe;
import java.lang.*;
import java.io.*;


public class ShortUrl {
    public static final String ALPHABET = "Mheo9PI2qNs5Zpf80TBn7lmRbtQ4YKXHvwAEWxuzdra316OJigGLSVUCyFjkDc";
    public static final int BASE = ALPHABET.length();
    // Java program to generate short url from integer id and
// integer id back from short url.

        // Function to generate a short url from integer ID
        static String idToShortURL(Long num)
        {
            StringBuilder str = new StringBuilder();
            while (num > 0) {
                str.insert(0, ALPHABET.charAt((int) (num % BASE)));
                num = num / BASE;
            }
            return str.toString();
        }

        // Function to get integer ID back from a short url
        static Long shortURLtoID(String shortURL)
        {
            Long num = 0L;
            for (int i = 0; i < shortURL.length(); i++) {
                num = num * BASE + ALPHABET.indexOf(shortURL.charAt(i));
            }
            return num;
        }

        // Driver Code
        public static void main (String[] args) throws IOException
        {
            Long n = 12345l;
            String shorturl = idToShortURL(n);
            System.out.println("Generated short url is " + shorturl);
            System.out.println("Id from url is " +
                    shortURLtoID(shorturl));
        }
    }

// This code is contributed by shubham96301


