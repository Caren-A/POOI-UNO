package juegoEstrategia;

/*Los caballeros pueden atacar a una distancia de 1 a 2, siempre que su caballo no se haya puesto
rebelde. Infringe un da�o de 50 puntos y comienza con 200 de salud. Un caballo se pone rebelde
luego de 3 ataques, y puede calmarse si recibe una pocion de agua.*/

public class Caballero extends Unidad {

	// ATRIBUTOS
	private static final int DANIO = 50;
	private Punto posicion;
	private Caballo caballo;

	
	public Caballero(Punto posicion, Caballo caballo) {
		super(200, posicion);
		this.caballo = caballo; 
		
	}

	@Override
	public void atacar(Unidad u) {
		
		if (puedeAtacar(u)) 
			
			u.infringirDanio(u);
			u.setSalud(u.getSalud() - DANIO);
			this.caballo.incrementarAtaque();
		}
	

	@Override
	public boolean puedeAtacar(Unidad u) {
		return (!u.estaMuerta() && this.distancia(u) >= 1 && this.distancia(u) <= 2 && this.caballo.cantidadAtaque < 3);
	}

	@Override
	public int getDanio() {
		
		return DANIO;
	}

}
