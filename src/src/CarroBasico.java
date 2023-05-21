package src;

public class CarroBasico implements Carro{
	boolean alertas ;
	@Override
	public void construir() {
		// TODO Auto-generated method stub
		System.out.println("Carro Construido....");
	}

	@Override
	public void decorar() {
		// TODO Auto-generated method stub
		alertas = true ;
		System.out.println("Decorando carros....");
	}


	

}