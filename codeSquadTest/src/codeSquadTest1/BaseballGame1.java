package codeSquadTest1;
import java.util.Scanner;

public class BaseballGame1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		//메소드 입력용
		Throwing throwing = new Throwing();
		
		//게임 시작 메세지 출력 
		System.out.println("야구 게임을 시작하려면 엔터를 눌러주세요.");
		
		//엔터 입력값 받기
		String enter = scan.nextLine();
		
		System.out.println("신나는 야구 게임!");
		System.out.println("첫번째 타자가 타석에 입장했습니다.");	
		System.out.println();
		
		while(throwing.out <3) {
		throwing.throwing();
		System.out.println();

		}
		
		// 3아웃 게임 종료 
		System.out.println("최종 안타수 : "+throwing.hit);
		System.out.println("GAME OVER");
	}

}
