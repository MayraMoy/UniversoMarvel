package interfaz;

/*
Crear la interfaz IVillano en el paquete interfaz con el siguiente contrato:
- Un procedimiento, llamado guardar, que no retorna nada y recibe como parámetro un objeto de tipo Villano.
- Un metodo que retorna una List de tipo Villano, llamado obtenerTodos.
- Un metodo que retorna un objeto de tipo Villano, llamado obtenerPorId, que debe recibir por parámetro un int idVillano.
*/

import entidad.Villano;

import java.util.List;

public interface IVillano {
    void guardar(Villano villano);
    List<Villano> obtenerTodos();
    Villano obtenerPorId(int idVillano);
}
