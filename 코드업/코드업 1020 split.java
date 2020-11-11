import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        String str1=sc.nextLine();
        
        String[] str2=str1.split("-");
        
        System.out.printf(str2[0]+str2[1]);
    }
}
