/*
 * DIFFERENCE BETWEEN == AND .EQUALS()
 * In Java:
 * - '==' compares references (memory addresses).
 * - '.equals()' compares values (content of objects), if properly overridden.
 */

public class FromString {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "hello";
        String s3 = String.valueOf(s1);

        // Reference comparison using ==
        if (s1 == s2)
            System.out.println("s1 == s2: both point to the same object");
        else
            System.out.println("s1 == s2: different objects");

        // Value comparison using .equals()
        if (s1.equals(s2))
            System.out.println("s1.equals(s2): contents are equal");
        else
            System.out.println("s1.equals(s2): contents are not equal");

        // Reference comparison for s1 and s3
        if (s1 == s3)
            System.out.println("s1 == s3: both point to the same object");
        else
            System.out.println("s1 == s3: different objects");

        // Value comparison for s1 and s3
        if (s1.equals(s3))
            System.out.println("s1.equals(s3): contents are equal");
        else
            System.out.println("s1.equals(s3): contents are not equal");
    }
}
