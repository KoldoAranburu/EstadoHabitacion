package patron.state;

public class HabitacionMantenimiento implements HabitacionEstado {

	@Override
	public HabitacionEstado ocupar() {
		System.out.println("Estoy en mantenimiento.");
		return null;
	}

	@Override
	public HabitacionEstado liberar() {
		System.out.println("La habitación ha terminado con el mantenimiento.");
		return new HabitacionDisponibleOcupada();
	}

	@Override
	public HabitacionEstado limpiar() {
		System.out.println("Estoy en mantenimiento.");
		return null;
	}

	@Override
	public HabitacionEstado salir() {
		System.out.println("Estoy en mantenimiento.");
		return null;
	}
	
}
