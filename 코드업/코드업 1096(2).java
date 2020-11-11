import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        int count=Integer.parseInt(sc.nextLine()); //5
        int[][] arr=new int[19][19];

        for(int i=0;i<count;i++){
            arr[sc.nextInt()-1][sc.nextInt()-1]++;
        }
        for(int j=0;j<arr.length;j++){ //열의 길이
            for(int z=0;z<arr[j].length;z++){ //행의 길이
                if(arr[j][z]>1)
                    arr[j][z]=1;
                System.out.print(arr[j][z]+" ");
            }
            System.out.println("");
        }
    }
}


    
        
