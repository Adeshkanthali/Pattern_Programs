package PatternPractice;

public class LeftHalfPyramid {
    public static void main(String[] args) {

        int n = 5;

        for (int i=1; i<=n; i++){

            for (int j=n; j>i; j--){
                System.out.print("  ");     // two spaces
            }

            for (int k=1; k<=i; k++){
                System.out.print(" *");    // one space before star
            }

            System.out.println();
        }

    }
}

/*
OUTPUT :-
         *
       * *
     * * *
   * * * *
 * * * * *
*/
