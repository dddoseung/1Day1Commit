import java.io.*;
import java.util.*;

public class Q1966 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testcase = Integer.parseInt(br.readLine()); // @1
		while(testcase-- != 0) {
			String[] input = br.readLine().split(" "); // 4 2
			String[] priority_str = br.readLine().split(" "); // 3 5 1 2 (1에대해알고싶음)
			
			// @2
			int n = Integer.parseInt(input[0]); // n=4
			int m = Integer.parseInt(input[1]) + 1; // m=3;
			LinkedList<Integer> priority = new LinkedList<Integer>();
			for(int i=0; i<n; i++) //4번반복
				priority.add(Integer.parseInt(priority_str[i])); // priority = [3, 5, 1, 2]
			int cnt = 0;
			
			// @3
			Queue<Integer> Q = new LinkedList<Integer>();
			for(int i=0; i<n; i++) 
				Q.offer(i+1); // Q = [1, 2, 3, 4]
			 
			boolean isMax; // @4
			for(int i=0; !Q.isEmpty(); ) { // @5
				isMax = true;
				for(int j=i; j<Q.size(); j++) { // @6
					if(priority.get(i) < priority.get(j)) {
						int tmp = priority.poll(); //3
						priority.offer(tmp); // priority=[5, 1, 2, 3]
						tmp = Q.poll(); // 1
						Q.offer(tmp); // Q = [2, 3, 4, 1]
						
						isMax = false;
						break;
					}
				}
				
				// @7
				if(isMax==true) {
					cnt++;
					priority.poll();
					int check = Q.poll();
					if(check == m) {
						System.out.println(cnt);
						break;
					}
				}
			}
		}
	}
}