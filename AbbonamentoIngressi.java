package corso.test.javaAvanzato;

import java.time.LocalDate;

public class AbbonamentoIngressi extends Abbonamento {

	private int ingressi;

    public AbbonamentoIngressi(int ingressi) {
        this.ingressi = ingressi;
        										
    }
    
    
    public void entra() {
		
    	if (ingressi > 0) {
            System.out.println("Benvenuto nel nostro centro sportivo!");
            ingressi--;
        } else {
            System.out.println("Rinnovare abbonamento! Il tuo numero di accessi è terminato.");
        }

	}


	public void visualizza() {
		 System.out.println("Abbonamento Ingressi - ingressi disponibili " + ingressi);
	
	}

	
}
