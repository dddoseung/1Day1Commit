import java.util.*;

public class Main{
    
    static int r; //원하는 위치의 행
    static int c; //원하는 위치의 열
    static int[][] arr=new int[51][51]; ///저장할 2차원 배열(*사이즈 [r+1][c+1]로 하면 오류남)
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        r=sc.nextInt();
        c=sc.nextInt();
        
        System.out.println(pascal(r,c));
        
    }
    public static int pascal(int r, int c){
        if(r==1||c==1){
            arr[r][c]=1;
            return 1;
        }
        else if(arr[r][c]!=0){
            return arr[r][c];
        }
        else{
            arr[r][c]=(pascal(r-1,c)+pascal(r,c-1))%100000000;
            return arr[r][c];
        }
    }
    
}

