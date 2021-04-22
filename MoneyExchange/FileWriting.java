package MoneyExchange;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class FileWriting {
	private FileWriter fw;
	boolean fileExistence;

	public FileWriting() throws IOException {
		File file = new File("C:\\Users\\���ҿ�\\Desktop\\ȯ�����.csv");

		if(file.exists() == false) fileExistence = false;
		else fileExistence = true;

		fw = new FileWriter("C:\\Users\\���ҿ�\\Desktop\\ȯ�����.csv", true);					
	}

	public void fileClose() throws IOException {
		fw.close();
	}

	public void headerWrite() throws IOException {
		if (fileExistence == false) {
			String header = "��¥,ȯ�����,�ݾ�,ȯ�����,�Ž�����\n";
			fw.write(header);
		} 
	}
	
	public void FileWrite(ExchangeType exType) throws IOException {
		String tempToWrite = "";

		Calendar cal = Calendar.getInstance();
		SimpleDateFormat dfm = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

		tempToWrite += dfm.format(cal.getTime()) + ",";
		tempToWrite += exType.exchagetype + ",";
		tempToWrite += String.valueOf(exType.w) + ",";
		tempToWrite += String.valueOf(exType.ex_result) + ",";
		tempToWrite += String.valueOf((int)exType.cw);

		fw.write(tempToWrite + "\n");
	}
}
