import java.util.Scanner;

public class c {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int Q=sc.nextInt();
        int c=0;
        if (1<=n && n<=100 && 1<=Q && Q<=100) {
            int[] a=new int[n];
            for (int i = 0; i < n; i++) {
                a[i]=sc.nextInt();
            }
            for (int j = 0; j < Q; j++) {
                int l=sc.nextInt();
                int r=sc.nextInt();
                int x=sc.nextInt();
                if (1<=l && l<=r && r<=n) {
                    if (1<=x && x<100) {
                        for (int i = 0; i < n; i++) {
                            if (x<=a[i]) {
                                c++;
                            }
                        }
                        if (r==x || l>x) {
                            c--;
                        }
                    }
                    System.out.println(c);
                    c=0;
                }
            }
        }
    }
}
