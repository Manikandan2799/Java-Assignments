package JavaPractices;

import java.util.Scanner;

public class TwoStrings {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int pairs = input.nextInt();
            while(pairs-- > 0){
                char[] string1 = input.next().toCharArray();
                char[] string2 = input.next().toCharArray();
                int[] common = new int[1000];
                for (char c : string1) common[c]++;
                String result = "NO";
                for (char c : string2)
                    if (common[c] > 0) {
                        result = "YES";
                        break;
                    }
                System.out.println(result);
            }
        }
    }

