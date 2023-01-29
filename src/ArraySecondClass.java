public class ArraySecondClass {

    public static void main(String[] args) {
        int a[] = {10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
        float f[] = new float[10];
        boolean b[] = new boolean[10];
        String s[] = new String[10];
        char ch[] = new char[10];

        // a
        // INPUT: 0 1 2 3 4 5 6 7 8 9

        // OUTPUT: 9 8 7 6 5 4 3 2 1 0 ~ out[]

/*        int j = 0;
        int out[] = new int[a.length];
        for (int i = a.length - 1; i >= 0; i--) {
            out[j++] = a[i];
        }*/

        int out[] = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            out[(a.length - 1 - i)] = a[i];
        }

        // Display
        for (int i = 0; i < out.length; i++) {
            System.out.println(out[i]);
        }

        // i++ ~ use then increment.
        // ++i ~ increment then use.

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println("hello");
            }
        }

        /**
         * WAJP to print following patterns
         * O
         * OO
         * OOO
         * OOOO
         * OOOOO
         *
         *     0
         *    0 0
         *   0 0 0
         *  0 0 0 0
         * 0 0 0 0 0
         *
         *
         * 0 0 0 0 0
         *   0 0 0 0
         *     0 0 0
         *       0 0
         *         0
         *
         * 0
         * 0 0
         * 0 0 0
         * 0 0
         * 0
         *
         *       0
         *      0 0
         *     0 0 0
         *      0 0
         *       0
         *
         *       A
         *       B C
         *       D E F
         *       G H I J
         *       K L M N O
         *
         *  0
         *  11
         *  000
         *  1111
         *  00000
         *
         *  0
         *  1 0
         *  1 0 1
         *  0 1 0 1
         *  0 1 0 1 0
         *
         *  1 2 3
         *    4 5
         *      6
         *
         *  1
         *  2 2
         *  3 3 3
         *  4 4 4 4
         *  5 5 5 5 5
         *
         */
    }
}
