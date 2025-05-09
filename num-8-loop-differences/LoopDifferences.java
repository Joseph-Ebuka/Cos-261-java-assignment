public class LoopDifferences {
    public static void main(String[] args) {
        System.out.println("FOR LOOP:");
        for (int i = 1; i <= 3; i++) {
            System.out.println("  i = " + i);
        }

        System.out.println("\nWHILE LOOP:");
        int j = 1;
        while (j <= 3) {
            System.out.println("  j = " + j);
            j++;
        }

        System.out.println("\nDO-WHILE LOOP:");
        int k = 1;
        do {
            System.out.println("  k = " + k);
            k++;
        } while (k <= 3);
    }
}

/*
 * Differences:
 * - for: used when number of iterations is known
 * - while: used when condition must be checked before loop runs
 * - do-while: runs at least once, even if condition is false
 */
