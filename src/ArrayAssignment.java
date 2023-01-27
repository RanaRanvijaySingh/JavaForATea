import java.sql.Array;

/**
 * WAJP to save all alphabets in an array.
 * WAJP to save all alphabets in an array and print in reverse order.
 * WAJP to save all even numbers from 0-100 in an array and print it.
 * WAJP to save all odd numbers from 0-100 in an array and print it.
 * WAJP to save all multiple of 3 and 5 from 0-100 in an array and print it.
 */
public class ArrayAssignment {
    public static void main(String[] args) {

        //    WAJP to save all alphabets in an array.

        /*char c = 'a';
        char arr[] = new char[26];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = c;
            c++;
            System.out.print(arr[i] + " ");
        }*/

        // * WAJP to save all alphabets in an array and print in reverse order.
        /*char c = 'z';
        char arr[] = new char[26];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = c;
            c--;
            System.out.print(arr[i] + " ");
        }*/

        // * WAJP to save all even numbers from 0-100 in an array and print it.
        int val = 1, i = 0;
        int arr[] = new int[50];
        while (i < arr.length){
            if( val % 2 == 0){
                arr[i] = val;
                i++;
            }
            val ++;
        }
        for (int j = 0; j < arr.length; j++){
            System.out.print(arr[j] + " ");
        }

        // * WAJP to save all odd numbers from 0-100 in an array and print it.
        /*int val = 1, i = 0;
        int arr[] = new int[50];
        while (i < arr.length){
            if( val % 2 != 0){
                arr[i] = val;
                i++;
            }
            val ++;
        }
        for (int j = 0; j < arr.length; j++){
            System.out.print(arr[j] + " ");
        }*/

        // * WAJP to save all multiple of 3 and 5 from 0-100 in an array and print it.
        /*int val = 1, i = 0;
        int arr[] = new int[50];
        while (i < arr.length){
            if( val % 3 == 0 || val % 5 == 0){
                arr[i] = val;
                i++;
            }
            val ++;
        }
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }*/
    }
}


