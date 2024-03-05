package patron.state;

public interface HabitacionEstado {
	public HabitacionEstado ocupar();
	public HabitacionEstado liberar();
	public HabitacionEstado limpiar();
	public HabitacionEstado salir();
 
 
}
