import java.util.*;

public class Main{
    
    static int tmp;
    static ArrayList list=new ArrayList(); //출력을 위해 만든 리스트
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt(); //7
        
        func(num);
        getfunc(list.size()-1);
        
    }
    public static int func(int num){ //리스트에 저장
        if(num==0){
            list.add(0);
            return 0;
        }
        else if(num==1){
            list.add(1);
            return -1;
        }
        else{
            tmp=num%2;
            list.add(tmp);
            return func(num/2);
        }
    }
    public static int getfunc(int a){ // 리스트의 길이만큼 출력
    
        if(a<0){
            return -1;
        }
        else{
            System.out.print(list.get(a));
            return getfunc(a-1);  //거꾸로 출력
        }
        
    }

}

