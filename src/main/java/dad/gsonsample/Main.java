package dad.gsonsample;

import java.util.Scanner;
import com.google.gson.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String nom;
		String apel;
		int eda;
		
		System.out.println("Nombre: ");
		nom=entrada.nextLine();
		
		System.out.println("Apellidos: ");
		apel=entrada.nextLine();
		
		System.out.println("Edad: ");
		eda=entrada.nextInt();
		
		Persona p = new Persona(nom, apel, eda);
		
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String json = gson.toJson(p);
		System.out.println(json);
		
		
	}

}
