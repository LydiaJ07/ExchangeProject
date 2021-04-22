package MoneyExchange;

public class Output {
	public void printWon (double cw, int returnWon, int[] KRWunits, int[] KRWcount) {
		System.out.printf("\n*원화 거스름돈 : %.2f 원\n",cw);
		System.out.println("*실제 지급 원화 거스름 : " + returnWon + "원");

		for (int i = 0; i < KRWunits.length; i++) {
			System.out.printf("%d원권: %d장 \n", KRWunits[i], KRWcount[i]);
		}
		System.out.println();
	}
	
	public void printUSD(double exchangeResult, int usd, int[] USDunits, int[] USDcount) {
		System.out.printf("\n*달러로 환전 결과 : %.2f 달러\n", exchangeResult);		
		System.out.println("*달러 지급 : " + usd + "달러");

		for (int i = 0; i < USDunits.length; i++) {
			System.out.printf("%d달러권: %d장 \n", USDunits[i], USDcount[i]);
		}
	}
	
	public void printEUR(double exchangeResult, int eur, int[] EURunits, int[] EURcount) {
		System.out.printf("\n*유로로 환전 결과 : %.2f 유로\n", exchangeResult);		
		System.out.println("*유로 지급 : " + eur + "유로");

		for (int i = 0; i < EURunits.length; i++) {
			System.out.printf("%d유로권: %d장 \n", EURunits[i], EURcount[i]);
		}
	}

	public void printJPY(double exchangeResult, int jpy, int[] JPYunits, int[] JPYcount) {
		System.out.printf("\n*엔화로 환전 결과 : %.2f 엔\n", exchangeResult);		
		System.out.println("*엔화 지급 : " + jpy + "엔");

		for (int i = 0; i < JPYunits.length; i++) {
			System.out.printf("%d엔화권: %d장 \n", JPYunits[i], JPYcount[i]);
		}
	}
}
