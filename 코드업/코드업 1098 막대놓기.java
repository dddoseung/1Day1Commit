import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[][] arr=new int[sc.nextInt()+1][sc.nextInt()+1]; //6 6
        int count=sc.nextInt(); //3개의 막대가 놓여짐
        
        int[] num_arr=new int[4];

        for(int i=1;i<=count;i++){
            for(int j=0;j<4;j++){
                num_arr[j]=sc.nextInt();
            }
            //l d x y 0 1 2 3
            
            for(int j=0;j<num_arr[0];j++){
                if(num_arr[1]==0){
                    arr[num_arr[2]][num_arr[3]+j]=1;
            }
                else{
                    arr[num_arr[2]+j][num_arr[3]]=1;
                }
            } 
        }
        for(int i=1;i<arr.length;i++){
            for(int j=1;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
                
            }
            System.out.println("");
        }
    }
}


    
        
