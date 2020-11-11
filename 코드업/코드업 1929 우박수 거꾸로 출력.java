import java.util.*;

public class Main{
    
    static ArrayList list=new ArrayList(); //출력을 위해 만든 리스트
    static int Otmp, Etmp;
    
    public static void main(String[] args){
        
        Scanner sc=new Scanner(System.in); 
        int num=sc.nextInt(); //5
        
        list.add(num);
        func(num);
        getfunc(list.size()-1);
    }
    public static int func(int num){
        if(num==1){
            return 0; //1이면 끝냄
        }
        else if(num%2==0){ //짝수이면
            Etmp=num/2;
            list.add(Etmp);
            return func(Etmp);
        }
        else if(num%2!=0){ //홀수이면
            Otmp=3*num+1;
            list.add(Otmp);
            return func(Otmp);
        }
        else{
            return -1;
        }
    }
    
    public static int getfunc(int a){
        if(a<0){
            return 0;
        }
        else{
            System.out.println(list.get(a));
            return getfunc(a-1);
        }
    }

}


