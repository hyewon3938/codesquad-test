package codeSquadTest1;

public class Throwing {

	// 스트라이크
	int strike;
	// 볼
	int ball;
	// 안타
	int hit;
	// 아웃
	int out;

	// 공던지기
	public void throwing() {
		// 스트라이크, 볼, 안타, 아웃 구분
		int random = (int) (Math.random() * 4);

		if (random == 0) { // 스트라이크
			this.strike = this.strike + 1;
			System.out.println("스트라이크!");

			// 스트라이크 3번일 경우 1아웃
			if (this.strike == 3) {
				this.out = this.out + 1;
				System.out.print("아웃!");
				this.strike = 0;
				this.ball = 0;

				// 3아웃이 아닐 경우에는 다음 타자 입장
				if (this.out != 3) {
					System.out.println("다음 타자가 타석에 입장했습니다.");
					System.out.println(this.strike + "S " + this.ball + "B " + this.out + "O");
				} else {
					System.out.println();
					System.out.println(this.strike + "S " + this.ball + "B " + this.out + "O");
				}

			} else {
				System.out.println(this.strike + "S " + this.ball + "B " + this.out + "O");
			}

		} else if (random == 1) { // 볼
			this.ball = this.ball + 1;
			System.out.println("볼!");

			// 볼 4번일 경우 안타
			if (this.ball == 4) {
				this.hit = this.hit + 1;
				System.out.print("안타!");
				this.strike = 0;
				this.ball = 0;
				System.out.println("다음 타자가 타석에 입장했습니다.");
				System.out.println(this.strike + "S " + this.ball + "B " + this.out + "O");

			} else {
				System.out.println(this.strike + "S " + this.ball + "B " + this.out + "O");
			}

		} else if (random == 2) { // 안타
			this.hit = this.hit + 1;
			System.out.print("안타!");
			this.strike = 0;
			this.ball = 0;
			System.out.println("다음 타자가 타석에 입장했습니다.");
			System.out.println(this.strike + "S " + this.ball + "B " + this.out + "O");

		} else if (random == 3) { // 아웃
			this.out = this.out + 1;
			System.out.print("아웃!");
			this.strike = 0;
			this.ball = 0;

			// 3아웃이 아닐 경우에는 다음 타자 입장
			if (this.out != 3) {
				System.out.println("다음 타자가 타석에 입장했습니다.");
			} else {
				System.out.println();

			}
			System.out.println(this.strike + "S " + this.ball + "B " + this.out + "O");

		}

	}

}
