package codeSquadTest1;

public class Throwing {

	// ��Ʈ����ũ
	int strike;
	// ��
	int ball;
	// ��Ÿ
	int hit;
	// �ƿ�
	int out;

	// ��������
	public void throwing() {
		// ��Ʈ����ũ, ��, ��Ÿ, �ƿ� ����
		int random = (int) (Math.random() * 4);

		if (random == 0) { // ��Ʈ����ũ
			this.strike = this.strike + 1;
			System.out.println("��Ʈ����ũ!");

			// ��Ʈ����ũ 3���� ��� 1�ƿ�
			if (this.strike == 3) {
				this.out = this.out + 1;
				System.out.print("�ƿ�!");
				this.strike = 0;
				this.ball = 0;

				// 3�ƿ��� �ƴ� ��쿡�� ���� Ÿ�� ����
				if (this.out != 3) {
					System.out.println("���� Ÿ�ڰ� Ÿ���� �����߽��ϴ�.");
					System.out.println(this.strike + "S " + this.ball + "B " + this.out + "O");
				} else {
					System.out.println();
					System.out.println(this.strike + "S " + this.ball + "B " + this.out + "O");
				}

			} else {
				System.out.println(this.strike + "S " + this.ball + "B " + this.out + "O");
			}

		} else if (random == 1) { // ��
			this.ball = this.ball + 1;
			System.out.println("��!");

			// �� 4���� ��� ��Ÿ
			if (this.ball == 4) {
				this.hit = this.hit + 1;
				System.out.print("��Ÿ!");
				this.strike = 0;
				this.ball = 0;
				System.out.println("���� Ÿ�ڰ� Ÿ���� �����߽��ϴ�.");
				System.out.println(this.strike + "S " + this.ball + "B " + this.out + "O");

			} else {
				System.out.println(this.strike + "S " + this.ball + "B " + this.out + "O");
			}

		} else if (random == 2) { // ��Ÿ
			this.hit = this.hit + 1;
			System.out.print("��Ÿ!");
			this.strike = 0;
			this.ball = 0;
			System.out.println("���� Ÿ�ڰ� Ÿ���� �����߽��ϴ�.");
			System.out.println(this.strike + "S " + this.ball + "B " + this.out + "O");

		} else if (random == 3) { // �ƿ�
			this.out = this.out + 1;
			System.out.print("�ƿ�!");
			this.strike = 0;
			this.ball = 0;

			// 3�ƿ��� �ƴ� ��쿡�� ���� Ÿ�� ����
			if (this.out != 3) {
				System.out.println("���� Ÿ�ڰ� Ÿ���� �����߽��ϴ�.");
			} else {
				System.out.println();

			}
			System.out.println(this.strike + "S " + this.ball + "B " + this.out + "O");

		}

	}

}
