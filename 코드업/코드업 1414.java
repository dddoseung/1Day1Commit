import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        try{
            String str=br.readLine(); //"adfacdgdccceads" 4 2

            char arr[]=new char[str.length()]; //2) char로 선언.
            for(int i=0;i<str.length();i++){ // 문자열 길이는 str.length()
                arr[i]=str.charAt(i); // 1) char형이 되므로
            }
            int c_cnt=0;
            int cc_cnt=0;
            
            for(int i=0;i<arr.length;i++){
                if(arr[i]=='c' || arr[i]=='C'){
                    c_cnt++;

                }
            }
            for(int i=0;i<arr.length-1;i++){
                if(arr[i]=='c'||arr[i]=='C'){
                    if(arr[i+1]=='c'||arr[i+1]=='C')
                        cc_cnt++;
                }
            }
            System.out.println(c_cnt);
            System.out.println(cc_cnt);
            
            
        }
        catch(NumberFormatException e){
            e.printStackTrace();
        } 

    }
}


    
        
