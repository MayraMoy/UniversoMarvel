package entidad;

/*
Crear la clase Villano en el paquete entidad que: Herede de Personaje. Implemente la interfaz IVillano (Esto se hará a lo último, dado que aún no está creada
la interfaz).

Además, debe agregarse lo siguiente:

Atributos: Un atributo propio llamado planMalvado que será de tipo String (ej: "Dominar el mundo", "Destruir Asgard", "Conseguir las Gemas del Infinito").

Métodos:
a. Métodos propios: Constructores: uno vacío y otro con parámetros. Recordá que está heredando de Personaje. Getter y Setter de planMalvado.
b. De la clase Padre: Sobreescribir los metodos de la clase Padre: getAliasCompleto() y calcularAntiguedad(). Recordar el uso de la palabra clave super
                      para heredar.
                      Sobreescribir el metodo mostrarPerfil(), donde debe imprimir: id, alias completo, tipo de poder, antigüedad y, además, el plan malvado.
c. De la Interfaz: una vez que armes la interfaz IVillano, implementás los siguientes métodos:
Nota: Primero crear una lista de tipo Villano que va a simular una base de datos en local.
        - guardar() que agrega el villano a la lista (validando que no sea null).
        - obtenerTodos() que retorna la lista completa.
        - obtenerPorId() que busca por id con un for, retorna null si no encuentra.
*/

import interfaz.IVillano;

import java.util.ArrayList;
import java.util.List;

public class Villano extends Personaje implements IVillano {
    private String planMalvado;

    public Villano() {
    }

    public Villano(int idPersonaje, String nombrePersonaje, String aliasPersonaje, String tipoDePoder, int anioCreacion, String planMalvado) {
        super(idPersonaje, nombrePersonaje, aliasPersonaje, tipoDePoder, anioCreacion);
        this.planMalvado = planMalvado;
    }

    public String getPlanMalvado() {
        return planMalvado;
    }

    public void setPlanMalvado(String planMalvado) {
        this.planMalvado = planMalvado;
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
        System.out.println("---- Planilla de Personajes Villanos ----");
        System.out.println("id: " + idPersonaje);
        System.out.println("nombre: " + getAliasCompleto());
        System.out.println("tipo de poder: " + tipoDePoder);
        System.out.println("antiguedad: " + calcularAntiguedad());
        System.out.println("plan malvado: " + planMalvado);
    }

    private static List<Villano> listaVillanos = new ArrayList<>();

    @Override
    public void guardar(Villano villano){
        if (villano != null ){
            listaVillanos.add(villano);
            System.out.println("guardando villano...");
        }
        else{
            System.out.println("complete todos los datos");
        }
    }

    @Override
    public List<Villano> obtenerTodos(){
        return listaVillanos;
    }

    @Override
    public Villano obtenerPorId(int idVillano){
        for (Villano villano : listaVillanos){
            if (villano.getIdPersonaje() == idVillano){
                return villano;
            }
        }
        return null;
    }
}
