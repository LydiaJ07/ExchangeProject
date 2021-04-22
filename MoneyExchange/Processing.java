package MoneyExchange;

public class Processing {
	Output outClass;
	
	Processing(){
		outClass = new Output();
	}
	
	public void returnWon(ExchangeType exType) {		
		int returnWon = (int)(exType.cw) / 10 * 10; //1원 단위 버림
		int remainToCount = returnWon; //거스름돈 계산을 위한 초기값은 지불될 원화 거스름돈
		
		int[] KRWunits = {1000, 500, 100, 50, 10};
		int[] KRWcount = new int[KRWunits.length];

		for (int i = 0; i < KRWunits.length; i++) {
			KRWcount[i] = remainToCount/KRWunits[i];
			remainToCount = remainToCount % KRWunits[i];
		}

		outClass.printWon(exType.cw, returnWon, KRWunits, KRWcount);
	}


	public void exchangeUSD(ExchangeType exType, double EX_RATE_USD) {
		double exchangeResult = exType.w / EX_RATE_USD ;
		int usd = (int)exchangeResult; 
		exType.cw = exType.w - usd * EX_RATE_USD;

		int remainToCount = usd;
		int[] USDunits = {100, 50, 20, 10, 5, 2, 1};
		int[] USDcount = new int[USDunits.length];

		for (int i = 0; i < USDunits.length; i++) {
			USDcount[i] = remainToCount / USDunits[i];
			remainToCount = remainToCount % USDunits[i];
		}

		outClass.printUSD(exchangeResult, usd, USDunits, USDcount);
		exType.ex_result = usd;

	}

	public void exchangeEUR(ExchangeType exType, double EX_RATE_EUR) {
		double exchangeResult = exType.w / EX_RATE_EUR ;
		int eur = (int)exchangeResult; 
		eur -= (eur % 5);
		exType.cw = exType.w - eur * EX_RATE_EUR;

		int remainToCount = eur;
		int[] EURunits = {100, 50, 20, 10, 5};
		int[] EURcount = new int[EURunits.length];

		for (int i = 0; i < EURunits.length; i++) {
			EURcount[i] = remainToCount / EURunits[i];
			remainToCount = remainToCount % EURunits[i];
		}

		outClass.printEUR(exchangeResult, eur, EURunits, EURcount);
		exType.ex_result = eur;

	} 

	public void exchangeJPY(ExchangeType exType, double EX_RATE_JPY) {
		double exchangeResult = exType.w / EX_RATE_JPY ;
		int jpy = (int)exchangeResult; 
		jpy -= (jpy % 1000);
		exType.cw = exType.w - jpy * EX_RATE_JPY;

		int remainToCount = jpy;
		int[] JPYunits = {10000, 5000, 2000, 1000};
		int[] JPYcount = new int[JPYunits.length];

		for (int i = 0; i < JPYunits.length; i++) {
			JPYcount[i] = remainToCount / JPYunits[i];
			remainToCount = remainToCount % JPYunits[i];
		}

		outClass.printJPY(exchangeResult, jpy, JPYunits, JPYcount);
		exType.ex_result = jpy;
	}
	
}
