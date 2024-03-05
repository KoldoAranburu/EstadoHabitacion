package patron.state;

public class HabitacionOcupada implements HabitacionEstado {

	@Override
	public HabitacionEstado ocupar() {
		System.out.println("La habitacion no ha cambiado de estado");
		return this;
	}

	@Override
	public HabitacionEstado liberar() {
		System.out.println("La habitacion necesita limpieza");
		return new HabitacionLimpieza();
	}

	@Override
	public HabitacionEstado limpiar() {
		System.out.println("La habitacion no se puede limpiar porque esta ocupada");
		return this;
	}

	@Override
	public HabitacionEstado salir() {
		System.out.println("La habitacion os espera a la vuelta");
		return new HabitacionOcupadaVacia();
	}

}
