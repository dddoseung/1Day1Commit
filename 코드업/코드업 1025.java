import java.util.Scanner;

public class Main{
    public static void func1(int val,int p){
        int a=(val/p)*p;
        System.out.println("["+a+"]");
    
        val=val-a;
        if(val!=0){
            func1(val,p/10);
        }
        else{
            return;
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int val=sc.nextInt(); //scanner를 정수형으로 받음 
        //75524
        func1(val,10000);
    }
}

