import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

// 데이터의 개수가 많아져서 기존 메모이제이션 방법은 시간초과가 남
// 그러므로 "이분탐색&lower_bound"라는 알고리즘을 사용해야 함
// c++은 lower_bound의 함수가 있는데 java는 없어서 직접 구현해줘야 함

//알고리즘의 진행은 다음과 같다.
//리스트를 생성하고(C++에서는 벡터) 최솟값 하나를 넣어둔다.
//입력받은 수 x와 벡터의 끝값 back을 비교해서 
//x가 더 크다면 push back 하고 
//길이 변수 cnt를 1 증가시킨다.
//x가 더 작거나 같다면 lower bound를 찾고 
//그 위치에 x를 넣는다.

public class Q12015 {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        List<Integer> list = new ArrayList<>();
        list.add(0);

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for(int i = 0 ; i < n; i++) {
            int value = arr[i] = Integer.parseInt(st.nextToken());
            if(value > list.get(list.size() - 1)) list.add(value);
            else{
                int left = 0;
                int right = list.size() - 1;

                while(left < right){
                    int mid = (left + right) >> 1;
                    if(list.get(mid) >= value){
                        right = mid;
                    }else{
                        left = mid + 1;
                    }
                }
                list.set(right, value);
            }
        }
        System.out.println(list.size() - 1);
    }

}
