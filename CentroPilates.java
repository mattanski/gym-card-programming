package corso.test.javaAvanzato;

public class CentroPilates implements Ingresso {
	
	private AbbonamentoMensile abbonamentoMensile;
    private AbbonamentoIngressi abbonamentoIngressi;

    public CentroPilates(AbbonamentoMensile abbonamentoMensile, AbbonamentoIngressi abbonamentoIngressi) {
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
        
   
        abbonamentoIngressi.visualizza();
    }
}
