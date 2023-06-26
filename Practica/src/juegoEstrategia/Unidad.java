package juegoEstrategia;

public abstract class Unidad {

	// ATRIBUTOS
	protected int salud;
	private static Punto posicion;
	protected int danio;

	// CONSTRUCTOR
	public Unidad(int salud, Punto posicion) {
		this.salud = salud;
		this.posicion = posicion;
	}


	// METODOS
	public abstract void atacar(Unidad u);

	public abstract boolean puedeAtacar(Unidad u);

	public boolean estaMuerta() {
		return this.salud == 0; 
	}

	public double distancia(Unidad u) {
		return this.posicion.distancia(u.posicion);
	}
	
	public void recibirDanio(int danio) {
		this.salud -= this.danio;
	}
	
	public void infringirDanio(Unidad u) {
		u.recibirDanio(getDanio());
	}
	
	
	protected void setSalud(int salud) {
		this.salud = salud;
	}

	public abstract int getDanio(); 
	
	
	public int getSalud() {
		return salud;
	}
	

	@Override
	public String toString() {
		return "Unidad [salud=" + salud + ", posicion=" + posicion + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() +"]";
	}
		
	public static Punto getPosicion() {
		return posicion;
	}


	public void setDanio(int danio) {
		this.danio = danio;
		
	}

}
