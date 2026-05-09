package interfaz;

/*
    Crear la interfaz IHeroe en el paquete interfaz con el siguiente contrato:
    - Un procedimiento, llamado guardar, que no retorna nada y recibe como parámetro un objeto de tipo Heroe.
    - Un metodo que retorna una List de tipo Heroe, llamado obtenerTodos.
    - Un metodo que retorna un objeto de tipo Heroe, llamado obtenerPorId, que debe recibir por parámetro un int idHeroe.
*/

import entidad.Heroe;
import java.util.List;

public interface IHeroe {
    void guardar(Heroe heroe);
    List<Heroe> obtenerTodos();
    Heroe obtenerPorId(int idHeroe);
}
