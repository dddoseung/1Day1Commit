package hw4;

public class Elf extends Character { // Character클래스를 상속하며, 오버라이딩할 클래스
	
	public Elf(int hitPoint, int portionNumber) {
		super(hitPoint, portionNumber);
	}
	public void initialize() {
		hitPoint=180;
		portionNumber=5;
		name="Elf";
	}

	public void attack(Character c) { // c에게 공격을 가함
		double randombox;
        randombox = (int) (Math.random() * (100 - 1 + 1) + 1);
        
        if ( 1 <= randombox && randombox <=  30 ) { //30퍼센트 확률
            damage=70;
        	c.hitPoint-=damage;
        }
        else {
        	damage=35; 
        	c.hitPoint-=damage;
        }
	}

	// void getDamage(int damage){}

	public void recover() {
		
		double randombox;
		randombox = (int) (Math.random() * (100 - 1 + 1) + 1);

		if (1 <= randombox && randombox <= 25) { // 25퍼센트 확률
			hitPoint += 60;
		} else {
			hitPoint += 30;
		}
		
		System.out.println("Elf eats portion and "+hitPoint+" hit point now.");
	}

	// boolean isDie(){}
	
	public boolean needPortion() {
		if(portionNumber>0&&hitPoint<=70) { // 물약이 1개이상이고, 체력이 최대 데미지인 70이하일 때
			portionNumber--;
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
