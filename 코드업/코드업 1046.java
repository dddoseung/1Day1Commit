import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        int sum=0;
        for(int i=0;i<3;i++){
            sum+=sc.nextInt();
        }
        sc.close();
        
        System.out.format("%d\n%.1f",sum,(float)sum/3);
    }
}
