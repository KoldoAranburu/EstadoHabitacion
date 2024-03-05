package patron.state;

public class Habitacion {
	private HabitacionEstado estado;
	
	public Habitacion() {
		super();
		estado= new HabitacionDisponible();
		imp();
	}
	
	public void ocupar() {
		estado= estado.ocupar();
		imp();
		

	}
	public void liberar() {
		estado=estado.liberar();
		imp();
	}
	public void limpiar() {
		estado=estado.limpiar();
		imp();
	}
	public void salir() {
		estado=estado.salir();
		imp();
	}
	
	
	public void imp() {
		System.out.println("INFO: El estado actual de la habitacion es "+estado.toString());
	}
	

}
