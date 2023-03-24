import java.util.*;

public class A1103210_0317_1{
    public static void main(String[]argv){
        Scanner myInput = new Scanner(System.in);
        
        System.out.println("請輸入n,m:");
        int n = myInput.nextInt();
        int m = myInput.nextInt();

        myInput.close();

        int[][] mult = new int [n][m];
        
        for(int x = 0 ; x < n ; x++){
            for(int y = 0 ; y < m ; y++){
                mult[x][y] = (x+1)*(y+1);
                }
        }
        for(int[] a : mult){
            for(int b : a){
                System.out.print(b + "\t");
            }
            System.out.println();
        
        }
    }
}