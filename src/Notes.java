import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class Notes { //this is a comment to describe what things do
    //comments can go anywhere
    public static void main(String[] args) throws IOException {
        System.out.println("Hello world!");
        System.out.print("How's it\t going\b"); // \n creates a new line between two phrases in print
        // \t creates a tab between print
        //b backspaces one character

    //VARIABLES
        //Data types are IMPORTANT
        //Identifier Rules
            //-- always start with a letter, no spaces, Can use numbers, _ is the only symbol, CANNOT use JAVA keywords
        //General Conventions
            // Classes begin with a Capitol, camelCase is common for variableNames, use names that mean something

    //DATA TYPES
        // -primitives store a single, simple value
            // 8 types: 4 integers, 2 real numbers, and 1 boolean (t/f), 1 char
            //-- Integers: byte, short, int, long (Difference is size in bytes)
            //     bits:     8      16   32   64
            // bytes: -128 - 127
            // short: j-32768 - 32767
            // int: -2147483648 - 2147483647       <----
            // long: -4quintillion to 4quintillion
        //-- Real (Decimal) Numbers: float, Double
            //bits:                    32      64
            //float:   7-8 digits of accuracy
            //double   15-16 digits of accuracy <------
        int value = 385;
        short middle = 7943;
        float end = 3.56f;
        double two = 12.45;
        System.out.print(5/0);
        System.out.println(middle + middle);
        //Boolean = true or false
        //Char = 'a' can be another digit.

        // Inputs
        //Import java.util.scanner
        Scanner keyb = new Scanner(System.in);
        System.out.print("Whats  your favorite number?");
        int num = keyb.nextInt();
        System.out.println(num + " is a lucky number!");
        //Garbage Collection
        keyb.nextLine();
        //Necessary anytime you want/need to input w/nextLIne AFTER ANY OTHER INPUT

        //reading strings
        //2 ways: next and nextLine
        // next: grabs a single "word"
        // nextLine processes all information up to and INCLUDING
        //        THE END OF THE LINE
        System.out.println(" Please enter your name:");
        String name = keyb.nextLine();
        System.out.println("Nice to meet you," + name);

        //Examining the input buffer more
        System.out.print("Enter 3 integers");
        int val1 =keyb.nextInt();
        int val2 = keyb.nextInt();
        int val3 = keyb.nextInt();
        System.out.println("The sum of which is: " +(val3+val2+val1));

        Scanner inFile = new Scanner(new File("in.dat"));
        val1 = inFile.nextInt();
        byte hello = keyb.nextByte();
        //Constructions

        //instance variables
        //usually private
       class chicken {
            private boolean fly;
            private int size;


        //mutator methods

            //accessor methods
            public int getSize(){
                return size;

            }


           /** GFX notes
            * x increases right
            * y increases down
            *
            *
            */


       }
    }
}