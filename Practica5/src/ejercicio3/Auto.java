package ejercicio3;

public class Auto {
	private int capacidadTanque;
	private int tanque;
	private int cantidadCargas;
	
	public Auto(int capacidadTanque, int tanque ) {
		this.capacidadTanque = capacidadTanque;
		this.tanque = tanque;
	}
	public Auto(int capacidadTanque, int tanque, int cantidadCargas) {
		this.capacidadTanque = capacidadTanque;
		this.tanque = tanque;
		this.cantidadCargas = 0;
	}
	
	public void cargar() {
		tanque = 0;
		tanque += capacidadTanque;
		cantidadCargas++;
	}
	
	public int getCapacidadTanque() {
		return capacidadTanque;
	}
	public void setCapacidadTanque(int capacidadTanque) {
		this.capacidadTanque = capacidadTanque;
	}
	public int getTanque() {
		return tanque;
	}
	public void setTanque(int tanque) {
		this.tanque = tanque;
	}
	public int getCantidadCargas() {
		return cantidadCargas;
	}
	public void setCantidadCargas(int cantidadCargas) {
		this.cantidadCargas = cantidadCargas;
	}
	
	
	

}
