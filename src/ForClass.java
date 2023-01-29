public class ForClass {

    public static void main(String[] args) {
        // FOR loop | WHILE loop | DO WHILE
        // Used for iterating over a given list of elements.

        int a;      // DECLARATION
        a = 10;     // INITIALIZATION

        // Print numbers from 0 to 10
        // SYNTAX
        // for(initialization ; condition ; increment or decrement ) { ... statements... }
        // i++ ~~ i = i + 1
        for (int i = 0; i <= 10; i++) {  // i=10 11, 11<=10(F)
            System.out.println(i);          // 10
        }
        // 1.initialization: i=0
        // 2.Condition:     0<10    1<10    2<10 ...        8<10    9<10    10<10 (False)
        // 3.Statement:     0       1       2    ...        8       9
        // 4.Increment:     1       2       3    ...    8   9       10

        // WHILE
        // SYNTAX
        // initialization
        // while(condition) { ... statement ...
        // INCREMENT }
        System.out.println("Using while loop");
        // DRY RUN
        int i=0;    // Initialization           i=0
        while(i<10){    // Condition            0<10    1<10    ....    9<10    10<10
            System.out.println(i);  // Statement 0       1       ....    9
            i++;        // Increment            1       2       .... 9  10
        }
    }
}
/**
 * WAJP to print all the even numbers from 1 to 100
 * WAJP to print all the odd numbers from 1 to 100
 * WAJP to print all the numbers divisible by 7 from 1 to 100
 * WAJP to print all the numbers divisible by 13 from 1 to 100
 * WAJP to print all the numbers in reverse order from 100 to 1
 * WAJP to print all the numbers from -100 to 0
 * */