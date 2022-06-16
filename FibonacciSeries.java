// public class FibonacciSeries {
//     public static void main(String args[]) {
//         int count = 10, n1 = 0, n2 = 1, i, n3;
//         System.out.println(n1 + " " + n2);

//         for (i = 2; i < count; i++) {
//             n3 = n1 + n2;
//             System.out.println(" " + n3);
//             n1 = n2;
//             n2 = n3;
//         }
//     }
// }

//using recursion

class FibonacciSeries {
    static int n1 = 0, n2 = 1, n3 = 0;

    static void printFibonacci(int count) {
        if (count > 0) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.println(" " + n3);
            printFibonacci(count - 1);
        }

    }

    public static void main(String args[]) {
        int count = 10;
        System.out.println(n1 + " " + n2);
        printFibonacci(count - 2);

    }
}
