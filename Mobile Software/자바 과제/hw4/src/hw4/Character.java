package hw4;
/*
 * ��üŬ������ �������� �κ�(����,�޼���)�� �����ؼ� ������ Ŭ����
 * �߻�Ŭ������ ��üŬ������ ��Ӱ���!
*/
public abstract class Character { // <- �߻�Ŭ�������� ��(+public)
	
	public  int hitPoint; 
	//ĳ������ ü��
	public  int portionNumber;
	//������ �ִ� ������ ��
	public String name;
	//ĳ������ �̸�
	public int damage;
	//ĳ������ ������
	
	public Character(int hitPoint, int portionNumber) { // �� �ʿ��ѵ�..?
		this.hitPoint=hitPoint;
		this.portionNumber=portionNumber;
	}
	
	public void initialize() { 
		this.hitPoint=hitPoint;
		this.portionNumber=5;
				// ?�������̵�
	}
	public void attack(Character c) { // c���� ������ ����
		
	}
	public int getDamage(int damage) {
		this.hitPoint-=damage;
		return hitPoint;
	}
	public void recover() {
		// ?�������̵�
	}
	public boolean isDie() {
		if(hitPoint<=0)
			return true;
				//true->����
		else
			return false;
			// false->����
	} // main���� �޽��� ����ؾ� ��
	
	
	public boolean needPortion() {
		return true;
		// ?�������̵�
	}
	
	public void whoAmI() {
		// ?�������̵�
	}

}
