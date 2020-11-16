import java.io.*;
import java.util.*;

public class hw3_1 {

	public static void main(String[] args) throws IOException{
			//try문 안에 있으면 에러 나므로 여기에 작성해야 함 (BufferedReader, StringTokenizer, Filewriter, FileInputStream....)
		BufferedReader br1 = new BufferedReader(new FileReader("first.txt"));
		BufferedReader br2 = new BufferedReader(new FileReader("second.txt"));
		StringTokenizer st1=new StringTokenizer(br1.readLine()," ");
		StringTokenizer st2=new StringTokenizer(br2.readLine()," ");
		
		BufferedWriter bw=new BufferedWriter(new FileWriter("third.txt"));
		
		try {
			
			int[] first=new int[10]; // st1의 토큰(=first.txt에 적혀있는 정수들의 배열)
			int i=0;
			
			int[] second=new int[10]; // st2의 토큰(=second.txt에 적혀있는 정수들의 배열)
			int j=0;

			while (st1.hasMoreTokens()) {
				// st1과 st2의 token 개수가 같으므로 가능
				
				first[i]=Integer.parseInt(st1.nextToken());
				i++;
				second[j]=Integer.parseInt(st2.nextToken());
				j++;
								
			}
			br1.close();
			br2.close();
			
			int c=0;
			
			for(int a=0;a<first.length;a++) {
				for(int b=0;b<second.length;b++) {
					if(first[b]==second[a]) {
						c=first[b];
					}
					else {
						continue;
					}
					bw.write(String.valueOf(c)+" "); // 파일에 '정수'를 입력하고 싶을 때 String.valueOf() !!
				}
			}
			bw.close();
		} catch (FileNotFoundException e) {
			System.out.println("Can't open file");
			System.exit(-1);
		}

		catch (IOException e) {
			System.out.println("Can't read file");
			System.exit(-1);
		}
		}

}
	

