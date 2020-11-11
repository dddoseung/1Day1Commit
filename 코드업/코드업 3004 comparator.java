import java.util.*;

class a implements Comparable<a>{ ////
     int n; 
     int s; 
     int index; // 0 1 2 3 4
    
    @Override ///
    public int compareTo(a A){
        if(this.n<A.n)
            return -1;
        else if(this.n==A.n)
            return 0;
        else
            return 1;
    }

}

public class Main{
    public static void main(String[] args){
 
        class sCompare implements Comparator<a>{ /// 임의로 정렬 만들기
            
            @Override
            public int compare(a a1, a a2){
                if(a1.s<a2.s)
                    return -1;
                else if(a1.s==a2.s)
                    return 0;
                else
                    return 1;
        }
        }
        
        Scanner sc=new Scanner(System.in);
        int count=sc.nextInt(); //5
        
        a[] arr=new a[count];
        
        for(int i=0;i<count;i++){
            a tmp=new a();
            tmp.n=sc.nextInt();
            tmp.s=i;
            tmp.index=i;
            
            arr[i]=tmp;
        }
   
        Arrays.sort(arr);

        int bonus=0;
        
        for(int i=0;i<arr.length;i++){
            arr[i].index=bonus;
            bonus++;
        }
   
        Arrays.sort(arr,new sCompare()); ////문법
        
        for(a A:arr){
            System.out.print(A.index+" ");
        }
    }
}


