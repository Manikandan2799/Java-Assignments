package JavaPractices;

import java.util.LinkedList;

public class NextGreaterNodeLinkedList {

        public static void main(String[] args) {
            LinkedList<Integer> l=new LinkedList<Integer>();

            int[] a = { 2,7,4,3,5};
            for(int x:a)
            {
                l.add(x);
            }
            int n = l.size();
            int max = 0;
            int[] a1 = new int[n];
            for (int i = 0; i < n - 1; i++) {
                max = l.get(i);
                for (int j = i + 1; j < n; j++)
                    if (max < l.get (j)) {
                        max = l.get (j);
                    }
                if (max != l.get(i))
                    a1[i] = max;
                else
                    a1[i] = 0;
            }
            a1[n - 1] = 0;
            for (int x : a1) System.out.print (x + ",");



        }

    }

