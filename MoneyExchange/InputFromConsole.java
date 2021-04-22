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
		System.out.print("*���� ��ȭ �Է� : ");
		exType.w = scanner.nextInt();

	}
	public void inputType(ExchangeType exType) {
		System.out.print("ȯ���� ���� ���� (1:USD, 2:EUR, 3:JPY 0: ����) ? ");
		exType.type = scanner.nextInt();
	}
}

