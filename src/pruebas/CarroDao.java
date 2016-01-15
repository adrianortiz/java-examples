package pruebas;

public interface CarroDao {
	
	public String kilometrosPorHora( Carro carro );
	public boolean save( Carro carro );
	public boolean update( Carro carro );
	public boolean delete( Carro carro );
	public boolean read();
	
}
