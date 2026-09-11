public class pattern {
    public static void main(String[] args) {
        //Question 1:
        int n = 5;
        for(int row=1; row <= n; row++) {
            //for each row -> spaces, stars
            //spaces
            for(int col=1; col <= n-row; col++) {
                System.out.print(" ");
            }

            //stars
            for(int col=1; col <= n; col++) {
                System.out.print("* ");
            }
            //move to next row
            System.out.println();
        }

        //question 2:
        // int n = 5;
        // for(int row=1; row <= n; row++) {
        //     //for each row -> variable columns
        //     for(int col=1; col <= n-row+1; col++) {
        //         System.out.print("* ");
        //     }
        // //move to next row
        // System.out.println();
        // }

        //question 3:
        // int n = 5;
        // for(int row=1; row <= n; row++) {
        //     //for each row -> variable columns
        //     //spaces
        //     for(int col=1; col <= n-row; col++) {
        //         System.out.print("  ");
        //     }

        //     //stars
        //     for(int col=1; col <= 2*row-1; col++) {
        //         System.out.print("* ");
        //     }

        //     //move to next row
        //     System.out.println();
        // }

        //question 4:
        //       *
        //     *   *
        //   *       *
        // *           *
        //   *       *
        //     *   *
        //       *


    





    }
}
