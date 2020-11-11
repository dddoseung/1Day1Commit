import java.io.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        try{
            String[] lotto=br.readLine().split(" "); //lotto[0]="13"
            String[] juhee=br.readLine().split(" "); //juhee[0]="2"
            
            int count=0;
            int bonus=0;
            
            for(int i=0;i<7;i++){
                for(int j=0;j<6;j++){
 	//문자열 값이 서로 같은 지 비교-> a.equals(b)
	//문자열 주소가 서로 같은 지 비교-> a==b
                    if(lotto[i].equals(juhee[j])&&i==6){ 
                        bonus++;
                    }
                    else if(lotto[i].equals(juhee[j])&&i!=6)
                        count++;
                    else
                        continue;
                }
            }
            if(count==6)
                System.out.println(1);
            else if(count==5 && bonus==1)
                System.out.println(2);
            else if(count==5)
                System.out.println(3);
            else if(count==4)
                System.out.println(4);
            else if(count==3)
                System.out.println(5);
            else
                System.out.println(0);
        }
        catch(NumberFormatException e){
            e.printStackTrace();
        }
    }
        
    }


