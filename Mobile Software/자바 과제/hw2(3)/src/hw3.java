import java.util.Scanner;

public class hw3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] arr= {{-1,100,101,102,103,104},{0,3,1,5,2,5},{1,4,2,1,4,2},{2,5,3,1,2,4},{3,2,1,5,4,4},{4,3,3,4,3,3}};
		
		double[] movie_avg=new double[5]; // ��ȭ�� ��� ���� ����� �迭
		double[] user_avg=new double[5]; // ����ں� ��� ���� ����� �迭
		double movie_tmp;
		double user_tmp;
		
		for(int i=0;i<5;i++) { // ��� ���ϱ�
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
			System.out.println("��ȭ "+arr[0][i+1]+"�� ��� ������: "+movie_avg[i]+" ");
		}
		for(int i=0;i<5;i++) {
			System.out.println("����� "+arr[i+1][0]+"�� ��� ������: "+user_avg[i]+" ");			
		}
		
		//3-2
		System.out.println("3-2)");
		Scanner sc=new Scanner(System.in);
		
		System.out.print("��ȭ��ȣ �Է�: ");
		int getMovie=sc.nextInt(); // ��ȭ��ȣ �Է�
		sc.close();
		
		double[] cartesian=new double[5]; // cartesian[0]->100�� cartesian[1]->101�� ....
		int x=0; //��ȭ��ȣ�� �ش��ϴ� '��' ��ȣ �� ����
		
		for(int j=1;j<arr[0].length;j++) {
			if(arr[0][j]==getMovie)
				x=j;
		}
		
		for(int j=1;j<arr[0].length;j++) { 
			for(int i=1;i<arr.length;i++) {
				if(j==x) // �� ��ȣ�� x�� ���ٸ� ū �� ����(=�Է¹��� ��ȭ ��ȣ)
					cartesian[j-1]=100;
				else {
					cartesian[j-1]+=Math.pow(arr[i][j]-arr[i][x],2); 
				}
			}
			cartesian[j-1]=Math.sqrt(cartesian[j-1]); // Cartesian distance ���
			
		}
		int min_mnum=100; // Cartesian distance�� ���� ���� ���� ��ȭ ��ȣ ������ ����
		
		for(int i=1;i<cartesian.length;i++) {
			if(cartesian[i]<cartesian[min_mnum-100])
				min_mnum=i+100;		
		}
		
		System.out.println("���� ����� ��ȭ�� ��ȣ: "+min_mnum+"  ���� ��: "+cartesian[min_mnum-100]);
	}

}
