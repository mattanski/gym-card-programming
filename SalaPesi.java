package corso.test.javaAvanzato;

public class SalaPesi implements Ingresso {
	
	private AbbonamentoMensile abbonamentoMensile;
	
	private AbbonamentoIngressi abbonamentoIngressi;

    public SalaPesi(AbbonamentoMensile abbonamentoMensile, AbbonamentoIngressi abbonamentoIngressi) {
    	
        this.abbonamentoMensile = abbonamentoMensile;
        this.abbonamentoIngressi = abbonamentoIngressi;
    }

    @Override
    public void entra() {
    	
        abbonamentoMensile.entra();
    }

    
    
    @Override
    public void visualizza() {
    	
        abbonamentoMensile.visualizza();
        
           abbonamentoIngressi.visualizza();  //implementare sulle classi
    }
}


