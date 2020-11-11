import java.util.*;

public class Main{
    public static void main(String[] args){
        
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        StringTokenizer st=new StringTokenizer(str," ");
        
        int[] arr=new int[100];
        int i=0;
        
        while(st.hasMoreTokens()){
            arr[i]=Integer.parseInt(st.nextToken());
            if(arr[i]!=0){
                System.out.println(arr[i]);
            }
            else{
                break;
            }
            i++;
        }
        
        
        
        
        
    }
}

