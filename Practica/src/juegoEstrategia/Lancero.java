package juegoEstrategia;

//Los lanceros pueden atacar a una distancia de 1 a 3, sin condicion. Infringen un daño de 25 puntos, y comienzan con 150 de salud

public class Lancero extends Unidad{

	// ATRIBUTOS
	private static final int DANIO = 25;
	
	// CONSTRUCTOR
	public Lancero(Punto posicion) {
		super(150, posicion);
	}

	@Override
	public void atacar(Unidad u) {
		
		if(puedeAtacar(u))
			
		    u.recibirDanio(u.danio);
		    u.setSalud(u.getSalud() - DANIO);
			
	}

	@Override
	public void infringirDanio(Unidad u) {
		u.recibirDanio(getDanio());
	}
	
	@Override
	public boolean puedeAtacar(Unidad u) {
		return (!u.estaMuerta() && (u.distancia(u) >= 1 && u.distancia(u) <= 3));
		// SI NO ESTA MUERTA Y SI LA DISTANCIA ESTA ENTRE 1 Y 3
	}

	@Override
	public int getDanio() {
		return DANIO;
	}
}
