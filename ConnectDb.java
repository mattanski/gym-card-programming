package corso.test.javaAvanzato;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;






public class ConnectDb {

	private final String url = "jdbc:postgresql://localhost:5432/db_palestra";					//dobbiamo usare un url predefinto 
	private final String user = "postgres";												// se avremmo usato sql avremmo inserito mysql
	private final String password = "password";
	
	private ArrayList<Abbonato> abbonatoList;
	private final String insertAbbonatoSQL = "INSERT INTO abbonati (nome, cognome, numeroTessera) VALUES (?,?,?);"; 
	
	
	
	public Connection connect() {
		
		this.abbonatoList = new ArrayList<Abbonato>();
		Connection connessione = null;
		
		try {	 // il try-catch non ha bisogno di if, e se va in errore bugga anche alla prima linea
			
			connessione = DriverManager.getConnection(url, user, password);
			System.out.println("Connessione riuscita");
			
			
		}catch(SQLException e){
			System.out.println(e.getMessage());
			System.err.println("CONNESSIONE NON RIUSCITA");
			
			return connessione;
			
		}
		
		return connessione;
		
	}
	
	
	public void getAbbonati(String query) {
		
		String querySql = query;
		
		try {
			Connection connessione = connect();
			Statement stmt = connessione.createStatement();     
			ResultSet rs = stmt.executeQuery(querySql); 
			System.out.println("Query eseguita correttamente");
			this.abbonatoList=addAbbonatoList(rs);		// popolami la lista
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			System.err.println("Query non eseguita correttamente");
		}
		
		System.out.println(this.abbonatoList.toString());
	}
	
	
	// ci ritornerà  una lista (è come un metodo statico perchè lo utlizzeremo solo all'interno di altri metodi come quello che sta sopra)
	//va a prendere i dati delle colonne dal databse e le mette nella lista
	public ArrayList<Abbonato> addAbbonatoList(ResultSet rs) throws SQLException{
		
		  ArrayList<Abbonato>  abbonatoList = new ArrayList<Abbonato>();
		
		while(rs.next()){  					 // next() andrà a prenderci uno alla volta gli elementi che sono presenti nel Result Set
			Abbonato p = new Abbonato();
			p.setNome(rs.getString("nome"));
			p.setCognome(rs.getString("cognome"));
			p.setNumeroTessera(rs.getString("numerotessera"));
			p.setTipologiaAbbonamento();
			
			abbonatoList.add(p);
		}
		
		return abbonatoList;
	}



	
	
	
	
}
