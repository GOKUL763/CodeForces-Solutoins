import java.util.*;
public class CQuests{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] first = new int[n];
            int[] second = new int[n];
            int [] visited = new int[n];
            Arrays.fill(visited,-1);
 
            for(int i = 0; i < n; i++){
                first[i] = sc.nextInt();
            }
            for(int i = 0; i < n; i++){
                second[i] = sc.nextInt();
            }
 
            int ans = 0;	
            int sum = 0;
            int maxi_b = second[0];
            for(int i = 0 ; i < Math.min(k,n) ; i++){
                sum += first[i];
                maxi_b = Math.max(maxi_b , second[i]);
                ans = Math.max(ans , sum + (k-i-1) * maxi_b);
            }
 
           
            System.out.println(ans);
        }
    }
}