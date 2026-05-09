//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
/*
    Se solicita modelar un sistema de gestión de personajes y películas del universo Marvel
    aplicando los conceptos de herencia, clases abstractas, interfaces y relaciones entre objetos en
    Java. El sistema deberá gestionar Héroes, Villanos y Películas en memoria, representando las
    relaciones entre ellos de forma orientada a objetos.

    En la clase Main se debe demostrar el funcionamiento completo del sistema:

    - Instanciar un objeto servicio vacío para cada entidad (heroeServicio, villanoServicio, peliculaServicio).
    - Crear 3 villanos de tu preferencia y guardarlos usando villanoServicio.guardar().
    - Crear 6 héroes de tu preferencia y guardarlos usando heroeServicio.guardar().
    - Imprimir todos los villanos con mostrarPerfil().
    - Imprimir todos los héroes con mostrarPerfil().
    - Armar 3 listas de héroes (una por película) recuperándolos con heroeServicio.obtenerPorId().
    - Crear 3 películas que te gusten del universo Marvel, asociando cada una a su Villano y su lista de héroes.
    - Guardar las películas y mostrar todas las fichas con mostrarFicha().
    - Buscar una película por ID con obtenerPorId() y mostrar su ficha.
    - Eliminar una película por ID con eliminar() y listar las películas restantes.

*/

import entidad.Heroe;
import entidad.Pelicula;
import entidad.Villano;

public class Main {
    public static void main(String[] args) {

        Heroe heroeServicio = new Heroe();
        Villano villanoServicio = new Villano();
        Pelicula peliculaServicio = new Pelicula();

        Villano thanos = new Villano(
                1,
                "Dione",
                "Thanos",
                "fuerza e inteligencia",
                1973,
                "eliminar el 50% de la poblacion"
        );
        villanoServicio.guardar(thanos);

        Villano loki = new Villano(
                2,
                "Loki Laufeyson",
                "Loki",
                "magia",
                1962,
                "eliminar a Thor como heredero"
        );
        villanoServicio.guardar(loki);

        Villano ultron = new Villano(
                3,
                "Ultron",
                "Ultron",
                "inteligencia",
                1968,
                "extinguir a la humanidad para lograr la \"paz mundial\" y forzar la evolución del planeta"
        );
        villanoServicio.guardar(ultron);

        Heroe ironMan = new Heroe(
                4,
                "Tony Stark",
                "Iron Man",
                "inteligencia",
                1963,
                "Avengers"
        );
        heroeServicio.guardar(ironMan);

        Heroe capitanAmerica = new Heroe(
                5,
                "Steve Rogers",
                "Capitan America",
                "fuerza",
                1940,
                "Avengers"
        );
        heroeServicio.guardar(capitanAmerica);

        Heroe spiderman = new Heroe(
                6,
                "Peter Parker",
                "Spiderman",
                "sentidos aracnidos",
                1962,
                "Avengers"
        );
        heroeServicio.guardar(spiderman);

        Heroe thor = new Heroe(
                7,
                "Thor Odinson",
                "Thor",
                "fuerza y manipulacion de elementos",
                1962,
                "Avengers"
        );
        heroeServicio.guardar(thor);

        Heroe viudaNegra = new Heroe(
                8,
                "Natasha Romanoff",
                "Black Widow",
                "fuerza",
                1964,
                "Avengers"
        );
        heroeServicio.guardar(viudaNegra);

        Heroe hulk = new Heroe(
                9,
                "Robert Bruce Banner",
                "Hulk",
                "fuerza",
                1962,
                "Avengers"
        );
        heroeServicio.guardar(hulk);

        for(Villano villano : villanoServicio.obtenerTodos()){
            villano.mostrarPerfil();
        }

        for(Heroe heroe : heroeServicio.obtenerTodos()){
            heroe.mostrarPerfil();
        }
    }
}