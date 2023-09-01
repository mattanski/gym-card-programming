package corso.test.javaAvanzato;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		
//		
//		LocalDate date = new LocalDate(null,null,null);        
//		String dateToStr = DateFormatUtils.format(date, "yyyy-MM-dd HH:mm:SS");
//		System.out.println("Date is "+ dateToStr);

		
		ConnectDb connessioneDataBase3 = new ConnectDb();
		
		connessioneDataBase3.connect();
		
		connessioneDataBase3.getAbbonati("SELECT * FROM  Abbonati");
		
		
		//AbbonamentoMensile x = new AbbonamentoMensile(new LocalDate(22/02/01),new LocalDate(22/03/01));
		//AbbonamentoMensile y = new AbbonamentoMensile(null, null);
		AbbonamentoIngressi z =  new AbbonamentoIngressi(7);
		AbbonamentoIngressi l =  new AbbonamentoIngressi(0);
		
//		x.entra();
//		x.visualizza();
//		y.entra();
//		y.visualizza();
		z.entra();
		z.visualizza();
		l.entra();
		l.visualizza();
		
		
		// non ho solo avuto tempo di convertire il tempo in stringhe
		
	}

}
