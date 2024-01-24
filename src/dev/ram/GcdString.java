package dev.ram;

public class GcdString {

    public static void main(String[] args) {
        System.out.println(getGcd("ABCABC", "ABC"));
        System.out.println(getGcd("ABABAB", "AB"));
        System.out.println(getGcd("ABC", "SOMETHING"));
    }

   private static String getGcd(String str1, String str2) {
        if(str2.length() > str1.length()) {
          return   getGcd(str2, str1);
        }
        if(str1.equals(str2)) {
            return str1;
        }
        if(str1.startsWith(str2)) {
            return getGcd(str1.substring(str2.length()), str2);
        }
        return "";
    }
}
