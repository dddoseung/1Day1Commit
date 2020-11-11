import java.util.Scanner;
import java.text.DecimalFormat;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double d=sc.nextDouble();
        
        DecimalFormat form = new DecimalFormat("0.00000000000");
        System.out.print(form.format(d));

    }
}
