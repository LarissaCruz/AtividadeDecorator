package src;

public class CarroLuxo implements Carro{

	boolean alertas ;
	boolean airbag ;
	@Override
	public void construir() {
		// TODO Auto-generated method stub
		System.out.println("Carro Construido....");
	}

	@Override
	public void decorar() {
		// TODO Auto-generated method stub
		alertas = true ;
		airbag = true ;
		System.out.println("Agora esse Carro possui Alertas e Airbag de segurança...");
	}

}
