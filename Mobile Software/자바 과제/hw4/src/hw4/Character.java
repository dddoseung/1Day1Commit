package hw4;
/*
 * 실체클래스의 공통적인 부분(변수,메서드)를 추출해서 선언한 클래스
 * 추상클래스와 실체클래스는 상속관계!
*/
public abstract class Character { // <- 추상클래스여야 함(+public)
	
	public  int hitPoint; 
	//캐릭터의 체력
	public  int portionNumber;
	//가지고 있는 물약의 수
	public String name;
	//캐릭터의 이름
	public int damage;
	//캐릭터의 데미지
	
	public Character(int hitPoint, int portionNumber) { // 꼭 필요한듯..?
		this.hitPoint=hitPoint;
		this.portionNumber=portionNumber;
	}
	
	public void initialize() { 
		this.hitPoint=hitPoint;
		this.portionNumber=5;
				// ?오버라이드
	}
	public void attack(Character c) { // c에게 공격을 가함
		
	}
	public int getDamage(int damage) {
		this.hitPoint-=damage;
		return hitPoint;
	}
	public void recover() {
		// ?오버라이드
	}
	public boolean isDie() {
		if(hitPoint<=0)
			return true;
				//true->죽음
		else
			return false;
			// false->살음
	} // main에서 메시지 출력해야 함
	
	
	public boolean needPortion() {
		return true;
		// ?오버라이드
	}
	
	public void whoAmI() {
		// ?오버라이드
	}

}
