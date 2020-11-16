package hw4;

public class CyberDaemon extends Character { // Character클래스를 상속하며, 오버라이딩할 클래스
	// Character클래스를 상속하며, 오버라이딩할 클래스이다
		// 이 클래스에서 쓰여진 것은 "오버라이딩" 대상들이다
		//    *즉, Character클래스에서 이미 정의되어 있는 것들이다
	
	public CyberDaemon(int hitPoint, int portionNumber) {
		super(hitPoint,portionNumber);
	}
	public void initialize() {
		hitPoint=250;
		portionNumber=5;
		name="Cyber Daemon";
	}
	public void attack(Character c) { // c에게 공격을 가함
		double randombox;
		randombox = (int) (Math.random() * (100 - 1 + 1) + 1); // 100까지의 난수 생성(?)

		if (1 <= randombox && randombox <= 30) { // 30퍼센트 확률
			damage = 60;
			c.hitPoint -= damage;
		} else {
			damage = 40;
			c.hitPoint -= damage;
		}
	}

	// void getDamage(int damage){}

	public void recover() {
		double randombox;
		randombox = (int) (Math.random() * (100 - 1 + 1) + 1);

		if (1 <= randombox && randombox <= 30) { // 30퍼센트 확률
			hitPoint += 50;
		} else {
			hitPoint += 30;
		}
		System.out.println("Cyber Daemon eats portion and "+hitPoint+" hit point now.");
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
