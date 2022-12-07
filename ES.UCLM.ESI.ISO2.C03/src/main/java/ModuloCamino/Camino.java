package ModuloCamino;
import java.util.*;

public class Camino {

	private String Nombre;
	private Collection<String> Fotos;
	private String Descripcion;

	public String getNombre() {
		return this.Nombre;
	}

	public Collection<String> getFotos() {
		return this.Fotos;
	}

	public void setFotos(Collection<String> Fotos) {
		this.Fotos = Fotos;
	}

	public String getDescripcion() {
		return this.Descripcion;
	}

	public void setDescripcion(String Descripcion) {
		this.Descripcion = Descripcion;
	}

}