package dad.maven.gson;
import java.util.*;
import com.google.gson.*;
public class Aplicacion {

	public static void main(String[] args) {
		Persona p = new Persona();
		Scanner entrada= new Scanner(System.in);
		
		System.out.println("Dime tu nombre: ");
		p.setNombre(entrada.nextLine());
		System.out.println("Dime tu apellido: ");
		p.setApellido(entrada.nextLine());
		System.out.println("Dime tu edad: ");
		p.setEdad(entrada.nextInt());

		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String json = gson.toJson(p);
		System.out.println(json);
		
		entrada.close();
	}
}

