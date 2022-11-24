import java.util.Scanner;

public class StringEncrypted {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String string1 = input.next();
        String string2 = input.next();

        for (int i = 0; i < string1.length(); i++)
            for (int j = 0; j < string2.length(); j++) {
                int offset = (int) string2.charAt(j) - (int) 'a' + 1;
                System.out.print((char) ('a' + (string1.charAt(i) - 'a' + offset) % 26));
                i++;
            }
    }
}
    
