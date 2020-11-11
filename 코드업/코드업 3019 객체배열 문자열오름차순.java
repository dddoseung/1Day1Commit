import java.util.*;
import java.io.*;

class dataset{
    String name;
    int year;
    int month;
    int day;
    
    public void dataset(String name,int year, int month, int day){
        this.name=name;
        this.year=year;
        this.month=month;
        this.day=day;
    }
}

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
        try{
        	class dCompare implements Comparator<dataset>{
            @Override
            public int compare(dataset d1, dataset d2){
                if(d1.year>d2.year)
                    return 1; // 오름차순
                else if(d1.year<d2.year)
                    return -1;
                else{
                    if(d1.month>d2.month)
                        return 1;
                    else if(d1.month<d2.month)
                        return -1;
                    else{
                        if(d1.day>d2.day)
                            return 1;
                        else if(d1.day<d2.day)
                            return -1;
                        else
                            return d1.name.compareTo(((dataset)d2).name); 
			//이름을 compare!!! (문자열 오름차순)
                        
                    } // 년도 월 일 모두 비교하는 정렬만듦
                }
            }
        	}
            int count=Integer.parseInt(br.readLine()); // 5
            
            dataset[] ds=new dataset[count]; //객체 배열 선언
            
            for(int i=0;i<count;i++){
                
                dataset dtmp=new dataset(); //임시 인스턴스 선언
                
                String[] str=br.readLine().split(" ");
                int y=Integer.parseInt(str[1]); //2014
                int m=Integer.parseInt(str[2]); //5
                int d=Integer.parseInt(str[3]); //23

                dtmp.dataset(str[0],y,m,d);
                ds[i]=dtmp;
            }
            String[] strtmp=new String[count];

            Arrays.sort(ds,new dCompare());
            
            for(dataset tmp:ds){
                System.out.println(tmp.name);
            }
        }
        catch(NumberFormatException e){
            e.printStackTrace();
        }
    
    }
}
