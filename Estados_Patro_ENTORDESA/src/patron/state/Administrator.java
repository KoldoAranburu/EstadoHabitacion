package patron.state;

public class Administrator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Habitacion h= new Habitacion();
		h.ocupar();
		h.limpiar();
		h.liberar();
		h.ocupar();
		h.limpiar();
		h.liberar();
		h.ocupar();
		h.salir();
		h.ocupar();

	}

}
