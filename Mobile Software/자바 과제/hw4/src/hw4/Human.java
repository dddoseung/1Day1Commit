package hw4;

public class Human extends Character{ 
	// Character클래스를 상속하며, 오버라이딩할 클래스이다
	// 이 클래스에서 쓰여진 것은 "오버라이딩" 대상들이다
	//    *즉, Character클래스에서 이미 정의되어 있는 것들이다
	
	public Human(int hitPoint, int portionNumber) {
		super(hitPoint,portionNumber);
	}
	public void initialize() {
		hitPoint=200;
		portionNumber=5;
		name="Human"; // super.name임
	}
	public void attack(Character c) { // c에게 공격을 가함
		damage=50;
		c.hitPoint-=damage;

	}
	//void getDamage(int damage){}
	
	public void recover() {
		hitPoint+=40;
		System.out.println("Human eats portion and "+hitPoint+" hit point now.");
	}
	//boolean isDie(){}
	
	public boolean needPortion() {
		if(portionNumber>0&&hitPoint<=70) { // 물약이 1개이상이고, 체력이 최대데미지인 70이하이면
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
