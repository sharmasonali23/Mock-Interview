import java.util.Arrays;
import java.util.Comparator;

public class biggestInteger {
    public static void main(String[] args) {
        int A[] = {3, 30, 34, 5, 9};
        String[] arr = new String[A.length];
        for (int i = 0; i < A.length; i++) {
            arr[i] = String.valueOf(A[i]);
        }


        Arrays.sort(arr, new Comparator<String>() {
            public int compare(String a, String b) {
                return (b + a).compareTo(a + b);
            }
        });


        StringBuilder sb = new StringBuilder();
        for (String s : arr) {
            sb.append(s);
        }

        if (sb.charAt(0) == '0') {     //check if all zeroes are there
            //return String.valueOf(0);
        }

        //return sb.toString();
        System.out.println(sb.toString());
    }

}


