import java.util.*;

public class Main{
    public static void main(String[] args){
        
            /*정수형과 문자형만 된다*/
            
        /*<----------오름차순----------->*/
        String[] fruit=new String[]{"pineapple","apple","orange","banana"};
        // 배열 선언과 명시
        Arrays.sort(fruit);
        
        for(String name:fruit){ //for문 돌릴 때 팁
            System.out.println(name);
        }
        
        /*<----------내림차순----------->*/
        Integer[] num=new Integer[]{1,2,3,4,5};
        // 내림차순 하려면 int->Integer로 바꿔야 함!
        Arrays.sort(num,Collections.reverseOrder());
        
        for(int a:num){
            System.out.println(a);
        }
        
        /*<-------원하는 것만 내림차순-------->*/
        String[] veget=new String[]{"d","z","a","h","q"};
        
        Arrays.sort(veget,1,veget.length-1,Collections.reverseOrder());
        //== veget[1]~veget[3] 
        // 시작점,끝점의 다음값
        for(String b:veget){
            System.out.println(b);
        }
    }
}


    
        
