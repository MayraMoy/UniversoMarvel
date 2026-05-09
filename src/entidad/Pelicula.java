package entidad;

import interfaz.IPelicula;

import java.util.ArrayList;
import java.util.List;

/*
Crear la clase Pelicula en el paquete entidad que: Implemente la interfaz IPelicula (Esto se hará a lo último, dado que aún no está creada la interfaz).
Debe agregarse lo siguiente:
Atributos:
        - id de tipo entero
        - titulo de tipo texto
        - saga de tipo texto (ej: "Infinity Saga", "Multiverse Saga")
        - anioEstreno de tipo entero
        - duracionMinutos de tipo entero
        - sinopsis de tipo texto
        - villano de tipo Villano: una película tiene un solo villano
        - lista de héroes de tipo Heroe: una película de Marvel tiene varios héroes.
Métodos:
a. Métodos Propios: Constructores: uno vacío y otro con parámetros. Getter y Setter de todos los atributos.
                    - calcularAntiguedad() que debe retornar la diferencia entre el año actual y anioEstreno.
                    - esClasica() que debe retornar true si la antigüedad es mayor o igual a 10 años (retorno de tipo boolean).
                    - mostrarFicha() que no retorna nada e imprime todos los datos de la película, el alias completo del villano y
                    recorre la lista de héroes mostrando el alias completo de cada uno.

A tener en cuenta:
- Al imprimir ¿Es clásica?, debe imprimir sí o no y NO un booleano como true o false.
- Al imprimir Villano, podemos aprovechar a llamar villano.getAliasCompleto() directamente.
- Al imprimir todos los héroes, primero validar que la lista no es null ni está vacía. Si no lo es, imprimirla con un forEach. Caso contrario, mostrar el aviso: "Sin héroes registrados en el equipo".

b. Métodos de la Interfaz IPelicula: una vez que armes la interfaz, implementás lo siguientes métodos:

Nota: Primero crear una lista de tipo Pelicula que va a simular una base de datos en local.

                    - guardar() que agrega la película a la lista (validando que no sea null).
                    - obtenerTodos() que retorna la lista completa.
                    - obtenerPorId() que busca por id con un for, retorna null si no encuentra.
                    eliminar() que busca por id y elimina la película de la lista, informando el resultado.
*/
public class Pelicula implements IPelicula {
    private int id;
    private String titulo;
    private String saga;
    private int anioEstreno;
    private int duracionMinutos;
    private String sinopsis;
    private Villano villano;
    private List<Heroe> listaHeroes;

    public Pelicula() {
    }

    public Pelicula(int id, String titulo, String saga, int anioEstreno, int duracionMinutos, String sinopsis, Villano villano, List<Heroe> listaHeroes) {
        this.id = id;
        this.titulo = titulo;
        this.saga = saga;
        this.anioEstreno = anioEstreno;
        this.duracionMinutos = duracionMinutos;
        this.sinopsis = sinopsis;
        this.villano = villano;
        this.listaHeroes = listaHeroes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getSaga() {
        return saga;
    }

    public void setSaga(String saga) {
        this.saga = saga;
    }

    public int getAnioEstreno() {
        return anioEstreno;
    }

    public void setAnioEstreno(int anioEstreno) {
        this.anioEstreno = anioEstreno;
    }

    public int getDuracionMinutos() {
        return duracionMinutos;
    }

    public void setDuracionMinutos(int duracionMinutos) {
        this.duracionMinutos = duracionMinutos;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public Villano getVillano() {
        return villano;
    }

    public void setVillano(Villano villano) {
        this.villano = villano;
    }

    public List<Heroe> getListaHeroes() {
        return listaHeroes;
    }

    public void setListaHeroes(List<Heroe> listaHeroes) {
        this.listaHeroes = listaHeroes;
    }

    public int calcularAntiguedad(){
        return 2026 - anioEstreno;
    }

    public boolean esClasica(){
        if (calcularAntiguedad() >= 10 ){
            return true;
        }
        else {
            return false;
        }
    }

    public void mostrarFicha(){
        System.out.println("");
        System.out.println("---- Planilla de Peliculas ----");
        System.out.println("id: " + id);
        System.out.println("titulo: " + titulo);
        System.out.println("saga: " + saga);
        System.out.println("anio de estreno: " + anioEstreno);
        System.out.println("duracion de minutos: " + duracionMinutos);
        System.out.println("sinopsis: " + sinopsis);
        System.out.println("villano: " + villano.getAliasCompleto());

        if(listaHeroes != null && !listaHeroes.isEmpty()){
            System.out.println("Heroes: ");

            for(Heroe heroe : listaHeroes){
                System.out.println(heroe.getAliasCompleto());
            }

        }
        else{
            System.out.println("Sin héroes registrados en el equipo");
        }

        if(esClasica()){
            System.out.println("Si");
        } else {
            System.out.println("No");
        }
    }

    private static List<Pelicula> listaPeliculas = new ArrayList<>();

    @Override
    public void guardar(Pelicula pelicula){
        if (pelicula != null){
            listaPeliculas.add(pelicula);
            System.out.println("pelicula guardada...");
        }
        else {
            System.out.println("complete todos los datos");
        }
    }

    @Override
    public List<Pelicula> obtenerTodos() {
        return listaPeliculas;
    }

    @Override
    public Pelicula obtenerPorId(int idPelicula){
        for (Pelicula pelicula : listaPeliculas){
            if (pelicula.getId() == idPelicula){
                return pelicula;
            }
        }
        return null;
    }

    @Override
    public void eliminar(int idPelicula){

        Pelicula peliculaEliminada = null;

        for(Pelicula pelicula : listaPeliculas){

            if(pelicula.getId() == idPelicula){
                peliculaEliminada = pelicula;
            }
        }

        if(peliculaEliminada != null){
            listaPeliculas.remove(peliculaEliminada);
            System.out.println("pelicula eliminada correctamente...");
        } else {
            System.out.println("pelicula no encontrada");
        }
    }
}
