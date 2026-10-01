package star_patterns;

import java.sql.SQLOutput;

public class Main {
    static int n = 5;

    public static void main(String[] args) {
        System.out.println("\n01) Solid Square");
        solidSquare();

        System.out.println("\n02) Left-Aligned Triangle");
        leftAlignedTriangle();

        System.out.println("\n03) Inverted Left-Aligned Triangle");
        invertedLeftAlignedTriangle();

        System.out.println("\n04) Right-Aligned Triangle");
        rightAlignedTriangle();

        System.out.println("\n05) Inverted Right-Aligned Triangle");
        invertedRightAlignedTriangle();

        System.out.println("\n06) Pyramid");
        pyramid();

        System.out.println("\n07) Inverted Pyramid");
        invertedPyramid();

        System.out.println("\n08) Diamond");
        diamond();

        System.out.println("\n09) Hollow Square");
        hollowSquare();

        System.out.println("\n10) Hollow Right Triangle");
        hollowRightTriangle();

        System.out.println("\n11) Hollow Inverted Triangle");
        hollowInvertedTriangle();

        System.out.println("\n12) Hollow Pyramid");
        hollowPyramid();

        System.out.println("\n13) Hollow Inverted Pyramid");
        hollowInvertedPyramid();

        System.out.println("\n14) Hollow Diamond");
        hollowDiamond();

        System.out.println("\n15) Half Diamond");
        halfDiamond();

        System.out.println("\n16) Butterfly Pattern");
        butterflyPattern();

        System.out.println("\n17) Hollow Butterfly");
        hollowButterfly();

        System.out.println("\n18) Hourglass");
        hourglass();

        System.out.println("\n19) X Pattern");
        xPattern();

        System.out.println("\n20) Plus Pattern");
        plusPattern();

        System.out.println("\n21) Z Pattern");
        zPattern();
    }

//    *****
//    *****
//    *****
//    *****
//    *****
    static void solidSquare() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }

//    *
//    **
//    ***
//    ****
//    *****
    static void leftAlignedTriangle() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }

//    *****
//    ****
//    ***
//    **
//    *
    static void invertedLeftAlignedTriangle() {
        for (int i = 5; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }

//        *
//       **
//      ***
//     ****
//    *****
    static void rightAlignedTriangle() {
        for (int i = 5; i > 0; i--) {
            int count = 1;
            for (int j = 0; j < 5; j++) {
                if(count < i) {
                    System.out.print(' ');
                } else {
                    System.out.print('*');
                }
                count++;
            }
            System.out.println();
        }
    }

//    *****
//     ****
//      ***
//       **
//        *
    static void invertedRightAlignedTriangle() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(' ');
            }
            for (int j = 0; j < 5 - i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
    
//        *
//       ***
//      *****
//     *******
//    *********
    static void pyramid() {
        for (int i = 5; i > 0; i--) {
            for (int j = 1; j < i; j++) {
                System.out.print(' ');
            }
            for (int j = 0; j < 11 - 2 * i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }

//    *********
//     *******
//      *****
//       ***
//        *
    static void invertedPyramid() {
        for (int i = 5; i > 0; i--) {
            for (int j = 0; j < 5 - i; j++) {
                System.out.print(' ');
            }
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }

//        *
//       ***
//      *****
//     *******
//    *********
//     *******
//      *****
//       ***
//        *
    static void diamond() {
        for (int i = 0; i < 5; i++) {
            for (int j = 1; j < 5 - i; j++) {
                System.out.print(' ');
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
        for (int i = 4; i > 0; i--) {
            for (int j = 0; j < 5 - i; j++) {
                System.out.print(' ');
            }
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }

//    *****
//    *   *
//    *   *
//    *   *
//    *****
    static void hollowSquare() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if(i > 0 && i < 4 && j > 0 && j < 4) {
                    System.out.print(' ');
                } else {
                    System.out.print('*');
                }
            }
            System.out.println();
        }
    }

//    *
//    **
//    * *
//    *  *
//    *****
    static void hollowRightTriangle() {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if(i == n || j == 1 || j == i) {
                    System.out.print('*');
                } else {
                    System.out.print(' ');
                }
            }
            System.out.println();
        }
    }

//    *****
//    *  *
//    * *
//    **
//    *
    static void hollowInvertedTriangle() {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= n - i; j++) {
                if(i == 1 || j == 0 || j == n - i) {
                    System.out.print('*');
                } else {
                    System.out.print(' ');
                }
            }
            System.out.println();
        }
    }

//        *
//       * *
//      *   *
//     *     *
//    *********
    static void hollowPyramid() {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(' ');
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                if(i == n || j == 1 || j == 2 * i - 1) {
                    System.out.print('*');
                } else {
                    System.out.print(' ');
                }
            }
            System.out.println();
        }
    }

//    *********
//     *     *
//      *   *
//       * *
//        *
    static void hollowInvertedPyramid() {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(' ');
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                if(i == n || j == 1 || j == 2 * i - 1) {
                    System.out.print('*');
                } else {
                    System.out.print(' ');
                }
            }
            System.out.println();
        }
    }

//        *
//       * *
//      *   *
//     *     *
//    *       *
//     *     *
//      *   *
//       * *
//        *
    static void hollowDiamond() {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(' ');
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (j == 1 || j == 2 * i - 1) {
                    System.out.print('*');
                } else {
                    System.out.print(' ');
                }
            }
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(' ');
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (j == 1 || j == 2 * i - 1) {
                    System.out.print('*');
                } else {
                    System.out.print(' ');
                }
            }
            System.out.println();
        }
    }

//    *
//    **
//    ***
//    ****
//    *****
//    ****
//    ***
//    **
//    *
    static void halfDiamond() {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }

//    *        *
//    **      **
//    ***    ***
//    ****  ****
//    **********
//    ****  ****
//    ***    ***
//    **      **
//    *        *
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
            System.out.println();
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
            System.out.println();
        }
    }

//    *      *
//    **    **
//    * *  * *
//    *  **  *
//    *  **  *
//    * *  * *
//    **    **
//    *      *
    static void hollowButterfly() {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                if (j == 1 || j == i - 1) {
                    System.out.print('*');
                } else {
                    System.out.print(' ');
                }
            }
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(' ');
            }
            for (int j = 1; j < i; j++) {
                if (j == 1 || j == i - 1) {
                    System.out.print('*');
                } else {
                    System.out.print(' ');
                }
            }
            System.out.println();
        }
        for (int i = n; i > 1; i--) {
            for (int j = 1; j < i; j++) {
                if (j == 1 || j == i - 1) {
                    System.out.print('*');
                } else {
                    System.out.print(' ');
                }
            }
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(' ');
            }
            for (int j = 1; j < i; j++) {
                if (j == 1 || j == i - 1) {
                    System.out.print('*');
                } else {
                    System.out.print(' ');
                }
            }
            System.out.println();
        }
    }

//    *********
//     *******
//      *****
//       ***
//        *
//       ***
//      *****
//     *******
//    *********
    static void hourglass() {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(' ');
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(' ');
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }

//    *   *
//     * *
//      *
//     * *
//    *   *
    static void xPattern() {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == j || j == n - i + 1) {
                    System.out.print('*');
                } else {
                    System.out.print(' ');
                }
            }
            System.out.println();
        }
    }

//    *
//    *
//  *****
//    *
//    *
    static void plusPattern() {
        int mid = n / 2 + 1;

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == mid || j == mid) {
                    System.out.print('*');
                } else {
                    System.out.print(' ');
                }
            }
            System.out.println();
        }
    }

//    *****
//       *
//      *
//     *
//    *****
    static void zPattern() {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == n - i + 1) {
                    System.out.print('*');
                } else {
                    System.out.print(' ');
                }
            }
            System.out.println();
        }
    }
}
