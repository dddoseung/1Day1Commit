import java.util.*;

public class Main{
    
    static int start=1; 
    //static: 클래스의 모든 객체에 공통으로 사용됨

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt(); //10
        sc.close();

        func(num);
    }
    public static void func(int n){
        if(start<=n){
            System.out.println(start);
            start++;
            func(n);
        }
        else{
        }
    }
}
