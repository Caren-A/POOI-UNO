package juegoEstrategia;

/*Los arqueros pueden atacar a una distancia de entre 2 y 5 respecto de su enemigo, y si tienen
suficientes flechas. Comienzan con 20 flechas en su carcaj, y pueden recargar si reciben un paquete de seis 
flechas. Infringen un daño de 5 puntos, y comienzan con 50 de salud*/

public class Arquero extends Unidad{
	
	// ATRIBUTOS
	private int flechas;
	private static final int DANIO = 5;
	
	// CONSTRUCTOR
	public Arquero(Punto posicion) {
		super(50, posicion); 
		this.flechas = 20;
	}
	
	@Override
	public void atacar(Unidad u) {

		if (puedeAtacar(u))
			
			u.recibirDanio(u.danio);
		    u.setSalud(u.getSalud() - DANIO);
		    this.flechas--;
		}

	@Override
	public void infringirDanio(Unidad u) {
		u.recibirDanio(getDanio());
	}
		

	@Override
	public boolean puedeAtacar(Unidad u) {
		return (!u.estaMuerta() && (this.distancia(u) >= 2 && this.distancia(u) <= 5) && (this.flechas >= 6 && this.flechas <= 20));
		// SI NO ESTA MUERTA Y LA DISTANCIA ESTA ENTRE 2 Y 5M, Y SI LAS FLECHAS SON MAYORES A 6 Y MENOR A 20
	}
	
	
	//SETTERS - GETTERS
	public void setFlechas(int flechas) { // RECARGA DE FLECHAS
		if(flechas == 6) 
			flechas += 6;
		else
			throw new Error("No se puede procesar la recarga");
	}

	public int getFlechas() {
		return flechas;
	}
	
	@Override
	public int getDanio() {
		return DANIO;
	}
	
}
