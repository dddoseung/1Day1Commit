import java.util.Scanner;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        String sc=scanner.nextLine();
        
        StringTokenizer st=new StringTokenizer(sc,".");
        
        int[] arr=new int[3]; //크기가 3인 정수형 배열 선언
        int i=0;
        
        while(st.hasMoreTokens()){
            arr[i]=Integer.parseInt(st.nextToken());
            //int 자료형으로 형변환 후 배열에 저장
            i++;
        }
        System.out.format("%04d.%02d.%02d",arr[0],arr[1],arr[2]);
        }
    }

