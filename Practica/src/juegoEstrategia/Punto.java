package juegoEstrategia;

public class Punto {
	
	// ATRIBUTOS 
	private double x;
	private double y;
	
	// CONSTRUCTOR PARAMETRIZADO
	public Punto(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	// CONSTRUCTOR POR DEFECTO (SIN PARAMETROS)
	public Punto() {// DEJARLO VACIO ES DEJARLO EN NULL
		this(0,0); // ESTO ES IGUAL A LO DE ABAJO
		/*this.x = 0;
		  this.y = 0;*/
	}
	
	// METODOS - FUNCIONES
	public double distancia(Punto otroPunto) {
		// APLICO FORMULAS DEL TEOREMA DE PITAGORAS
		return Math.sqrt(Math.pow(this.x - otroPunto.x, 2) + Math.pow(this.y - otroPunto.y, 2));
		//de otra forma: 
		//return Math.hypot((this.x - otroPunto.x), (this.y - otroPunto.y)); 
	}
	
	public void desplazar(double deltaX, double deltaY){
		this.x += deltaX;
		this.y += deltaY;
	}
	
	// saber si el punto esta sobre el eje de las X
	public boolean estaSobreElEjeX() {
		return this.y == 0;
		// return y == 0;
	}
	
	// saber si el punto esta sobre el eje de las Y
	public boolean estaSobreElEjeY() {
		return this.x == 0;
		// return x == 0;
	}

	// saber si el punto es el origen de coordenadas.
	public boolean esElOrigenDeCoordenadas() {
		return (estaSobreElEjeX() && estaSobreElEjeY()); // FORMA PRO AHRE
		// return (this.x == 0 && this.y == 0);
	}
	
	
	// GETTERS (OBTENER) -> CONSULTAR EL VALOR DE LA VARIABLE
	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}
	
	// SETTERS -> ACTUALIZA/CAMBIA EL VALOR DE LA VARIABLE
	public void setX(double nuevoX) {
		this.x = nuevoX;
	}

	public void setY(double nuevaY) {
		this.y = nuevaY;
	}

	// SOBREESCRITURA
	@Override
	public String toString() {
		return "Punto [x = " + x + ", y = " + y + "]";
	}
	
}
