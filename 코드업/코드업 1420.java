import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        int student=Integer.parseInt(sc.nextLine()); // 5
        String[] name=new String[student+1];
        int[] score=new int[student+1];
        
        for(int i=1;i<=student;i++){
            name[i]=sc.next();
            score[i]=sc.nextInt();
        }
        int tmp;
        String tmp2;
        
        for(int j=1;j<student;j++){
            for(int i=1;i<student;i++){
                if(score[i]<score[i+1]){
                    tmp=score[i];
                    score[i]=score[i+1];
                    score[i+1]=tmp;
                    tmp2=name[i];
                    name[i]=name[i+1];
                    name[i+1]=tmp2;
                }
                else
                    continue;
            }
        }
        System.out.print(name[3]);
        
    }
}


    
        
