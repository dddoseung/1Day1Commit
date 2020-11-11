import java.util.*;

class a{
    int n; // 입체기동장치의 식별번호
    int num; // 입체기동장치 가스 보유량
} // ->입체기동장치 객체 

public class Main{
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int count=sc.nextInt(); //3
    
    a arr[]=new a[count]; // 객체 a의 인스턴스(배열) arr[]
    
    for(int i=0;i<count;i++){
        a tmp=new a();
        tmp.n=sc.nextInt();
        tmp.num=sc.nextInt();
        
        arr[i]=tmp;
    }

    for(int j=0;j<arr.length-1;j++){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i].n>arr[i+1].n){
                a tmp2=arr[i]; 
                //arr[i]이 인스턴스이므로 tmp2도 인스턴스여야 함
                arr[i]=arr[i+1];
                arr[i+1]=tmp2;
            }
        }
    }
    for(int i=0;i<arr.length;i++){
        System.out.println(arr[i].n+" "+arr[i].num);
    }
    
    }
}

