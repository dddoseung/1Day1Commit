package hw4;
import java.util.Random;

public class Game { // ������ ������

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Character human=new Human(200,5);
		human.initialize();
		Character cyber=new CyberDaemon(250,5);
		cyber.initialize();
		Character barlog=new Barlog(170,5);
		barlog.initialize();
		Character elf=new Elf(180,5);
		elf.initialize();
		
		
						/****blue �� red ���� �����ϴ� �ڵ�*****/
		
		//monster��� ��ü�迭�� ��� ��´�
		Character[] monster=new Character[4];
		monster[0]=human;
		monster[1]=cyber;
		monster[2]=barlog;
		monster[3]=elf;

		Random rand = new Random();
		int blue_num=0; // �ε����� ����� �� blue-> monster[blue_num]
		int red_num=0; //  �ε����� ����� �� red-> monster[red_num]
       
       while(blue_num==red_num) { 
    	   //������ ������ blue_num�� red_num�� 0���� �ʱ�ȭ�Ǳ� ������ 
    	   
    	   blue_num=rand.nextInt(4);// -> 0~3 ������ ���� �������� ����
    	   red_num=rand.nextInt(4); 		
    	   				//(rand.nextInt(15)+20;  -> 20~34 ������ ���� �������� ����)
       }
	   battle(monster[blue_num],monster[red_num]); // ��Ʋ�� ��Ų��
	   
	   //tournament(barlog,elf,cyber,human); // ��ʸ�Ʈ�� �Ѵ�

	}

							/*****
							 * !���, ���� ��� ���� ���� ���¿���!
							 * ���尡 ȸ���ؾ� �ϴ� ��Ȳ���� Ȯ�� ��
							 * ��簡 ������
							 * ���尡 ���� �ʾҴٸ�
							 * ��簡 ȸ���ؾ� �ϴ� ��Ȳ���� Ȯ�� ��
							 * ���尡 ������
							 * ���� �� �߿� ���� ĳ���Ͱ� �ִٸ�
							 * ���ڸ� �����ϰ� ����
							 *  *****/
	
	static Character battle(Character blue, Character red) {
		
		while(blue.isDie()==false && red.isDie()==false) {
			// ��簡 ���� ���� ���� && ���尡 ���� ���� ���¿��� �ݺ� ( ���� �ϳ��� �׾��ٸ� while���� ��������)
			
			if(red.needPortion()==true) { // ������ �ʿ��ϸ� �Һ��ϰ�
				red.recover(); // red�� ȸ����
			}
			
			blue.attack(red); // blue ����
			System.out.println(blue.name+" attacks with damage "+blue.damage+". "+red.name+" has "+red.hitPoint+" hit point now.");

			if(red.isDie()==false) {
				// ���尡 ������ �°� ���� �ʾҴٸ�
				if(blue.needPortion()==true) {
					blue.recover(); // blue�� ȸ����
				}
				red.attack(blue); // red�� ����
				System.out.println(red.name+" attacks with damage "+red.damage+". "+blue.name+" has "+blue.hitPoint+" hit point now.");
			}
		}
		
		if(red.isDie()==true) { // ���尡 �׾��ٰ� �ǴܵǸ�
			System.out.println(blue.name + " is winner!"); // ���� ���
			return blue; // ���� ���� �� ����
		}
		
		if(blue.isDie()==true) { // ��簡 �׾��ٰ� �ǴܵǸ�
			System.out.println(red.name + " is winner!"); // ���� ���� 
		}
		return red; // ���� ���� �� ����
	}
	
	
	static void tournament(Character hu, Character cyber, Character bar, Character el) {
		
		System.out.println("<<<tournament battle1>>>");
		Character winner1=battle(hu,cyber); 
		System.out.println("\n<<<tournament battle2>>>");
		Character winner2=battle(bar,el);
		
		//����� ���� ü�°� ���� �ʱ�ȭ~~
		System.out.println("\n**Hit point and portion is initialized.**");
		winner1.initialize();
		winner2.initialize();
		
		System.out.println("\n<<<final tournament battle!>>>");
		Character real_winner=battle(winner1,winner2);
		System.out.println("----------------------------------------------------------");
		real_winner.whoAmI();
			
	}
		
		
	}

