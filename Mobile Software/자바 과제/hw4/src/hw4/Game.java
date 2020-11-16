package hw4;
import java.util.Random;

public class Game { // 격투를 구현함

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
		
		
						/****blue 와 red 임의 배정하는 코드*****/
		
		//monster라는 객체배열에 모두 담는다
		Character[] monster=new Character[4];
		monster[0]=human;
		monster[1]=cyber;
		monster[2]=barlog;
		monster[3]=elf;

		Random rand = new Random();
		int blue_num=0; // 인덱스로 사용할 것 blue-> monster[blue_num]
		int red_num=0; //  인덱스로 사용할 것 red-> monster[red_num]
       
       while(blue_num==red_num) { 
    	   //실행할 때마다 blue_num과 red_num이 0으로 초기화되기 때문에 
    	   
    	   blue_num=rand.nextInt(4);// -> 0~3 사이의 정수 랜덤값을 추출
    	   red_num=rand.nextInt(4); 		
    	   				//(rand.nextInt(15)+20;  -> 20~34 사이의 정수 랜덤값을 추출)
       }
	   battle(monster[blue_num],monster[red_num]); // 배틀을 시킨다
	   
	   //tournament(barlog,elf,cyber,human); // 토너먼트를 한다

	}

							/*****
							 * !블루, 레드 모두 죽지 않은 상태에서!
							 * 레드가 회복해야 하는 상황인지 확인 후
							 * 블루가 선공함
							 * 레드가 죽지 않았다면
							 * 블루가 회복해야 하는 상황인지 확인 후
							 * 레드가 공격함
							 * 만약 둘 중에 죽은 캐릭터가 있다면
							 * 승자를 리턴하고 종료
							 *  *****/
	
	static Character battle(Character blue, Character red) {
		
		while(blue.isDie()==false && red.isDie()==false) {
			// 블루가 죽지 않은 상태 && 레드가 죽지 않은 상태여야 반복 ( 만약 하나라도 죽었다면 while문을 빠져나옴)
			
			if(red.needPortion()==true) { // 물약이 필요하면 소비하고
				red.recover(); // red가 회복함
			}
			
			blue.attack(red); // blue 선공
			System.out.println(blue.name+" attacks with damage "+blue.damage+". "+red.name+" has "+red.hitPoint+" hit point now.");

			if(red.isDie()==false) {
				// 레드가 선공을 맞고도 죽지 않았다면
				if(blue.needPortion()==true) {
					blue.recover(); // blue가 회복함
				}
				red.attack(blue); // red가 공격
				System.out.println(red.name+" attacks with damage "+red.damage+". "+blue.name+" has "+blue.hitPoint+" hit point now.");
			}
		}
		
		if(red.isDie()==true) { // 레드가 죽었다고 판단되면
			System.out.println(blue.name + " is winner!"); // 승자 블루
			return blue; // 승자 리턴 후 종료
		}
		
		if(blue.isDie()==true) { // 블루가 죽었다고 판단되면
			System.out.println(red.name + " is winner!"); // 승자 레드 
		}
		return red; // 승자 리턴 후 종료
	}
	
	
	static void tournament(Character hu, Character cyber, Character bar, Character el) {
		
		System.out.println("<<<tournament battle1>>>");
		Character winner1=battle(hu,cyber); 
		System.out.println("\n<<<tournament battle2>>>");
		Character winner2=battle(bar,el);
		
		//결승전 전에 체력과 물약 초기화~~
		System.out.println("\n**Hit point and portion is initialized.**");
		winner1.initialize();
		winner2.initialize();
		
		System.out.println("\n<<<final tournament battle!>>>");
		Character real_winner=battle(winner1,winner2);
		System.out.println("----------------------------------------------------------");
		real_winner.whoAmI();
			
	}
		
		
	}

