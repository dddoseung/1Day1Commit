import java.util.*;

class setGrade implements Comparable<setGrade>{
    int grade;
    int index; // 인덱스로 다시 정렬할 것
    int score;
    
    setGrade(int score,int grade,int index){ // *public void* setGrade (X)!!!!!!!!!!!!!!!
        this.score=score;
        this.grade=grade;
        this.index=index;
    }
    public void show(){
        System.out.println(score+" "+grade);
    }
    
    @Override
    public int compareTo(setGrade s1){
        if(this.score<s1.score) //내림차순!
            return 1;
        else if(this.score==s1.score)
            return 0;
        else
            return -1;
    }
}

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        class sCompare implements Comparator<setGrade>{
            @Override
            public int compare(setGrade a1, setGrade a2){
                if(a1.index>a2.index)
                    return 1; //오름차순
                else if(a1.index==a2.index)
                    return 0;
                else
                    return -1;
            }
        }
        int count=sc.nextInt(); //10
        
        ArrayList<setGrade> list=new ArrayList<setGrade>(); //객체 리스트 선언
        
        for(int i=1;i<=count;i++){
            int sco=sc.nextInt();
            list.add(new setGrade(sco,i,i));  //객체 리스트는 .add()로
        }

        Collections.sort(list);
        
        int s=1;
        for(int i=0;i<count;i++){
            list.get(i).grade=s; // 점수 내림차순대로 grade 다시 정의
            s++;
        }
        
        Collections.sort(list,new sCompare());
        
        for(int i=0;i<list.size();i++){
            list.get(i).show();
        }
        
    }
}
