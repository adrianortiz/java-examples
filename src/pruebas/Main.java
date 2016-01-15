package pruebas;

public class Main {
	
	public static void main(String[] args) {
		
		Carro tsuru = new Carro();
		Carro fiesta = new Carro("Ford", "Rojo", 2015, 2300.5);
		Carro mustang = new Carro("Negro");
		mustang.setModel(2010);
		
		tsuru.setMarca("Nissan");
		
		System.out.println( tsuru.getMarca() );

		fiesta.setColor("Rosa");
		System.out.println( "El color de mi Fiesta es: " + fiesta.getColor() );

		System.out.println( mustang.toString() );

		fiesta.setColor("Azul");
		System.out.println( "Ahora el color de mi Fiesta es: " + fiesta.getColor() );
		
		
		CarroDao cualidades = new CarroDaoImp();
		
		System.out.println("Tsuru: " + cualidades.kilometrosPorHora(tsuru));
		System.out.println("fiesta: " + cualidades.kilometrosPorHora(fiesta));
		System.out.println("mustang: " + cualidades.kilometrosPorHora(mustang));
		
	}
	
}
