


import java.util.Scanner;
public class J01019_tinhluythua {

    public static Scanner sc = new Scanner(System.in);
    public static final int MOD = (int) (1e9 + 7);
    
    public static long pow(long a,long b)
    {
        if(b==0)
        {
            return 1;
        }
        if(b==1)
        {
            return a % MOD;
        }
        long tmp = pow(a, b/2);
        if(b%2==0)
        {
            return(tmp * tmp) % MOD;
        }
        else{
            return (((tmp * tmp) % MOD) * a) % MOD;
        }
    }
    
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        
        while(true)
        {
            long a = sc.nextLong();
            long b = sc.nextLong();
            if(a ==0 && b==0)
            {
                return;
            }else{
                System.out.println(pow(a, b));
            }
            
        }
    }
    
}
