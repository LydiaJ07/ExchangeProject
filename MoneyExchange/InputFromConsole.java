package MoneyExchange;

import java.util.Scanner;

public class InputFromConsole {
	Scanner scanner;
	
	InputFromConsole() {
		scanner = new Scanner(System.in);
	}

	protected void finalize() {
		scanner.close();
	}

	public void inputWon(ExchangeType exType) {
		System.out.print("*받은 원화 입력 : ");
		exType.w = scanner.nextInt();

	}
	public void inputType(ExchangeType exType) {
		System.out.print("환전할 종류 선택 (1:USD, 2:EUR, 3:JPY 0: 종료) ? ");
		exType.type = scanner.nextInt();
	}
}

