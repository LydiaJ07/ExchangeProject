package MoneyExchange;

public class Output {
	public void printWon (double cw, int returnWon, int[] KRWunits, int[] KRWcount) {
		System.out.printf("\n*��ȭ �Ž����� : %.2f ��\n",cw);
		System.out.println("*���� ���� ��ȭ �Ž��� : " + returnWon + "��");

		for (int i = 0; i < KRWunits.length; i++) {
			System.out.printf("%d����: %d�� \n", KRWunits[i], KRWcount[i]);
		}
		System.out.println();
	}
	
	public void printUSD(double exchangeResult, int usd, int[] USDunits, int[] USDcount) {
		System.out.printf("\n*�޷��� ȯ�� ��� : %.2f �޷�\n", exchangeResult);		
		System.out.println("*�޷� ���� : " + usd + "�޷�");

		for (int i = 0; i < USDunits.length; i++) {
			System.out.printf("%d�޷���: %d�� \n", USDunits[i], USDcount[i]);
		}
	}
	
	public void printEUR(double exchangeResult, int eur, int[] EURunits, int[] EURcount) {
		System.out.printf("\n*���η� ȯ�� ��� : %.2f ����\n", exchangeResult);		
		System.out.println("*���� ���� : " + eur + "����");

		for (int i = 0; i < EURunits.length; i++) {
			System.out.printf("%d���α�: %d�� \n", EURunits[i], EURcount[i]);
		}
	}

	public void printJPY(double exchangeResult, int jpy, int[] JPYunits, int[] JPYcount) {
		System.out.printf("\n*��ȭ�� ȯ�� ��� : %.2f ��\n", exchangeResult);		
		System.out.println("*��ȭ ���� : " + jpy + "��");

		for (int i = 0; i < JPYunits.length; i++) {
			System.out.printf("%d��ȭ��: %d�� \n", JPYunits[i], JPYcount[i]);
		}
	}
}
