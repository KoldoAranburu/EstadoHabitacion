package patron.state;

public class HabitacionOcupadaVacia implements HabitacionEstado {

	@Override
	public HabitacionEstado ocupar() {
		System.out.println("Bienvenidos a vuestra habitacion");
		return new HabitacionOcupada();
	}

	@Override
	public HabitacionEstado liberar() {
		System.out.println("La habitacion no ha cambiado de estado");
		return this;
	}

	@Override
	public HabitacionEstado limpiar() {
		System.out.println("La habitacion no ha cambiado de estado");
		return this;
	}

	@Override
	public HabitacionEstado salir() {
		System.out.println("La habitacion no ha cambiado de estado");
		return this;
	}

}
