package codeSquadTest1;
import java.util.Scanner;

public class BaseballGame1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		//�޼ҵ� �Է¿�
		Throwing throwing = new Throwing();
		
		//���� ���� �޼��� ��� 
		System.out.println("�߱� ������ �����Ϸ��� ���͸� �����ּ���.");
		
		//���� �Է°� �ޱ�
		String enter = scan.nextLine();
		
		System.out.println("�ų��� �߱� ����!");
		System.out.println("ù��° Ÿ�ڰ� Ÿ���� �����߽��ϴ�.");	
		System.out.println();
		
		while(throwing.out <3) {
		throwing.throwing();
		System.out.println();

		}
		
		// 3�ƿ� ���� ���� 
		System.out.println("���� ��Ÿ�� : "+throwing.hit);
		System.out.println("GAME OVER");
	}

}
