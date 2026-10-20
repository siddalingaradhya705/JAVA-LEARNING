import java.util.Arrays;
import java.util.Scanner;
//imports scanner, which reads input from the keyboard.

public class basicinfo {
    // public means the class can be accessed from other classes
    //class is a keyword used to create a class.
    //basic-info is the name of this class.
    public static void main(String []args){
        //public: the method can be accessed by the java runtime.
        //static: main() can run without creating an object.
        //void: this metod does not return a value.
        //main: the starting point of the program.
        //string[]args: accepts command-line arguments.
        System.out.println("hello,world");
        //system: a bult-in java class.
        //out: the standard output stream.
        //println():prints text and moves to the next line.
        // ; marks the end of the java statement.
        System.out.print("what is your name");
        // print(): it displays the text without moving to the next line.
        Scanner Scanner= new Scanner(System.in);
        // scanner : the type of variable.
        // Scanner : the variable name.
        // new : creates a new object.
        // system.in : reads keyboard input.
        System.out.print("enter your age");
        // Asks the user to enter their age.
        int age= Scanner.nextInt();
        //int stores a whole number.
        //nextInt() reads an integer from the keyboard
        Scanner.nextLine();
        // consumes the leftover newline after nextInt().
    }
};

