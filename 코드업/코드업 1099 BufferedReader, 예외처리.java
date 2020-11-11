import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{ //예외처리 안하면 컴파일 에러 남

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        /* BufferedReader는 enter만 경계로 인식함 , 
           String형으로 고정 , 
           대량 데이터 입력 받을 시 유리*/

        try{
            int[][] arr=new int[10][10];
            
            for(int i=0;i<arr.length;i++){
                String[] y=br.readLine().split(" ");  //한 줄씩 받고 " "로 잘라서 넣음
                for(int j=0;j<arr[i].length;j++){
                    arr[i][j]=Integer.parseInt(y[j]);
                }
            }
            int x=1; //개미 시작점
            int y=1; //개미 시작점
            
            while(x<arr.length && y<arr.length){
                if(arr[x][y]==0){
                    arr[x][y]=9;
                    y++;
                }
                else if(arr[x][y]==1){
                    x++;
                    y--;
                }
                else{
                    arr[x][y]=9;
                    break;
                }
            }
            
            for(int i=0;i<arr.length;i++){
                for(int j=0;j<arr[i].length;j++){
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println("");
            }
        }
        catch(NumberFormatException e){
            e.printStackTrace();
        }
    }
}
