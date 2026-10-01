package meeting;

public class Main {
    static int n = 5;

    public static void main(String[] args) {
        pyramid();
        System.out.println("\n Hollow Pyramid");
        hollowPyramid();
        System.out.println("\n Hour Glass");
        hourGlass();
        System.out.println("\n X Pattern");
        xPattern();
        System.out.println("\n Butterfly Pattern");
        butterflyPattern();
    }

     static void pyramid() {
        for(int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
     }

     static void hollowPyramid() {
         for(int i = 1; i <= n; i++) {
             for (int j = 1; j <= n - i; j++) {
                 System.out.print(" ");
             }
             for (int j = 1; j <= 2 * i - 1; j++) {
                 if (j == 1 || j == 2 * i - 1 || i == n) {
                     System.out.print('*');
                 } else {
                     System.out.print(" ");
                 }
             }
             System.out.println();
         }
     }

     static void hourGlass() {
         for(int i = n; i >= 2; i--) {
             for (int j = 1; j <= n - i; j++) {
                 System.out.print(" ");
             }
             for (int j = 1; j <= 2 * i - 1; j++) {
                 if (j == 1 || j == 2 * i - 1 || i == n) {
                     System.out.print('*');
                 } else {
                     System.out.print(" ");
                 }
             }
             System.out.println();
         }

         for (int i = 1; i <= n; i++) {
             for (int j = 1; j <= n - i; j++) {
                 System.out.print(" ");
             }
             for (int j = 1; j <= 2 * i - 1; j++) {
                 if (j == 1 || j == 2 * i - 1 || i == n) {
                     System.out.print('*');
                 } else {
                     System.out.print(" ");
                 }
             }
             System.out.println();
         }
     }

     static void xPattern() {
         for (int i = 1; i <= n; i++) {
             for (int j = 1; j <= n; j++) {
                 if (i == j || j == n - i + 1) {
                     System.out.print('*');
                 } else {
                     System.out.print(" ");
                 }
             }
             System.out.println();
         }
     }

     static void butterflyPattern() {
         for (int i = 1; i <= n; i++) {
             for (int j = 1; j <= i; j++) {
                 System.out.print('*');
             }
             for (int j = 1; j <= 2 * (n - i); j++) {
                 System.out.print(' ');
             }
             for (int j = 1; j <= i; j++) {
                 System.out.print('*');
             }
             System.out.println(' ');
         }
         for (int i = n - 1; i >= 1; i--) {
             for (int j = 1; j <= i; j++) {
                 System.out.print('*');
             }
             for (int j = 1; j <= 2 * (n - i); j++) {
                 System.out.print(' ');
             }
             for (int j = 1; j <= i; j++) {
                 System.out.print('*');
             }
             System.out.println(' ');
         }

//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= n; j++) {
//                 if ((i <= n / 2 && (j <= i || j > n - i)) ||
//                         (i > n / 2 && (j <= n - i + 1 || j >= i))) {
//                     System.out.print('*');
//                 } else {
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
     }
}
