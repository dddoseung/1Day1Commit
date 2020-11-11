import java.io.*;
import java.util.*;

class q{
	int importance;
	int index;
	
	q(int importance, int index){
		this.importance=importance;
		this.index=index;
	}
}
public class Q1966{
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testcase = Integer.parseInt(br.readLine()); // @1
		while(testcase!= 0) {
			String[] input = br.readLine().split(" "); // 4 2
			String[] priority_str = br.readLine().split(" "); // 3 5 1 2 (1에대해알고싶음)
			
			// @2
			int n = Integer.parseInt(input[0]); // n=4
			int m = Integer.parseInt(input[1]) + 1; // m=3;
			LinkedList<q> priority = new LinkedList<q>();
			for(int i=0; i<n; i++) //4번반복
				priority.add(new q(Integer.parseInt(priority_str[i]),i+1)); // priority = [3, 5, 1, 2]
			int cnt = 0;
			
			boolean isMax; // @4
			
			while(true) { // @5
				isMax = true;
				for(int j=0; j<priority.size(); j++) { // @6
					if(priority.get(0).importance < priority.get(j).importance) {
						q tmp= priority.poll(); //3
						priority.offer(tmp); // priority=[5, 1, 2, 3]
						
						isMax = false;
						break;
					}
				}
				
				// @7
				if(isMax==true) {
					cnt++;
					q tmp2=priority.poll();
					int check = tmp2.index;
					if(check == m) {
						System.out.println(cnt);
						break;
					}
				}
			}
			testcase--;
		}
	}
}