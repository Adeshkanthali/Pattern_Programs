package PatternPractice;

public class Diamond {
    public static void main(String[] args) {

        int n = 5;

        //......................... Upper Part ........................//

        for (int i=1; i<=n; i++){

            for (int j=n; j>i; j--){
                System.out.print("  ");
            }

            for (int j=1; j<=i; j++){
                System.out.print(" *  ");
            }

            System.out.println();
        }

        //......................... Lower Part ........................//

        for (int i=n-1; i>=1; i--){          // for loop start with n-1

            for (int j=n; j>i; j--){
                System.out.print("  ");
            }

            for (int j=1; j<=i; j++){
                System.out.print(" *  ");
            }

            System.out.println();
        }

    }
}


/*
OUTPUT :-

         *
       *   *
     *   *   *
   *   *   *   *
 *   *   *   *   *
   *   *   *   *
     *   *   *
       *   *
         *

*/
