import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char ch=sc.next().charAt(0); //'f'
        char st='a';
        do
        {
            System.out.format("%c ",st);
            st+=1;
        }while(st<=ch);
        
    }
}
