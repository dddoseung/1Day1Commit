import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[][] arr=new int[19][19];
        
        for(int i=0;i<19;i++){
            for(int j=0;j<19;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int count=sc.nextInt(); //2
        
        for(int i=1;i<=count;i++){
            int x=sc.nextInt(); //10 12
            int y=sc.nextInt(); //10 12
            
            for(int j=0;j<arr.length;j++){
                if(arr[x-1][j]==0) // !!!!x-1해줘야 함
                    arr[x-1][j]=1;
                else
                    arr[x-1][j]=0;
            }
            for(int z=0;z<arr.length;z++){
                if(arr[z][y-1]==0)
                    arr[z][y-1]=1;
                else
                    arr[z][y-1]=0;
                }
        }
        
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("");
        }

    }
}


    
        
