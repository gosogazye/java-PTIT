
import java.util.*;
import java.io.*;


public class J07076_sapxepmatran {
    public static void main(String[] args) throws FileNotFoundException
    {
        Scanner sc = new Scanner(new File("MATRIX.in"));
        int t = Integer.parseInt(sc.nextLine());
        
        while(t-- >0)
        {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int p = sc.nextInt();
            Vector<Integer> v = new Vector<>();
            int a[][] = new int[n][m];
            for(int i = 0; i < n; i++){
                for(int j = 0; j < m; j++){
                    a[i][j] = sc.nextInt();
                    if(j == p - 1){
                        v.add(a[i][j]);
                    }
                }
            }
            Collections.sort(v);
            for(int i = 0; i < n; i++){
                for(int j = 0; j < m; j++){
                    if(j == p - 1){
                        System.out.print(v.get(i) + " ");
                    }
                    else{
                        System.out.print(a[i][j] + " ");
                    }
                }
                System.out.println();
            }
        }
    }
}
