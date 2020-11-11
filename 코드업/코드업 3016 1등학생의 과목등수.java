
import java.util.*;
import java.io.*;

class student implements Comparable<student>{
    String name;
    int A_score;
    int B_score;
    int C_score;
    
    public void score(String name,int A_score,int B_score,int C_score){
        this.name=name;
        this.A_score=A_score;
        this.B_score=B_score;
        this.C_score=C_score;
    }
    
    @Override
    public int compareTo(student s){
        if(this.A_score<s.A_score)
            return 1; //내림차순(A_score 기준)!
        else if(this.A_score==s.A_score)
            return 0;
        else
            return -1;
    }
}

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
        try{
            int n=Integer.parseInt(br.readLine()); //4
            
            student[] Student=new student[n];
            for(int i=0;i<n;i++){
                String[] str=br.readLine().split(" "); //Jeon 95 80 100
                int A=Integer.parseInt(str[1]); //95
                int B=Integer.parseInt(str[2]); //80
                int C=Integer.parseInt(str[3]); //100
                
                student tmp=new student();
                tmp.score(str[0],A,B,C);
                Student[i]=tmp;
            }
            Arrays.sort(Student); //내림차순(A_Score 기준)
            String ans_name=Student[0].name;// 첫번째 과목 1등학생=Student[0]
            System.out.print(ans_name+" "); 
            
            int grade=1;
            for(int i=1;i<n;i++){
                if(Student[0].B_score<Student[i].B_score)
                    grade++;
                else
                    continue;
            }
            System.out.print(grade+" ");
            
            grade=1;
            for(int i=1;i<n;i++){
                if(Student[0].C_score<Student[i].C_score)
                    grade++;
                else
                    continue;
            }
            System.out.print(grade+" ");
        }
        catch(NumberFormatException e){
            e.printStackTrace();
        }
    
}
}

