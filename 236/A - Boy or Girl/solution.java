import java.util.*;
 
public class ABoyOrGirl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int[] freq = new int[26];
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i) - 'a'] = 1;
        }
 
        int cnt = 0;
        for (int a : freq) {
            if (a == 1) {
                cnt++;
            }
        }
        if (cnt % 2 == 0) {
            System.out.print("CHAT WITH HER!");
        } else {
            System.out.println("IGNORE HIM!");
        }
    }
}