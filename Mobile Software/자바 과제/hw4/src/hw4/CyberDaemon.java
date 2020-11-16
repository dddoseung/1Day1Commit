package hw4;

public class CyberDaemon extends Character { // CharacterŬ������ ����ϸ�, �������̵��� Ŭ����
	// CharacterŬ������ ����ϸ�, �������̵��� Ŭ�����̴�
		// �� Ŭ�������� ������ ���� "�������̵�" �����̴�
		//    *��, CharacterŬ�������� �̹� ���ǵǾ� �ִ� �͵��̴�
	
	public CyberDaemon(int hitPoint, int portionNumber) {
		super(hitPoint,portionNumber);
	}
	public void initialize() {
		hitPoint=250;
		portionNumber=5;
		name="Cyber Daemon";
	}
	public void attack(Character c) { // c���� ������ ����
		double randombox;
		randombox = (int) (Math.random() * (100 - 1 + 1) + 1); // 100������ ���� ����(?)

		if (1 <= randombox && randombox <= 30) { // 30�ۼ�Ʈ Ȯ��
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

		if (1 <= randombox && randombox <= 30) { // 30�ۼ�Ʈ Ȯ��
			hitPoint += 50;
		} else {
			hitPoint += 30;
		}
		System.out.println("Cyber Daemon eats portion and "+hitPoint+" hit point now.");
	}

	// boolean isDie(){}
	
	public boolean needPortion() {
		if(portionNumber>0&&hitPoint<=70) { // ������ 1���̻��̰�, ü���� �ִ� �������� 70������ ��
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
