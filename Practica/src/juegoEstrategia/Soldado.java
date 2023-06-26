package juegoEstrategia;

/*Los soldados pueden atacar cuerpo a cuerpo a otras unidades si tienen suficiente energia. Cada
ataque les consume 10 puntos de energia, y comienzan con 100. Restauran energia si reciben la
pocion de agua. Infringen un daño de 10 puntos y comienzan con 200 de salud*/

public class Soldado extends Unidad implements Bebedor {

	// ATRIBUTOS
	public int energia;
	private static final int DANIO = 10;

	// CONSTRUCTOR
	public Soldado(Punto posicion) {
		super(200, posicion); 
		this.energia = 100;
	}
	
	// METODOS
	@Override
	public void atacar(Unidad u) {
		
		if(puedeAtacar(u)) 
			this.energia -= 10;
		    u.recibirDanio(danio); 
		    u.setSalud(u.getSalud() - DANIO);

}
	@Override
	public void infringirDanio(Unidad u) {
		u.recibirDanio(u.getDanio());
		
	}

	
	@Override
	public boolean puedeAtacar(Unidad u) {
		return (!u.estaMuerta() && u.distancia(u) == 0 && this.energia >= 10);
		// SI NO ESTA MUERTA Y LA DISTANCIA ENTRE AMBAS UNIDADES ES = 0 Y SU ENERGIA ES MAYOR-IGUAL A 10 -> PUEDO ATACAR (TRUE)
	}

	@Override
	public void beberAgua() {
		this.energia = 100;
	}

	// GETTERS
	public int getEnergia() {
		return this.energia;
	}

	public void setEnergia(int energia) {
		this.energia = energia;
	}
	
	@Override
	public int getDanio() {
		return DANIO;
	}
	
	@Override 
	public void setDanio(int danio) {
		this.danio = danio;
	}
}
