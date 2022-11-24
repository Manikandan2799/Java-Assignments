import java.util.Scanner;

public class SnakePattern {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int n = input.nextInt();
            int m = 1, l = n * 2;
            for (int i = 1; i <= n; i++) {
                for (int k = 1; k < n + 1 - i; k++) System.out.print(" " + "   ");
                if (i % 2 != 0) {
                    for (int j = n; j <= (n * 2) - 1; j++) System.out.print(m++ + "    ");
                    m = l + 1;
                } else {
                    for (int j = n; j <= (n * 2) - 1; j++) System.out.print(l-- + "    ");
                    l = n * 4;
                }
                System.out.println();
            }
        }
    }

Input : 5
output             1    2    3    4    5    
            10    9    8    7    6    
        11    12    13    14    15    
    20    19    18    17    16    
21    22    23    24    25    
