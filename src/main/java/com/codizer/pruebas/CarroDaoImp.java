package com.codizer.pruebas;

public class CarroDaoImp implements CarroDao{

	@Override
	public String kilometrosPorHora(Carro carro) {
		
		int modeloCarro = carro.getModel();
		String mensaje = null;
		
		if(modeloCarro >= 2015){
			mensaje = "Usualmete corre más de 260 km/h";
		}
		
		if(modeloCarro < 2015){
			mensaje = "Usualmete corre menos de 250 km/h";
		}
		
		if(modeloCarro == 0) {
			mensaje = "El objeto está vácio";
		}
		
		return mensaje;
	}

	@Override
	public boolean save(Carro carro) {
		return false;
	}

	@Override
	public boolean update(Carro carro) {
		return false;
	}

	@Override
	public boolean delete(Carro carro) {
		return false;
	}

	@Override
	public boolean read() {
		return false;
	}

}
