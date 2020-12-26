import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

// 데이터의 개수가 많아져서 기존 메모이제이션 방법은 시간초과가 남
// 그러므로 "이분탐색&lower_bound"라는 알고리즘을 사용해야 함
// c++은 lower_bound의 함수가 있는데 java는 없어서 직접 구현해줘야 함

public class Q12015 {

	static List<Integer> list = new ArrayList<>();
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		list.add(0); // 비교를 위해 0을 미리 넣어줌
		
		for(int i=0;i<N;i++) {
			int value = Integer.parseInt(st.nextToken());
			
			if(value>list.get(list.size()-1)) {
				list.add(value);
			}
			else {
				int low=0;
				int high=list.size()-1;
				
				while(low<high) { // 이분탐색
					int mid=(low+high)/2;
					
					if(value<=list.get(mid)) {
						high = mid;
					}
					else {
						low=mid+1;
					}
				}
				list.set(high, value);
			}
		}
		
		System.out.println(list.size()-1); // 0은 제외
	}

}
