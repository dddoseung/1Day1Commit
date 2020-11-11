import java.io.*;
 //��������

public class Q2630 {
    private static boolean[][] board;
    private static int white=0;
    private static int blue=0;
 
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); // �ʱⰪ: 8
        board = new boolean[n][n];
        
        for(int i = 0; i < n; i++) {
            String[] line = br.readLine().split(" ");
            for(int j = 0; j < line.length; j++) {
                board[i][j] = line[j].equals("1");
                	//1�̸�(=blue��) true, 0�̸�(=white��) false
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
            return; //***����Լ�(=��������) ����***
        }
        
        boolean sameColor = true;
        boolean color = board[y][x]; // �ϳ��� ��� �� �ϳ��� Ÿ�ϻ��� ����(T or F)
        loop: for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(board[y+i][x+j] != color) { // Ž�� �� �ٸ� ���� ������
                    sameColor = false;
                    break loop;
                }
            }
        }
        
        // �ϳ��� ������� ���� ���� ��� ���� ���̸�
        if(sameColor==true) {
            if(board[y][x]) {
                blue++;
            } else {
                white++;
            }
            return; //****����Լ�(=��������) ����*****
        }
        
        // n=1�� �ƴϰ�, ��� ���� ���� �ƴ϶��-> �������� ���
        n = n/2; 
        divide(x, y, n); // divide(0,0,4)
        divide(x+n, y, n); // divide(4,0,4)
        divide(x, y+n, n); // divide(0,4,4)
        divide(x+n, y+n, n); // divide(4,4,4)
        					//**����**
        					//��, n=8���� n=4�� 4���� �ɰ���. 
        					//�׷� ���� 4���� �� n=2�� 4���� �ɰ���(x4)
        					//�� �ٽ� ���� 16���� �� n=1�� 4���� �ɰ���(x4)
    }
}