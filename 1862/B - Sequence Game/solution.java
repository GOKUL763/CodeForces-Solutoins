import java.util.*;
 
public class Main {
	public static void main( String[] agrs ) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while( t-- > 0 ) {
            int n = sc.nextInt();
            List<Integer> a = new ArrayList<>();
            List<Integer> b = new ArrayList<>();
 
            for(int i=0;i<n;i++) {
                b.add(sc.nextInt());
            }
 
            for(int i=0;i<n;i++){
                if(i==0 || b.get(i)>= b.get(i-1)) {
                    a.add(b.get(i));
                } else {
                    a.add(b.get(i));
                    a.add(b.get(i));
                }
            }
 
            System.out.println(a.size());
            for(int num : a){
                System.out.print(num + " ");
            }
            System.out.println();
 
        }
    }
}