import java.util.*;

public class Main{
    public static void main(String[] args){
        
        Scanner sc=new Scanner(System.in);
        char ans=sc.next().charAt(0); //'B'
        
        switch(ans){ // switch(변수명)
            case 'A': // case 값:
                System.out.println("best!!!");
                break; // 꼭 break!
            case 'B':
                System.out.println("good!!");
                break;
            case 'C':
                System.out.println("run!");
                break;
            case 'D':
                System.out.println("slowly~");
                break;
            default:
                System.out.println("what?");
                break;
        }
    }
}
