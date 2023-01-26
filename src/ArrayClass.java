public class ArrayClass {
    public static void main(String[] args) {
        System.out.println("Class for array");
        // Array?
        // Array is a collection of similar elements.
        // Real life ex. Any factory, Lays, Car, Tempo, Pen, Door.

        // HAS FIXED SIZE <<< Limitation
        // In which scenario array is suited?
        // When the size of elements are fixed.

        // DECLARATION
        int[] a = new int[5]; // Asks Compiler to fix a space in memory for 5 elements (int [16]).

        System.out.println("Size of array " + a.length);       // O/P = 5

        // Adding elements
        for (int i = 0; i < a.length; i++) {
            a[i] = i + 1;
            System.out.println("index: " + i + " assigning value " + a[i]);
            // index: 0 assigned value 1
        }
    }
}
// REMOTE git branch 1 | git branch 2
                //
              //
            //  git push
          //
// LOCAL: git branch 1 | git branch 2
// LOCAL: git init | git add |  git commit  | git branch 1 | brnach 2 | branch 3| git stash | git tag | tag 1| ta2

/**
 * WAJP to save all alphabets in an array.
 * WAJP to save all alphabets in an array and print in reverse order.
 * WAJP to save all even numbers from 0-100 in an array and print it.
 * WAJP to save all odd numbers from 0-100 in an array and print it.
 * WAJP to save all multiple of 3 and 5 from 0-100 in an array and print it.
 * */

