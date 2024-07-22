package PatternPractice;

public class Butterfly {
    public static void main(String[] args) {

        int n = 4;

        for (int i=1; i<=n; i++) {

            //.................... Upper Part .......................//
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            int sp = 2 * (n - i);

            for (int j = 1; j <= sp; j++) {
                System.out.print("  ");
            }

            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }

            System.out.println();
        }

            //.................... Lower Part .......................//

        for (int i=n; i>=1; i--) {

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            int sp = 2 * (n - i);

            for (int j = 1; j <= sp; j++) {
                System.out.print("  ");
            }

            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }

            System.out.println();
        }

    }
}

/*
Output :-

        *             *
        * *         * *
        * * *     * * *
        * * * * * * * *
        * * * * * * * *
        * * *     * * *
        * *         * *
        *             *


 */
