
public class hw1 {

	static int[][] answer;
    
	public static void main(String[] args) {
		
		int[][] A={{1,2,3,4},{3,4,5,6}};
		int[][] B= {{1,2,3},{4,5,6},{7,8,9},{1,5,6}};
				
		answer = new int[A.length][B[0].length]; // 행렬 곱을 담는 배열
		
		for(int i=0; i<answer.length;i++){ // 행의 길이만큼
            for(int j=0; j<answer[0].length;j++){ // 열의 길이만큼
                for(int k=0; k<A[0].length;k++){ // A의 열의 길이만큼
                	
                    answer[i][j] += A[i][k]*B[k][j];
                }
            }                       
        }
		
		for(int i=0;i<answer.length;i++) { // 출력
			for(int j=0;j<answer[i].length;j++) {
				System.out.print(answer[i][j]+" ");
			}
			System.out.println();
		}
	}
}
