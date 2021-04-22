package MoneyExchange;

import java.io.IOException;

public class MoneyExchanger {

	public static void main(String[] args) throws IOException {		
		//호출해서 사용할 클래스에 대한 오브젝트를 선언
		ExchangeType exType;
		
		Processing pc = new Processing();
		InputFromConsole inputConsole = new InputFromConsole();
		FileWriting csvwriter = new FileWriting();

		csvwriter.headerWrite(); 
		//csv파일 작성 시 파일의 헤더를 먼저 입력하고 이것이 반복되지 않게 하기 위해서 
		//while밖에 빼서 먼저 실행
		
		while (true) {
			exType = new ExchangeType(); 
			//while루프 속에서 계산할 값이 초기화될 수 있도록 함
			
			inputConsole.inputType(exType);
			
			if(exType.type == 0) break;
			inputConsole.inputWon(exType);
			
			//각 type에 따라 다른 메소드를 호출해 처리
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
			pc.returnWon(exType); //거스름돈 지급 내용을 출력하는 메소드 호출
			
			csvwriter.FileWrite(exType); //csv파일 작성
		} 
		csvwriter.fileClose(); //0을 눌러 종료시 파일작성도 종료
	}
}

