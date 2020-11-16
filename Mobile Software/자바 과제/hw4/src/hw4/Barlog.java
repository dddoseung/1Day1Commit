package hw4;

public class Barlog extends Character { // CharacterŬ������ ����ϸ�, �������̵��� Ŭ����
	
	public Barlog(int hitPoint, int portionNumber)  {
		super(hitPoint,portionNumber);
	}
	public void initialize() {
		hitPoint=170;
		portionNumber=5;
		name="Barlog";
	}

	public void attack(Character c) { // c���� ������ ����
		for (int i = 1; i <= 2; i++){ 
			// 2�� ����
			double randombox;
            randombox = (int) (Math.random() * (100 - 1 + 1) + 1);
            
            if ( 1 <= randombox && randombox <=  20 ) { // 20�ۼ�Ʈ Ȯ��
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
		
		if(portionNumber>0&&hitPoint<=70) {// ������ 1���̻��̰�, ü���� 70������ ��
			portionNumber--;
			if(portionNumber>0&&hitPoint<=40) {// ������ 1���̻��̰�, ü���� 40������ ��
				portionNumber--; // �ϳ� ���԰�
				recover(); // recover()�޼ҵ� ȣ��
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
