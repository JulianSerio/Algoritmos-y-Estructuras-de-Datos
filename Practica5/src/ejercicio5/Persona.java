package ejercicio5;

public class Persona {
	private boolean _jubilado;
	private String _nombre;
	private boolean _ultimoPago;
	private String direccion;
	
	public Persona(boolean _jubilado, String _nombre, boolean _ultimoPago) {
		this._jubilado = _jubilado;
		this._nombre = _nombre;
		this._ultimoPago = _ultimoPago;
	}

	public boolean is_jubilado() {
		return _jubilado;
	}

	public void set_jubilado(boolean _jubilado) {
		this._jubilado = _jubilado;
	}

	public String get_nombre() {
		return _nombre;
	}

	public void set_nombre(String _nombre) {
		this._nombre = _nombre;
	}

	public boolean is_ultimoPago() {
		return _ultimoPago;
	}

	public void set_ultimoPago(boolean _ultimoPago) {
		this._ultimoPago = _ultimoPago;
	}
	
	

}
