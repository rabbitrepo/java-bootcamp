// void main() {

// int a = 1;

// while (a <= 3) {
//     System.out.print("Yo!");
//     a++;
// }
// }

// public class f {
//     public static void main(String[] args) {

//         if (args.length > 0) {

//             int count = Integer.parseInt(args[0]);

//             for (int i = 0; i < count; i++) {
//                 System.out.println("Yo!");
//             }
//         } else {
//             System.out.println("Please provide the number.");
//         }

//     }
// }

// public class f {
//     public static void main(String[] args) {
//         if (args.length > 0) {

//             int arg = Integer.parseInt(args[0]);
//             int i = 1;
//             int result = 1;

//             while (arg >= i) {
//                 result *= i;
//                 i++;
//             }

//             System.out.println(result);
//         } else {
//             System.out.println("Please provide the number as a parameter.");
//         }
//     }
// }

// public class f {
//     public static void main(String[] args) {
//         if (args.length > 0) {

//             int arg = Integer.parseInt(args[0]);
//             int result = 1;

//             for (int i = 1; i <= arg ; i++) {
//                 result *= i;
//             }

//             System.out.println(result);
//         } else {
//             System.out.println("Please provide the number as a parameter.");
//         }
//     }
// }

// public class f {
// public static void main(String[] args) {
// for (int i = 9; i >= 0; i--) {
// System.out.println(i);
// }
// }
// }
import java.util.Arrays;

public class f {

    public static int factorial(int n) {
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        return result;
    }

    public static int combinatorics(int n, int r) {
        int fN = factorial(n);
        int fR = factorial(r);
        int result = fN / (fR * factorial((n - r)));

        return result;
    }

    public static int trailing(int n) {

        int zeroCount = 0;

        String nF = Integer.toString(factorial(n));
        char[] nFArrChars = nF.toCharArray();

        System.out.println(Arrays.toString(nFArrChars));

        // loop and increase count
        // for (char nFArrChar : nFArrChars) {
        //     System.out.print(nFArrChar);

        //     // if (nFArrChar == '0') {
        //     //     // zeroCount++;
        //     //     System.out.print(nFArrChar);
        //     // }
        // }

        return zeroCount;
        // [ ] Bug, always got 0
    }

    public static void main(String[] args) {
        // System.out.println(trailing(50));
        trailing(5);
    }
}
