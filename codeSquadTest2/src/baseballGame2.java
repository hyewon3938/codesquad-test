package codeSquadTest2;

import java.util.Scanner;

public class baseballGame2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);

		// �� ���� �̸�
		Team team1 = new Team();
		Team team2 = new Team();

		// ����Ŭ����
		Game game = new Game();

		// 1���� Ÿ�� ���� �迭
		Hitter[] hitter1 = new Hitter[9];
		// 2���� Ÿ�� ���� �迭
		Hitter[] hitter2 = new Hitter[9];

		while (true) {

			System.out.println("�ų��� �߱�����");
			System.out.println("1. ������ �Է�");
			System.out.println("2. ������ ���");
			System.out.println("3. ���� ����");

			String select = scan.nextLine();

			if (select.equals("1")) { // ������ �Է� ���ý� ������ �Է�

				System.out.println("�� ������ �Է��ϱ� ����");
				System.out.println("- 1���� �̸��� �Է��ϼ���.");
				team1.teamName = scan.nextLine();

				// 1��Ÿ��~9��Ÿ�� ���� ���� �Է� (1��)
				for (int i = 0; i < 9; i++) {
					hitter1[i] = new Hitter();
					System.out.println(i + 1 + "�� Ÿ���� �̸��� �Է����ּ���.");
					hitter1[i].name = scan.nextLine();

					System.out.println(i + 1 + "�� Ÿ���� Ÿ���� �Է����ּ���.");
					hitter1[i].h = scan2.nextFloat();

				}

				System.out.println("- 2���� �̸��� �Է��ϼ���.");
				team2.teamName = scan.nextLine();

				// 1��Ÿ��~9��Ÿ�� ���� ���� �Է� (2��)
				for (int i = 0; i < 9; i++) {
					hitter2[i] = new Hitter();
					System.out.println(i + 1 + "�� Ÿ���� �̸��� �Է����ּ���.");
					hitter2[i].name = scan.nextLine();
					System.out.println(i + 1 + "�� Ÿ���� Ÿ���� �Է����ּ���.");
					hitter2[i].h = scan2.nextFloat();
				}

				System.out.println();
				System.out.println("�� ������ �Է��� �Ϸ�Ǿ����ϴ�.");
				System.out.println();

			} else if (select.equals("2")) { // ������ ����ϱ�

				System.out.println();
				System.out.println(team1.teamName + " �� ����");

				for (int i = 0; i < 9; i++) {
					System.out.println(i + 1 + "�� " + hitter1[i].name + ", " + hitter1[i].h);
				}

				System.out.println();
				System.out.println(team2.teamName + " �� ����");

				for (int i = 0; i < 9; i++) {
					System.out.println(i + 1 + "�� " + hitter2[i].name + ", " + hitter2[i].h);
				}

				System.out.println();

			} else if (select.equals("3")) { // �����ϱ�

				System.out.println("�� �����ϱ� ����");
				System.out.println();
				System.out.println(team1.teamName + " VS " + team2.teamName + "�� ������ �����մϴ�.");
				System.out.println();

				game.game(team1, team2, hitter1, hitter2);

			} else { // �޴��� ���� ��ȣ�� �������� ��
				System.out.println("��ȣ�� �ٽ� �Է����ּ���.");
				select = scan.nextLine();
			}
		}

		
	}

}
