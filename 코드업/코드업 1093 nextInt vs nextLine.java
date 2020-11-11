import java.util.*;

public class Main{
    public static void main(String[] args){

        Scanner sc2=new Scanner(System.in);
        String count=sc2.nextLine(); 
        //nextInt가 안되는 이유 : nextInt 와 nextDouble은 엔터 전까지 입력
        //nextLine이 되는 이유 : nextLine은 엔터까지 입력(다음은 다음 줄!)
        String str=sc2.nextLine();
        String[] num=str.split(" ");
        int[] arr=new int[23];
        
        for(int i=0;i<num.length;i++){

            arr[Integer.parseInt(num[i])-1]+=1;
        }
        for(int j=0;j<arr.length;j++){
            System.out.print(arr[j]+" ");
        }
    }
}
