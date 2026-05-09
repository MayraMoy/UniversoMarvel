package interfaz;

import entidad.Pelicula;

import java.util.List;

/*
Crear la interfaz IPelicula en el paquete interfaz con el siguiente contrato:
- Un procedimiento, llamado guardar, que no retorna nada y recibe como parámetro un objeto de tipo Pelicula.
- Un metodo que retorna una List de tipo Pelicula, llamado obtenerTodos().
- Un metodo que retorna un objeto de tipo Pelicula, llamado obtenerPorId, que debe recibir por parámetro un int idPelicula.
- Un procedimiento, que no retorna nada, llamado eliminar y que recibe como parámetro un int idPelicula.
*/
public interface IPelicula {
    void guardar(Pelicula pelicula);
    List<Pelicula> obtenerTodos();
    Pelicula obtenerPorId(int idPelicula);
    void eliminar(int idPelicula);
}
