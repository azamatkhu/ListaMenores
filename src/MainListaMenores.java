import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class MainListaMenores {
    public static void main(String[] args) {
        List<Persona> personas = new ArrayList<>();

        personas.add(new Persona("Aday", 16));
        personas.add(new Persona("Unai", 99));
        personas.add(new Persona("Hugo", 18));
        personas.add(new Persona("Laminat", 21));
        personas.add(new Persona("Franchesco", 25));

        Iterator<Persona> iterator = personas.iterator();

        while (iterator.hasNext()) {
            Persona persona = iterator.next();
            if (persona.getEdad() < 18){
                iterator.remove();
            }
        }

        System.out.println("Las personas mayores de edad: ");
        for (Persona persona : personas) {
            System.out.println(persona.getNombre());
            System.out.println(persona.getEdad());
        }
    }
}