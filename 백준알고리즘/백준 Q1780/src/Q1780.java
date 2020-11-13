//��������
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q1780 {
    private static int[][] board;
    private static int first=0; // 1
    private static int zero=0; // 0
    private static int last=0; // -1
 
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); // ex) �ʱⰪ: 9
        board = new int[n][n];
        
        for(int i = 0; i < n; i++) {
            String[] line = br.readLine().split(" ");
            for(int j = 0; j < line.length; j++) {
                board[i][j] = Integer.parseInt(line[j]);
            }
        }
 
        divide(0, 0, n);
 
        System.out.println(last);
        System.out.println(zero);
        System.out.println(first);
    }
 
    private static void divide(int x, int y, int n) {
        if(n == 1) {
            if(board[y][x]==0) {
                zero++;
            } else if(board[y][x]==1){
                first++;
            }
            else {
            	last++;
            }
            return; //***����Լ�(=��������) ����***
        }
        
        boolean sameColor = true;
        int color = board[y][x]; // �ϳ��� ��� �� �ϳ��� Ÿ�ϻ��� ����(T or F)
        loop: for(int i = y; i < y+n; i++) {
            for(int j = x; j < x+n; j++) {
                if(board[i][j] != color) { // Ž�� �� �ٸ� ���� ������
                    sameColor = false;
                    break loop;
                }
            }
        }
        
        // �ϳ��� ������� ���� ���� ��� ���� ���̸�
        if(sameColor==true) {
            if(board[y][x]==1) {
                first++;
            } else if(board[y][x]==0) {
                zero++;
            }
            else {
            	last++;
            }
            return; //****����Լ�(=��������) ����*****
        }
        
        // n=1�� �ƴϰ�, ��� ���� ���� �ƴ϶��-> �������� ���
        n = n/3; 
        divide(x, y, n); 
        divide(x+n, y, n);
        divide(x+n+n, y, n);
        divide(x, y+n, n);
        divide(x, y+n+n, n);
        divide(x+n, y+n, n); 
        divide(x+n+n, y+n+n, n); 
        divide(x+n, y+n+n, n); 
        divide(x+n+n, y+n, n); 
    }
}