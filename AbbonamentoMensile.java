package corso.test.javaAvanzato;

import java.time.LocalDate;

public class AbbonamentoMensile extends Abbonamento {

	private LocalDate inizio;
	private LocalDate fine;
	
	
	public AbbonamentoMensile(LocalDate inizio, LocalDate fine) {
        this.inizio = inizio;
        this.fine = fine;
    }

	
	
	
	public void entra() {
		LocalDate dataDelGiorno = LocalDate.now();
        if (dataDelGiorno.isAfter(inizio) && dataDelGiorno.isBefore(fine)) {
        	
            System.out.println("Benvenuto nel nostro centro sportivo!");
        } else {
            System.out.println("Rinnovare abbonamento! Il tuo abbonamento mensile è scaduto.");
		
        }
	}

        
        
	public void visualizza() {
		System.out.println("Abbonamento Mensile - start : " + inizio + "end : " + fine);
       
		
	}

	
	
}
