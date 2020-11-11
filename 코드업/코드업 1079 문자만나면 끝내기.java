import java.util.*;

public class Main{
    public static void main(String[] args){
        
        Scanner sc=new Scanner(System.in);
        

        while(sc.hasNext()){
            char ch=sc.next().charAt(0); //String으로 하면 break 안먹음;;
            
            if(ch=='q'){
                System.out.println(ch);break;
            }
            else{
                System.out.println(ch);
                
            }

        }

    }
}


