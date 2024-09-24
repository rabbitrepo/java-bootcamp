/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mond
 */
public class Start {
//
//    public static void main(String[] data) {
//        System.out.println("Welcome to Mac!");
//    }

//    public static void main(String[] data) throws Exception {
//        System.out.print("Please enter 3 characters: ");
//        // This code fragment is going to read 3 characters
//        // from keyboard and display directly
//        int a = System.in.read();  // A
//        int b = System.in.read();  // 2
//        int c = System.in.read();  // Z and [Enter]
//        System.out.println(a);     // 65
//        System.out.println(b);     // 50
//        System.out.println(c);     // 90
//    }
//    public static void main(String[] data) throws Exception {
//        System.out.print("Please enter 3 characters: ");
//        // This code fragment is going to read 3 characters
//        // from keyboard and display directly
//        int a = System.in.read();  // A
//        int b = System.in.read();  // 2
//        int c = System.in.read();  // Z and [Enter]
//        System.out.println(a);     // 65
//        System.out.println(b);     // 50
//        System.out.println(c);     // 90
//        char x = (char) a;
//        char y = (char) b;
//        char z = (char) c;
//        System.out.println(x);
//        System.out.println(y);
//        System.out.println(z);
//        String s = "";
//        s = s + x; // Append x to s
//        s = s + y;
//        s += z; // the same as [s = s + z;]
//        System.out.println(s);
//    }
    public static void main(String[] data) {
        try {
            System.out.print("Please enter 3 characters: ");

//            // Simulate an ArrayIndexOutOfBoundsException
//            int[] numbers = new int[3];
//            System.out.println(numbers[10]);  // This will throw an ArrayIndexOutOfBoundsException

            // This code fragment is going to read 3 characters
            // from keyboard and display directly
            int a = System.in.read();  // A
            int b = System.in.read();  // 2
            int c = System.in.read();  // Z and [Enter]
            System.out.println(a);     // 65
            System.out.println(b);     // 50
            System.out.println(c);     // 90
        } catch (Exception e) {
//            System.out.println(e);     // Not recommended
            System.out.println("Invalid Data " + e); // Reflex error back to user
        }
        System.out.println("Exit Successfully");
    }
}
