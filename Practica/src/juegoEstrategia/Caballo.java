package juegoEstrategia;

public class Caballo implements Bebedor{
	
	// ATRIBUTOS
	private boolean rebelde = false; //Un caballo se pone rebelde luego de 3 ataques, y puede calmarse si recibe una pocion de agua
	public int cantidadAtaque = 0;
	
	// METODOS
	@Override
	public void beberAgua() {
		this.rebelde = true;
		this.cantidadAtaque = 0;
	}
	
	public void incrementarAtaque() {
		this.cantidadAtaque++;
	}
}

