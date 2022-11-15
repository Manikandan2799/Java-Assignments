import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class RepeatedSubSequences {
        static List<String> list = new ArrayList<>();

        public static void main(String[] args) {
            String str = "XYBYAXBY";  //XYBYAXBY
            String s = "";
            subsequences(str, s);
            System.out.println(list);
            HashSet<String> set=new HashSet<>();
            for (String value : list) {
                int n = value.length();
                int m = value.length() / 2;
                String s1,s2;
                if (n % 2 == 0) {
                    s1 = value.substring(0, m);
                } else {
                    s1 = value.substring(0, m + 1);
                }
                s2 = value.substring(m, n);
                if (s1.equals(s2)) set.add(s1);
            }
            System.out.println(set);
            System.out.println(set.size());
        }

        public static void subsequences (String str, String s){
            {
                if (str.length() == 0) {
                    if(s.length()>2)
                        list.add(s);
                    return;
                }
                subsequences(str.substring(1), s + str.charAt(0));
                subsequences(str.substring(1), s);
            }
        }
    }




