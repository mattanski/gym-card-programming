package corso.test.javaAvanzato;

public class Abbonato {

	private String nome;
	private String cognome;
	private String numeroTessera;
	private String tipologiaAbbonamento;
	

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public void setNumeroTessera(String numeroTessera) {
		this.numeroTessera = numeroTessera;
		
	}
	
	public void setTipologiaAbbonamento() {
		if(numeroTessera.contains("SPI")) {
			this.tipologiaAbbonamento = "abbonamento sala pesi ad ingressi";
		}else if(numeroTessera.contains("SPM")){
			this.tipologiaAbbonamento = "abbonamento sala pesi mensile";
		}else if(numeroTessera.contains("CPM")){
			this.tipologiaAbbonamento = "abbonamento centro pilates mensile";
		}else if(numeroTessera.contains("CPI")){
			this.tipologiaAbbonamento = "abbonamento centro pilates ad ingressi";
		}
		
	}
	
	
	
	
	@Override
	public String toString() {
		return " ABBONATO : " + nome + " "  + cognome + " --- NUMERO TESSERA : " + numeroTessera + " --- TIPOLOGIA TESSERA : " + tipologiaAbbonamento;		
	}
	

	 
}


