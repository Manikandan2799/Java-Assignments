package JavaPractices;

import java.util.Scanner;

public class ViralAdvertising {
        public static void main(String[] args) {
            var inputdays = new Scanner(System.in);
            int days = inputdays.nextInt();
            int customer = 5,likes = 0;
            for (int i = 0; i < days; i++) {
                customer /= 2;
                likes += customer;
                customer *= 3;
            }
            System.out.println(likes);
        }

    }

