      // ���׸�
public class hw5_1<T> {
	private T[] b; // ���׸� ��� �迭

	public hw5_1(T[] b) {		//������

		this.b=b;
		//*************b=this.b; �ƴ�!!!!**************
	}
	
	public void getB() {
		for(int i=0;i<b.length;i++) {
			System.out.print(b[i]+" ");
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer[] i_arr={1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
		Double[] d_arr={1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0, 11.0, 12.0, 13.0, 14.0, 15.0, 16.0, 17.0, 18.0, 19.0, 20.0};
		
		hw5_1<Integer> integerbox = new hw5_1<Integer>(i_arr);
		hw5_1<Double> doublebox = new hw5_1<Double>(d_arr);
		
		
		System.out.println(BSearch(integerbox.b, 15));
		System.out.println(BSearch(doublebox.b, 14.5));
	}
	
	/*
	 * ���׸�Ÿ��<? extends ����Ÿ��> : 
	 * ���ϵ�ī���� ������ Ư�� ��ü�� ���� Ŭ������ �� �� �ֽ��ϴ�.
	 * */
	

	public static <T extends Comparable<T>> boolean BSearch(T arr[], T target) {

		
		int mid;
		int low=0;
		int high=arr.length-1;
		
		/*����Ž�� ����*/
		while(low <= high) {
	        mid = (low + high) / 2;
	        
	     /*A.compareTo(B)
	      * A�� B�� ������ 0�� ��ȯ
	      * A�� B���� ũ�� ����� ��ȯ
	      * A�� B���� ������ ������ ��ȯ
	      * */
	        int result = arr[mid].compareTo(target); 
	        
	        if (result > 0)
	            high = mid - 1;
	        else if(result < 0)
	            low = mid + 1;
	        else // ã����
	        	return true;
	    }
		//����Ž���� �Ͽ����� �ᱹ ��ã����
	    return false ;

	}

}
//import java.util.*;
//
//class Box<T> {
//    T value;
//    public Box(T v) {
//        value = v;
//    }
//    public T getValue() {
//        return value; 
//    }
//    
//}

//
//public class HelloWorld{
//    
//    public static <T extends Comparable<T>> int isGreater(T a,T b) {
//        if(a.compareTo(b) > 0) {
//            return 1;
//        } else if(b.compareTo(a) > 0) {
//            return -1;
//        } else {
//            return 0;
//        }
//    }
//
//    public static void main(String []args){
//        Box<Integer> t1 = new Box<Integer>(3);
//        Box<Integer> t2 = new Box<Integer>(2);
//        System.out.println(isGreater(t1.getValue(), t2.getValue()));
//        
//        Box<Double> t3 = new Box<Double>(3.0);
//        Box<Double> t4 = new Box<Double>(2.0);
//        System.out.println(isGreater(t3.getValue(), t4.getValue()));
//        
//        Box<String> t5 = new Box<String>("Kim");
//        Box<String> t6 = new Box<String>("Woongsup");
//        System.out.println(isGreater(t5.getValue(), t6.getValue()));
//     }
//}
