import java.util.Scanner;

/**
 * search
 */
public class search {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of row: ");int r = sc.nextInt();

        System.out.print("Enter size of column: ");int c = sc.nextInt();

        int num[][] = new int[r][c];

        // intput
        System.out.println("Input array value: ");
        for (int i=0; i<r; i++){

            for (int j=0; j<c; j++){

                num[i][j] = sc.nextInt();
            }
            System.out.println();
        }

        // store no to check or compare array value
        System.out.print("Enter value to Search in Array: ");int x = sc.nextInt();

        // compare value
        int y = 0;
        for (int i=0; i<r; i++){

            for (int j=0; j<c; j++){

                if ( x == num[i][j] ){
                    y = 1;
                    System.out.println(x + " is store in Array Value which position: ( " + i +" , " + j+" )");
                }
            }
        }
        
        if ( y == 0 ){
            System.out.println(x + " is not store in Array Value ");
        }

    }
}