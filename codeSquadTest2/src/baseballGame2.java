package codeSquadTest2;

import java.util.Scanner;

public class baseballGame2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);

		// 각 팀의 이름
		Team team1 = new Team();
		Team team2 = new Team();

		// 게임클래스
		Game game = new Game();

		// 1팀의 타자 정보 배열
		Hitter[] hitter1 = new Hitter[9];
		// 2팀의 타자 정보 배열
		Hitter[] hitter2 = new Hitter[9];

		while (true) {

			System.out.println("신나는 야구시합");
			System.out.println("1. 데이터 입력");
			System.out.println("2. 데이터 출력");
			System.out.println("3. 시합 시작");

			String select = scan.nextLine();

			if (select.equals("1")) { // 데이터 입력 선택시 데이터 입력

				System.out.println("▶ 데이터 입력하기 선택");
				System.out.println("- 1팀의 이름을 입력하세요.");
				team1.teamName = scan.nextLine();

				// 1번타자~9번타자 선수 정보 입력 (1팀)
				for (int i = 0; i < 9; i++) {
					hitter1[i] = new Hitter();
					System.out.println(i + 1 + "번 타자의 이름을 입력해주세요.");
					hitter1[i].name = scan.nextLine();

					System.out.println(i + 1 + "번 타자의 타율을 입력해주세요.");
					hitter1[i].h = scan2.nextFloat();

				}

				System.out.println("- 2팀의 이름을 입력하세요.");
				team2.teamName = scan.nextLine();

				// 1번타자~9번타자 선수 정보 입력 (2팀)
				for (int i = 0; i < 9; i++) {
					hitter2[i] = new Hitter();
					System.out.println(i + 1 + "번 타자의 이름을 입력해주세요.");
					hitter2[i].name = scan.nextLine();
					System.out.println(i + 1 + "번 타자의 타율을 입력해주세요.");
					hitter2[i].h = scan2.nextFloat();
				}

				System.out.println();
				System.out.println("팀 데이터 입력이 완료되었습니다.");
				System.out.println();

			} else if (select.equals("2")) { // 데이터 출력하기

				System.out.println();
				System.out.println(team1.teamName + " 팀 정보");

				for (int i = 0; i < 9; i++) {
					System.out.println(i + 1 + "번 " + hitter1[i].name + ", " + hitter1[i].h);
				}

				System.out.println();
				System.out.println(team2.teamName + " 팀 정보");

				for (int i = 0; i < 9; i++) {
					System.out.println(i + 1 + "번 " + hitter2[i].name + ", " + hitter2[i].h);
				}

				System.out.println();

			} else if (select.equals("3")) { // 시합하기

				System.out.println("▶ 시합하기 선택");
				System.out.println();
				System.out.println(team1.teamName + " VS " + team2.teamName + "의 시합을 시작합니다.");
				System.out.println();

				game.game(team1, team2, hitter1, hitter2);

			} else { // 메뉴에 없는 번호를 선택했을 때
				System.out.println("번호를 다시 입력해주세요.");
				select = scan.nextLine();
			}
		}

		
	}

}
