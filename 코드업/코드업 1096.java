import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int arr[][] = new int[19][19];
        int count=sc.nextInt();
        
        for(int i=0;i<count;i++){
            int x=sc.nextInt();
            int y=sc.nextInt();
            if(arr[x-1][y-1]==0)
                arr[x-1][y-1]+=1;
            else
                continue;
        }
        for(int i=0;i<arr.length;i++){ //열의 길이
            for(int j=0;j<arr[i].length;j++){ //행의 길이
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("");
        }
    }
}


    
        
