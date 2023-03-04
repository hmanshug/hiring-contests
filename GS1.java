package hiring.contest;

import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class GS1 {

    static String feeOrUpfront(int n, int k, int x, int d, int[] p) {
        // Complete this function
        double sum=0.0;
        for(int i=0; i<n; ++i) {
            sum+=Math.max(k/1.0, (x*p[i])/100.0);
            
        }
        System.out.println("=="+sum);
        return (sum>(float)d)?"upfront":"fee";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            int n = in.nextInt();
            int k = in.nextInt();
            int x = in.nextInt();
            int d = in.nextInt();
            int[] p = new int[n];
            for(int p_i = 0; p_i < n; p_i++){
                p[p_i] = in.nextInt();
            }
            String result = feeOrUpfront(n, k, x, d, p);
            System.out.println(result);
        }
        in.close();
    }
}
