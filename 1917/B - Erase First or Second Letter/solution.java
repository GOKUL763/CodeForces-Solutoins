import java.util.*;
 
public class BEraseFirstOrSecondLetter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
 
        while(t-- > 0) {
            int n = sc.nextInt();
            String str = sc.next();
 
            int cnt = 0 , ans = 0 ;
            boolean[] freq = new boolean[26];
            
            for(int i=0;i<n;i++){
                if( !freq[str.charAt(i)-'a']){
                    freq[str.charAt(i)-'a'] = true;
                    cnt++;
                }
                ans += cnt;
            }
            System.out.println(ans);
        }
    }
}