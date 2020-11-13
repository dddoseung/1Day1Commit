import java.io.*;
 //쿼드트리(분할정복)

public class Q1992 {
	static int[][] board;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine()); //(NxN size)
        board = new int[N][N];
        
        for(int i=0;i<N;i++) {
        	String[] tmp=(br.readLine()).split("");
        	for(int j=0;j<N;j++) {
	        	board[i][j]=Integer.parseInt(tmp[j]);
        	}
        }
        divide(0,0,N);
	}
    
    public static void divide(int row, int col, int N) {
    	if(N==1) {
    		System.out.print(board[row][col]);
    		return;
    	}
    	
    	int color=board[row][col]; // 한 구역에서 한 점의 색을 찍고
    	boolean isFull=true;
    	loop:
    	 for(int i=row;i<row+N;i++) {
    		for(int j=col;j<col+N;j++) {
    			if(color!=board[i][j]) {
    				isFull=false; // 구역에서 다른 색이 발견되면
    				break loop;
    			}
    		}
    	}
    	
    	if(isFull==true) { // 구역이 모두 같은 색이면
    		System.out.print(color);
    		return;
    	}
    	
    	N=N/2;
    	System.out.print("(");
    	divide(row,col,N);
    	divide(row,col+N,N);
    	divide(row+N,col,N);
    	divide(row+N,col+N,N);
    	System.out.print(")");
    }

}
