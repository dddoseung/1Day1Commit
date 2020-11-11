import java.util.*;

        //가장 긴 변 a < 두 변의 합 b+c : a<b+c (조건1)
        //중복되면 안되므로 c<=b<=a (조건2)
        //세 변의 합 = n : a+b+c=n (조건3)
        
public class Main{
    
    static int a,b,c; // a:가장 긴 변, b, c
    static int cnt=0;
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt(); //15 -> 답: 7(7<8(17 26 35 44) 6<9(36 45) 5<10(55))
        
        for(a=1;a<n;a++){
            for(b=1;b<=a;b++){
                c=n-b-a; /////(조건3)
                if(a<b+c && c<=b && b<=a){//(조건1 & 조건2)
                    cnt++;
            }
                }
            }
        
        System.out.println(cnt);
            
    }
    
 }
    



