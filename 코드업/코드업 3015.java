

import java.util.*;
import java.io.*;

class student implements Comparable<student>{
    String name;
    int score;
    
    public void setName(String name){
        this.name=name;
    }
    public void setScore(int score){
        this.score=score;
    }
    public void show(){
        System.out.println(name);
    }
    
    @Override
    public int compareTo(student s1){
        if(this.score<s1.score) //내림차순!
            return 1;
        else if(this.score==s1.score)
            return 0;
        else
            return -1;
    }
}
public class Main{
    public static void main(String[] args) throws IOException{
        
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
        try{
            String[] information=br.readLine().split(" "); // 4 2
            int n=Integer.parseInt(information[0]); //4
            int m=Integer.parseInt(information[1]); //2
            
            student[] Student=new student[n];
            
            for(int i=0;i<n;i++){
                student tmp=new student(); //(객체배열 아님! 중요)
                
                String[] arr=br.readLine().split(" "); //Jeon 95
                //tmp.name=arr[0];
                //tmp.score=Integer.parseInt(arr[1]);
                //Student[i]=tmp;  ->주석으로 대체가능
                
                tmp.setName(arr[0]);
                tmp.setScore(Integer.parseInt(arr[1]));
                Student[i]=tmp;
            }
            Arrays.sort(Student); // 내림차순
            
            for(int i=0;i<m;i++){
                Student[i].show();
            }
        }
        
        catch(NumberFormatException e){
            e.printStackTrace();
        }
    }
}
