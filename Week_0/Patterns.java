package Java_DSA.Week_0;


public class Patterns {
        public static void main(String[] args) {
            pattern28(5);
        }

        static void pattern1(int n) {
            for (int row = 1; row <= n; row++) {
                for (int col = 1; col <= n; col++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }

        static void pattern2(int n) {
            for (int row = 1; row <= n; row++) {
                for (int col = 1; col <= row; col++) {
                    System.out.print("* ");
                }
                System.out.println();
            }

        }

        static void pattern3(int n) {
            for (int row = 1; row <= n; row++) {
                for (int col = n; col >= row; col--) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }

        static void pattern4(int n) {
            for (int row = 1; row <= n; row++) {
                for (int col = 1; col <= row; col++) {
                    System.out.print(col + " ");
                }
                System.out.println();
            }

        }

        static void pattern5(int n){
            for (int row = 0; row < (2*n) ; row++) {
                int c = row > n ? 2 * n - row : row;
                for (int col = 0; col < c  ; col++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }

        static void pattern28(int n){
            for (int row = 0; row < (2*n) ; row++) {
                int c = row > n ? 2 * n - row : row;

                int noOfSpaces = n - c;
                for (int spaces = 0; spaces < noOfSpaces; spaces++) {
                    System.out.print(" ");
                }

                for (int col = 0; col < c  ; col++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }

}

