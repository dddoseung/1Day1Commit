package hw4;

public class Human extends Character{ 
	// CharacterŬ������ ����ϸ�, �������̵��� Ŭ�����̴�
	// �� Ŭ�������� ������ ���� "�������̵�" �����̴�
	//    *��, CharacterŬ�������� �̹� ���ǵǾ� �ִ� �͵��̴�
	
	public Human(int hitPoint, int portionNumber) {
		super(hitPoint,portionNumber);
	}
	public void initialize() {
		hitPoint=200;
		portionNumber=5;
		name="Human"; // super.name��
	}
	public void attack(Character c) { // c���� ������ ����
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
		if(portionNumber>0&&hitPoint<=70) { // ������ 1���̻��̰�, ü���� �ִ뵥������ 70�����̸�
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
