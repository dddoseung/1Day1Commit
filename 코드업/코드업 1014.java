import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        char x=sc.next().charAt(0); //문자 입력은 이렇게
        char y=sc.next().charAt(0);
        
        System.out.printf("%c %c",y,x);
    }
}
