package entidad;

/*
    Clase abstracta Personaje: Crear la clase padre, que debe ser abstracta, en el paquete entidad y que debe tener lo siguiente:

    - Atributos: id de tipo entero, nombre de tipo texto (ej: “Clark Kent”), alias de tipo texto (ej: “Superman”), tipoDePoder de tipo texto
    (ej: "Magia", "Tecnología", "Fuerza", "Mutante"), anioCreacion de tipo entero

    - Métodos: Constructores: uno vacío y otro con parámetros. Getters y Setters de todos los atributos. getAliasCompleto() que debe retornar un
    texto como: nombre + " '" + alias + "'". Ejemplo: "Clark Kent alias 'Superman'". calcularAntiguedad() que debe retornar el resultado de restar
    anioCreacion al año actual. mostrarPerfil() que se debe declarar como abstracto, para que cada subclase lo
    implemente con su propia información.
*/

public abstract class Personaje {
    protected int idPersonaje;
    protected String nombrePersonaje;
    protected String aliasPersonaje;
    protected String tipoDePoder;
    protected int anioCreacion;

    public Personaje() {
    }

    public Personaje(int idPersonaje, String nombrePersonaje, String aliasPersonaje, String tipoDePoder, int anioCreacion) {
        this.idPersonaje = idPersonaje;
        this.nombrePersonaje = nombrePersonaje;
        this.aliasPersonaje = aliasPersonaje;
        this.tipoDePoder = tipoDePoder;
        this.anioCreacion = anioCreacion;
    }

    public int getIdPersonaje() {
        return idPersonaje;
    }

    public void setIdPersonaje(int idPersonaje) {
        this.idPersonaje = idPersonaje;
    }

    public String getNombrePersonaje() {
        return nombrePersonaje;
    }

    public void setNombrePersonaje(String nombrePersonaje) {
        this.nombrePersonaje = nombrePersonaje;
    }

    public String getAliasPersonaje() {
        return aliasPersonaje;
    }

    public void setAliasPersonaje(String aliasPersonaje) {
        this.aliasPersonaje = aliasPersonaje;
    }

    public String getTipoDePoder() {
        return tipoDePoder;
    }

    public void setTipoDePoder(String tipoDePoder) {
        this.tipoDePoder = tipoDePoder;
    }

    public int getAnioCreacion() {
        return anioCreacion;
    }

    public void setAnioCreacion(int anioCreacion) {
        this.anioCreacion = anioCreacion;
    }

    public String getAliasCompleto(){
        return "nombre: " + nombrePersonaje + "alias: " + aliasPersonaje;
    }

    public int calcularAntiguedad(){
        return anioCreacion - 2026;
    }

    public abstract void mostrarPerfil();

}
