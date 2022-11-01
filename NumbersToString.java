package JavaPractices;
import java.util.Scanner;
public class NumberToString {
    public static void main(String[] args) {
        System.out.print ("Enter The Number: ");
        Scanner input = new Scanner (System.in);
        int value = input.nextInt ( );
        int onesDigit,tensDigit,hundredsDigit;

        String[] ones = {" ", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
                "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};

        String[] tens = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};

        String[] hundreds = {" ", "one hundred", "two hundred", "three hundred", "four hundred", "five hundred",
                "six hundred", "seven hundred", "eight hundred", "nine hundred"};

        if (value < 20) System.out.println ("Words " + ones[value]);
        else if (value < 20 && 100 < value) {
            tensDigit = value % 10;
            onesDigit = value / 10;
            System.out.print ("Words " + tens[tensDigit] + " " + ones[onesDigit]);

        } else {
            hundredsDigit = value / 100;
            tensDigit = (value % 100) / 10;
            onesDigit = (value % 100) % 10;
            System.out.print ("Words " + hundreds[hundredsDigit] + " " + tens[tensDigit] + " " + ones[onesDigit]);
        }
    }
}

