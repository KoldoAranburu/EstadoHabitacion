package patron.state;

public class HabitacionDisponibleOcupada implements HabitacionEstado{

	@Override
	public HabitacionEstado ocupar() {
		System.out.println("La habitacón esta ocupada.");
		return this;
	}

	@Override
	public HabitacionEstado liberar() {
		System.out.println("La habitacón esta limpia.");
		return new HabitacionOcupada();
	}

	@Override
	public HabitacionEstado limpiar() {
		System.out.println("La habitacón se esta limpindo.");
		return new HabitacionMantenimiento();
	}

	@Override
	public HabitacionEstado salir() {
		return new HabitacionOcupadaVacia();
	}

}
