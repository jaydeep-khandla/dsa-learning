import java.util.Scanner;

public class String2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // next() considers space character " " as delimiter
        // System.out.println("Enter a word:");
        // String word = scanner.next();

        /*
         * nextLine() reads the input including space character " "
         * It considers newline character "\n" as delimiter
         * To read the input including newline character "\n", use nextLine()
         */
        // System.out.println("Enter a string:");
        // String str = scanner.nextLine();

        // System.out.println("Word: " + word);
        // System.out.println("String: " + str);

        /*
         * String Methods:
         * 1. length()
         * 2. charAt(int index)
         * 3. substring(int beginIndex)
         * 4. substring(int beginIndex, int endIndex)
         * 5. equals(Object obj)
         * 6. equalsIgnoreCase(String anotherString)
         * 7. compareTo(String anotherString)
         * 8. compareToIgnoreCase(String str)
         * 9. toLowerCase()
         * 10. toUpperCase()
         * 11. trim()
         * 12. startsWith(String prefix)
         * 13. endsWith(String suffix)
         * 14. contains(CharSequence s)
         * 15. indexOf(int ch)
         * 16. lastIndexOf(int ch)
         * 17. replace(char oldChar, char newChar)
         * 18. replace(CharSequence target, CharSequence replacement)
         * 19. split(String regex)
         * 20. join(CharSequence delimiter, CharSequence... elements)
         * 21. valueOf(int i)
         * 22. valueOf(long l)
         * 23. valueOf(float f)
         * 24. valueOf(double d)
         * 25. valueOf(char c)
         * 26. valueOf(boolean b)
         * 27. valueOf(Object obj)
         * 28. format(String format, Object... args)
         * 29. intern()
         * 30. isEmpty()
         * 31. isBlank()
         * 32. repeat(int count)
         * 33. strip()
         * 34. stripLeading()
         * 35. stripTrailing()
         * 36. lines()
         * 37. codePoints()
         * 38. toCharArray()
         * 39. getBytes()
         * 40. getBytes(Charset charset)
         * 41. getBytes(String charsetName)
         * 42. getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin)
         * 43. matches(String regex)
         * 44. regionMatches(int toffset, String other, int ooffset, int len)
         * 45. regionMatches(boolean ignoreCase, int toffset, String other, int ooffset,
         * int len)
         * 46. toLowerCase(Locale locale)
         * 47. toUpperCase(Locale locale)
         * 48. contentEquals(CharSequence cs)
         * 49. contentEquals(StringBuffer sb)
         * 50. contentEquals(StringBuilder sb)
         * 51. offsetByCodePoints(int index, int codePointOffset)
         * 52. codePointAt(int index)
         * 53. codePointBefore(int index)
         * 54. codePointCount(int beginIndex, int endIndex)
         * 55. subSequence(int beginIndex, int endIndex)
         * 56. replaceAll(String regex, String replacement)
         * 57. replaceFirst(String regex, String replacement)
         */

        String str = "Hello, World!";

        // 1. length()
        System.out.println("Length: " + str.length());

        // 2. charAt(int index)
        System.out.println("Character at index 7: " + str.charAt(7));

        // 3. substring(int beginIndex)
        System.out.println("Substring from index 7: " + str.substring(7));

        // 4. substring(int beginIndex, int endIndex)
        System.out.println("Substring from index 7 to 12: " + str.substring(7, 12));

        // 5. equals(Object obj)
        System.out.println("Equals: " + str.equals("Hello, World!"));

        // 6. equalsIgnoreCase(String anotherString)
        System.out.println("Equals Ignore Case: " + str.equalsIgnoreCase("hello, world!"));

        // 7. compareTo(String anotherString)
        System.out.println("Compare To: " + str.compareTo("Hello, World!"));

        // 8. compareToIgnoreCase(String str)
        System.out.println("Compare To Ignore Case: " + str.compareToIgnoreCase("hello, world!"));

        // 9. toLowerCase()
        System.out.println("Lower Case: " + str.toLowerCase());

        // 10. toUpperCase()
        System.out.println("Upper Case: " + str.toUpperCase());

        // 11. trim()
        System.out.println("Trim: " + "  Hello, World!  ".trim());

        // 12. startsWith(String prefix)
        System.out.println("Starts With: " + str.startsWith("Hello"));

        // 13. endsWith(String suffix)
        System.out.println("Ends With: " + str.endsWith("World!"));

        // 14. contains(CharSequence s)
        System.out.println("Contains 'World': " + str.contains("World"));

        // 15. indexOf(int ch)
        System.out.println("Index of 'o': " + str.indexOf('o'));

        // 16. lastIndexOf(int ch)
        System.out.println("Last Index of 'o': " + str.lastIndexOf('o'));

        // 17. replace(char oldChar, char newChar)
        System.out.println("Replace 'o' with '0': " + str.replace('o', '0'));

        // 18. replace(CharSequence target, CharSequence replacement)
        System.out.println("Replace 'World' with 'Java': " + str.replace("World", "Java"));

        // 19. split(String regex)
        String[] splitStr = str.split(", ");
        System.out.println("Split by ', ': " + String.join(", ", splitStr));

        // 20. join(CharSequence delimiter, CharSequence... elements)
        System.out.println("Join with '-': " + String.join("-", splitStr));

        // 21. valueOf(int i)
        int num = 100;
        System.out.println("Value of int 100: " + String.valueOf(num));

        // 22. valueOf(long l)
        long longNum = 100L;
        System.out.println("Value of long 100L: " + String.valueOf(longNum));

        // 23. valueOf(float f)
        float floatNum = 3.14f;
        System.out.println("Value of float 3.14: " + String.valueOf(floatNum));

        // 24. valueOf(double d)
        double doubleNum = 3.1415;
        System.out.println("Value of double 3.1415: " + String.valueOf(doubleNum));

        // 25. valueOf(char c)
        char charValue = 'A';
        System.out.println("Value of char 'A': " + String.valueOf(charValue));

        // 26. valueOf(boolean b)
        boolean boolValue = true;
        System.out.println("Value of boolean true: " + String.valueOf(boolValue));

        // 27. valueOf(Object obj)
        Object objValue = new Object();
        System.out.println("Value of Object: " + String.valueOf(objValue));

        // 28. format(String format, Object... args)
        System.out.println("Formatted String: " + String.format("Hello, %s!", "World"));

        // 29. intern()
        String str2 = new String("Hello, World!");
        System.out.println("Interned String: " + str2.intern());

        // 30. isEmpty()
        System.out.println("Is Empty: " + "".isEmpty());

        // 31. isBlank()
        System.out.println("Is Blank: " + "   ".isBlank());

        // 32. repeat(int count)
        System.out.println("Repeat 'Hello' 3 times: " + "Hello".repeat(3));

        // 33. strip()
        System.out.println("Strip: " + "   Hello, World!   ".strip());

        // 34. stripLeading()
        System.out.println("Strip Leading: " + "   Hello".stripLeading());

        // 35. stripTrailing()
        System.out.println("Strip Trailing: " + "Hello   ".stripTrailing());

        // 36. lines()
        System.out.println("Lines: ");
        "Hello\nWorld!".lines().forEach(System.out::println);

        // 37. codePoints()
        System.out.print("Code Points: ");
        str.codePoints().forEach(cp -> System.out.print(cp + " "));
        System.out.println();

        // 38. toCharArray()
        System.out.println("To Char Array: " + String.valueOf(str.toCharArray()));

        // 39. getBytes()
        byte[] bytes = str.getBytes();
        System.out.println("Get Bytes: " + new String(bytes));

        // 40. getBytes(Charset charset)
        System.out.println("Get Bytes (UTF-8): " + new String(str.getBytes(java.nio.charset.StandardCharsets.UTF_8)));

        // 41. getBytes(String charsetName)
        try {
            System.out.println("Get Bytes (UTF-8): " + new String(str.getBytes("UTF-8")));
        } catch (java.io.UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        // 42. getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin)
        char[] dst = new char[5];
        str.getChars(7, 12, dst, 0);
        System.out.println("Get Chars: " + new String(dst));

        // 43. matches(String regex)
        System.out.println("Matches 'Hello.*': " + str.matches("Hello.*"));

        // 44. regionMatches(int toffset, String other, int ooffset, int len)
        System.out.println("Region Matches: " + str.regionMatches(7, "World!", 0, 5));

        // 45. regionMatches(boolean ignoreCase, int toffset, String other, int ooffset,
        // int len)
        System.out.println("Region Matches Ignore Case: " + str.regionMatches(true, 7, "world!", 0, 5));

        // 46. toLowerCase(Locale locale)
        System.out.println("Lower Case Locale: " + str.toLowerCase(java.util.Locale.US));

        // 47. toUpperCase(Locale locale)
        System.out.println("Upper Case Locale: " + str.toUpperCase(java.util.Locale.US));

        // 48. contentEquals(CharSequence cs)
        System.out.println("Content Equals (StringBuilder): " + str.contentEquals(new StringBuilder("Hello, World!")));

        // 49. contentEquals(StringBuffer sb)
        System.out.println("Content Equals (StringBuffer): " + str.contentEquals(new StringBuffer("Hello, World!")));

        // 50. contentEquals(StringBuilder sb)
        StringBuilder sb = new StringBuilder("Hello, World!");
        System.out.println("Content Equals (StringBuilder): " + str.contentEquals(sb));

        // 51. offsetByCodePoints(int index, int codePointOffset)
        System.out.println("Offset By Code Points: " + str.offsetByCodePoints(7, 2));

        // 52. codePointAt(int index)
        System.out.println("Code Point At Index 7: " + str.codePointAt(7));

        // 53. codePointBefore(int index)
        System.out.println("Code Point Before Index 7: " + str.codePointBefore(7));

        // 54. codePointCount(int beginIndex, int endIndex)
        System.out.println("Code Point Count: " + str.codePointCount(0, str.length()));

        // 55. subSequence(int beginIndex, int endIndex)
        System.out.println("SubSequence: " + str.subSequence(7, 12));

        // 56. replaceAll(String regex, String replacement)
        System.out.println("Replace All: " + str.replaceAll("o", "0"));

        // 57. replaceFirst(String regex, String replacement)
        System.out.println("Replace First: " + str.replaceFirst("o", "0"));

        scanner.close();
    }
}
