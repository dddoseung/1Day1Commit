import java.io.*;
 //분할정복

public class Q2630 {
    private static boolean[][] board;
    private static int white=0;
    private static int blue=0;
 
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); // 초기값: 8
        board = new boolean[n][n];
        
        for(int i = 0; i < n; i++) {
            String[] line = br.readLine().split(" ");
            for(int j = 0; j < line.length; j++) {
                board[i][j] = line[j].equals("1");
                	//1이면(=blue면) true, 0이면(=white면) false
            }
        }
 
        divide(0, 0, n);
 
        System.out.println(white);
        System.out.println(blue);
    }
 
    private static void divide(int x, int y, int n) {
        if(n == 1) {
            if(board[y][x]) {
                blue++;
            } else {
                white++;
            }
            return; //***재귀함수(=분할정복) 종료***
        }
        
        boolean sameColor = true;
        boolean color = board[y][x]; // 하나의 등분 중 하나의 타일색을 정함(T or F)
        loop: for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(board[y+i][x+j] != color) { // 탐색 중 다른 색이 있으면
                    sameColor = false;
                    break loop;
                }
            }
        }
        
        // 하나의 등분으로 나눈 것이 모두 같은 색이면
        if(sameColor==true) {
            if(board[y][x]) {
                blue++;
            } else {
                white++;
            }
            return; //****재귀함수(=분할정복) 종료*****
        }
        
        // n=1도 아니고, 모두 같은 색도 아니라면-> 분할정복 계속
        n = n/2; 
        divide(x, y, n); // divide(0,0,4)
        divide(x+n, y, n); // divide(4,0,4)
        divide(x, y+n, n); // divide(0,4,4)
        divide(x+n, y+n, n); // divide(4,4,4)
        					//**원리**
        					//즉, n=8에서 n=4로 4개로 쪼개짐. 
        					//그럼 각각 4개는 또 n=2로 4개로 쪼개짐(x4)
        					//또 다시 각각 16개는 또 n=1로 4개로 쪼개짐(x4)
    }
}