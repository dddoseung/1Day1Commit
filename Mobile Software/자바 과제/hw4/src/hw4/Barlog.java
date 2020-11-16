package hw4;

public class Barlog extends Character { // Character클래스를 상속하며, 오버라이딩할 클래스
	
	public Barlog(int hitPoint, int portionNumber)  {
		super(hitPoint,portionNumber);
	}
	public void initialize() {
		hitPoint=170;
		portionNumber=5;
		name="Barlog";
	}

	public void attack(Character c) { // c에게 공격을 가함
		for (int i = 1; i <= 2; i++){ 
			// 2번 공격
			double randombox;
            randombox = (int) (Math.random() * (100 - 1 + 1) + 1);
            
            if ( 1 <= randombox && randombox <=  20 ) { // 20퍼센트 확률
                damage=35;
            	c.hitPoint-=damage;
            }
            else {
            	damage=25; 
            	c.hitPoint-=damage;
            }
		}
	}

	// void getDamage(int damage){}

	public void recover() {		
		hitPoint+=30;
		System.out.println("Barlog eats portion and "+hitPoint+" hit point now.");
	}

	// boolean isDie(){}
	
	public boolean needPortion() {
		
		if(portionNumber>0&&hitPoint<=70) {// 물약이 1개이상이고, 체력이 70이하일 때
			portionNumber--;
			if(portionNumber>0&&hitPoint<=40) {// 물약이 1개이상이고, 체력이 40이하일 때
				portionNumber--; // 하나 더먹고
				recover(); // recover()메소드 호출
			}
			return true;
		}
		else {
			return false;
		}

	}
	
	public void whoAmI() {
		System.out.println("I am a "+name);
	}
}
