package JavaPractices;

public class SortedArray {
    public static void main(String[] args)
        {
            int arr[] = { 1, 1, 2, 2,3,3,4,50,50,65,65 };int XOR = 0;
            for (int j : arr) XOR = XOR ^ j;
            System.out.println("The element that appears only once: "+ XOR);

        }
    }

