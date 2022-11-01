package JavaPractices;

import java.util.HashSet;
import java.util.Scanner;
public class WeightedUniformStrings{
    public static void main(String[] args) {
        var in = new Scanner(System.in);
        String s = in.next();
        int n = in.nextInt();
        HashSet map = new HashSet();
        int i=0, j, current;

        while (i < s.length()) {
            j = i;
            current = 0;
            while (j < s.length() && s.charAt(j) == s.charAt(i)) {
                curr += s.charAt(j++) - 'a' + 1;
                map.add(current);
            }
            i = j;
        }
        for(int a0 = 0; a0 < n; a0++){
            int new = in.nextInt();
            if (map.contains(new))
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }
}

