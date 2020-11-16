import java.util.Scanner;

public class hw3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] arr= {{-1,100,101,102,103,104},{0,3,1,5,2,5},{1,4,2,1,4,2},{2,5,3,1,2,4},{3,2,1,5,4,4},{4,3,3,4,3,3}};
		
		double[] movie_avg=new double[5]; // 영화별 평균 점수 저장될 배열
		double[] user_avg=new double[5]; // 사용자별 평균 점수 저장될 배열
		double movie_tmp;
		double user_tmp;
		
		for(int i=0;i<5;i++) { // 평균 구하기
			movie_tmp=0;
			user_tmp=0;
			for(int j=0;j<5;j++) {
				movie_tmp+=arr[j+1][i+1];
				user_tmp+=arr[i+1][j+1];
			}
			movie_avg[i]=movie_tmp/5;
			user_avg[i]=user_tmp/5;
		}
		
		//3-1
		System.out.println("3-1)");
		for(int i=0;i<5;i++) {
			System.out.println("영화 "+arr[0][i+1]+"의 평균 평가점수: "+movie_avg[i]+" ");
		}
		for(int i=0;i<5;i++) {
			System.out.println("사용자 "+arr[i+1][0]+"의 평균 평가점수: "+user_avg[i]+" ");			
		}
		
		//3-2
		System.out.println("3-2)");
		Scanner sc=new Scanner(System.in);
		
		System.out.print("영화번호 입력: ");
		int getMovie=sc.nextInt(); // 영화번호 입력
		sc.close();
		
		double[] cartesian=new double[5]; // cartesian[0]->100번 cartesian[1]->101번 ....
		int x=0; //영화번호에 해당하는 '열' 번호 들어갈 변수
		
		for(int j=1;j<arr[0].length;j++) {
			if(arr[0][j]==getMovie)
				x=j;
		}
		
		for(int j=1;j<arr[0].length;j++) { 
			for(int i=1;i<arr.length;i++) {
				if(j==x) // 열 번호가 x와 같다면 큰 값 저장(=입력받은 영화 번호)
					cartesian[j-1]=100;
				else {
					cartesian[j-1]+=Math.pow(arr[i][j]-arr[i][x],2); 
				}
			}
			cartesian[j-1]=Math.sqrt(cartesian[j-1]); // Cartesian distance 계산
			
		}
		int min_mnum=100; // Cartesian distance가 가장 작은 값의 영화 번호 저장할 것임
		
		for(int i=1;i<cartesian.length;i++) {
			if(cartesian[i]<cartesian[min_mnum-100])
				min_mnum=i+100;		
		}
		
		System.out.println("가장 비슷한 영화의 번호: "+min_mnum+"  차이 값: "+cartesian[min_mnum-100]);
	}

}
