package codeSquadTest2;

public class Game {

	Team team1;
	Team team2;
	Hitter hitter1;
	Hitter hitter2;
	Rate rate;

	public void game(Team team1, Team team2, Hitter[] hitter1, Hitter[] hitter2) {

		for (int i = 1; i < 7; i++) {
			System.out.println(i + "ȸ�� " + team1.teamName + " ����");
			System.out.println();

			for (int j = 0; j < 9; j++) {
				System.out.println(i + 1 + "�� " + hitter1[j].name);
				
			
			}
			System.out.println(i + "ȸ�� " + team2.teamName + " ����");
			System.out.println();
		}
	}
	
	
}
