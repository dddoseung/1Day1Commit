import java.io.*;
import java.util.*;

public class hw3_1 {

	public static void main(String[] args) throws IOException{
			//try�� �ȿ� ������ ���� ���Ƿ� ���⿡ �ۼ��ؾ� �� (BufferedReader, StringTokenizer, Filewriter, FileInputStream....)
		BufferedReader br1 = new BufferedReader(new FileReader("first.txt"));
		BufferedReader br2 = new BufferedReader(new FileReader("second.txt"));
		StringTokenizer st1=new StringTokenizer(br1.readLine()," ");
		StringTokenizer st2=new StringTokenizer(br2.readLine()," ");
		
		BufferedWriter bw=new BufferedWriter(new FileWriter("third.txt"));
		
		try {
			
			int[] first=new int[10]; // st1�� ��ū(=first.txt�� �����ִ� �������� �迭)
			int i=0;
			
			int[] second=new int[10]; // st2�� ��ū(=second.txt�� �����ִ� �������� �迭)
			int j=0;

			while (st1.hasMoreTokens()) {
				// st1�� st2�� token ������ �����Ƿ� ����
				
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
					bw.write(String.valueOf(c)+" "); // ���Ͽ� '����'�� �Է��ϰ� ���� �� String.valueOf() !!
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
	

