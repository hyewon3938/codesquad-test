package codeSquadTest2;

public class Rate {

	public void rate(int h) {
		
		int[] rate = new int[1000];

		int strikeRate = (1-h)/2-50;

		for (int i = 0; i < 100; i++) {
			rate[i]=1; // 아웃
		}
		for(int i =100; i<100+h; i++) {
			rate[i]=2; // 안타
		}
		for(int i = 100+h; i<100+h+strikeRate; i++) {
			rate[i]=3; // 스트라이크
		}
		for(int i = 100+h+strikeRate; i<100+h+strikeRate+strikeRate; i++) {
			rate[i]=4; // 볼
		}
		
		int random = (int) (Math.random() * 999);
		
		
		System.out.println(rate[random]);
	}
}
