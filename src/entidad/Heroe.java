package entidad;

import interfaz.IHeroe;

import java.util.ArrayList;
import java.util.List;

/*
    Crear la clase Heroe en el paquete entidad que: Herede de Personaje. Implemente la interfaz IHeroe (Esto se hará a lo último,
    dado que aún no está creada la interfaz).

    - Atributos: equipo que será de tipo String (ej: "Avengers", "X-Men", "Guardianes de la Galaxia").

    - Métodos:
            - Propios: Constructores: uno vacío y otro con parámetros. Recordá que está heredando de Personaje. Getter y Setter de equipo.
            - De la clase Padre: Sobreescribir los métodos getAliasCompleto() y calcularAntiguedad(). Recordar el uso de la
            palabra clave super para heredar. Sobreescribir el metodo mostrarPerfil(), donde debe imprimir: id, alias completo, tipo de poder,
            antigüedad y, además, el equipo al que pertenece.
            - De la interfaz: una vez que armes la interfaz IHeroe, implementá los siguientes métodos
               Nota: Primero crear una lista de tipo Heroe que va a simular una base de datos en local.
                    - guardar() que agrega el héroe a la lista (validando que no sea null).
                    - obtenerTodos() que retorna la lista completa.
                    - obtenerPorId() que busca por id con un for, retorna null si no encuentra.
*/
public class Heroe extends Personaje implements IHeroe {
    private String equipo;

    public Heroe() {
    }

    public Heroe(int idPersonaje, String nombrePersonaje, String aliasPersonaje, String tipoDePoder, int anioCreacion, String equipo) {
        super(idPersonaje, nombrePersonaje, aliasPersonaje, tipoDePoder, anioCreacion);
        this.equipo = equipo;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    @Override
    public String getAliasCompleto(){
        return super.getAliasCompleto();
    }

    @Override
    public int calcularAntiguedad(){
        return super.calcularAntiguedad();
    }

    @Override
    public void mostrarPerfil(){
        System.out.println("");
        System.out.println("---- Planilla de Personajes Heroes ----");
        System.out.println("id: " + idPersonaje);
        System.out.println("nombre: " + getAliasCompleto());
        System.out.println("tipo de poder: " + tipoDePoder);
        System.out.println("antiguedad: " + calcularAntiguedad());
        System.out.println("equipo: " + equipo);
        System.out.println("");
    }

    private static List<Heroe> listaHeroes = new ArrayList<>();

    @Override
    public void guardar(Heroe heroe){
        if (heroe != null){
            listaHeroes.add(heroe);
            System.out.println("guardando heroe...");
        }
        else {
            System.out.println("complete todos los datos");
        }
    }

    @Override
    public List<Heroe> obtenerTodos() {
        return listaHeroes;
    }

    @Override
    public Heroe obtenerPorId(int id) {
        for (Heroe heroes : listaHeroes){
            if (heroes.getIdPersonaje() == id){
                return heroes;
            }
        }
        return null;
    }

}
