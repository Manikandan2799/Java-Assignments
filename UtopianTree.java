package JavaPractices;

import java.util.Scanner;

public class UtopianTree {
    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);

            int t = in.nextInt();

            for(int i=0;i<t;i++){
                int n = in.nextInt();
                int k = 1;
                for(int j=0;j<n;j++)
                    if (j % 2 == 0) {
                        k *= 2;
                    } else k++;
                System.out.println(k);
            }
        }
    }
}
