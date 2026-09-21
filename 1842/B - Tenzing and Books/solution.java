import java.io.*;
import java.util.*;
 
public class codeforces16 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();
 
        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());
 
            int[] a = readArray(br, n);
            int[] b = readArray(br, n);
            int[] c = readArray(br, n);
 
            int result = 0;
            result |= prefixOr(a, x);
            result |= prefixOr(b, x);
            result |= prefixOr(c, x);
 
            sb.append(result == x ? "Yes" : "No").append('
');
        }
 
        System.out.print(sb);
    }
 
    static int[] readArray(BufferedReader br, int n) throws IOException {
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(st.nextToken());
        return arr;
    }
 
    // OR together the top prefix of `stack`, stopping at the first
    // book that isn't a submask of x (i.e., has a bit x doesn't have).
    static int prefixOr(int[] stack, int x) {
        int knowledge = 0;
        for (int v : stack) {
            if ((v | x) != x) break; // this book has a bit outside x — can't read it
            knowledge |= v;
        }
        return knowledge;
    }
}