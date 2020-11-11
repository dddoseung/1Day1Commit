import java.util.*;

public class Main{
    
    static int r,c; // 행, 열
    static int[][] pascal=new int[50][50];
    
    public static void main(String[] args){
        
        Scanner sc=new Scanner(System.in);
        r=sc.nextInt();
        c=sc.nextInt();
        
        for(int i=0;i<50;i++){ //행 돌기
            for(int j=0;j<50;j++){ //열 돌기
                if(i==0||j==0){
                    pascal[i][j]=1;
                }
                else{
                    pascal[i][j]=(pascal[i-1][j]+pascal[i][j-1])%100000000;
                    //여기서 100000000을 나눠주는 이유: int형을 벗어나서 음수 나오므로
                }
            }
        } //파스칼 회전변환 값 2차원 배열(pascal)에 입력
        
        int ans=pascal[r-1][c-1];
        
        System.out.println(ans);
        
    }
    
}

