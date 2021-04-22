package MoneyExchange;

import java.io.IOException;

public class MoneyExchanger {

	public static void main(String[] args) throws IOException {		
		//ȣ���ؼ� ����� Ŭ������ ���� ������Ʈ�� ����
		ExchangeType exType;
		
		Processing pc = new Processing();
		InputFromConsole inputConsole = new InputFromConsole();
		FileWriting csvwriter = new FileWriting();

		csvwriter.headerWrite(); 
		//csv���� �ۼ� �� ������ ����� ���� �Է��ϰ� �̰��� �ݺ����� �ʰ� �ϱ� ���ؼ� 
		//while�ۿ� ���� ���� ����
		
		while (true) {
			exType = new ExchangeType(); 
			//while���� �ӿ��� ����� ���� �ʱ�ȭ�� �� �ֵ��� ��
			
			inputConsole.inputType(exType);
			
			if(exType.type == 0) break;
			inputConsole.inputWon(exType);
			
			//�� type�� ���� �ٸ� �޼ҵ带 ȣ���� ó��
			if(exType.type == ConstValue.EX_TYPE_USD) {
				exType.exchagetype = "USD";
				pc.exchangeUSD(exType, ConstValue.EX_RATE_USD);
			} else if(exType.type == ConstValue.EX_TYPE_EUR) {
				exType.exchagetype = "EUR";
				pc.exchangeEUR(exType, ConstValue.EX_RATE_EUR);
			} else if(exType.type == ConstValue.EX_TYPE_JPY) {
				exType.exchagetype = "JPY";
				pc.exchangeJPY(exType, ConstValue.EX_RATE_JPY);
			}
			pc.returnWon(exType); //�Ž����� ���� ������ ����ϴ� �޼ҵ� ȣ��
			
			csvwriter.FileWrite(exType); //csv���� �ۼ�
		} 
		csvwriter.fileClose(); //0�� ���� ����� �����ۼ��� ����
	}
}

