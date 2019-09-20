package dad.maven.gson;
public class Persona {
	private String nombre;
	private String apellido;
	private Integer edad;
	
	
	public String getNombre() {
		return nombre;
	}
	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	protected void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public Integer getEdad() {
		return edad;
	}
	protected void setEdad(Integer edad) {
		this.edad = edad;
	}
}