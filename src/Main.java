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

import java.util.ArrayList;
import java.util.List;

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

        /*System.out.println("Mayra Moyano");*/

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

        List<Heroe> theAvengers = new ArrayList<>();
        theAvengers.add(heroeServicio.obtenerPorId(4));
        theAvengers.add(heroeServicio.obtenerPorId(5));
        theAvengers.add(heroeServicio.obtenerPorId(7));

        List<Heroe> ageOfUltron = new ArrayList<>();
        ageOfUltron.add(heroeServicio.obtenerPorId(8));
        ageOfUltron.add(heroeServicio.obtenerPorId(9));
        ageOfUltron.add(heroeServicio.obtenerPorId(4));

        List<Heroe> infinityWar = new ArrayList<>();
        infinityWar.add(heroeServicio.obtenerPorId(6));
        infinityWar.add(heroeServicio.obtenerPorId(4));
        infinityWar.add(heroeServicio.obtenerPorId(5));

        Pelicula theAvengerss = new Pelicula(
                1,
                "The Avengers",
                "Saga del Infinito",
                2012,
                142,
                "El director de la Agencia SHIELD decide reclutar a un equipo para salvar al mundo de un desastre casi seguro cuando un enemigo inesperado surge como una gran amenaza para la seguridad mundial.",
                loki,
                theAvengers
        );
        peliculaServicio.guardar(theAvengerss);

        Pelicula ageOfUltronn = new Pelicula(
                2,
                "Age Of Ultron",
                "Saga del Infinito",
                2015,
                141,
                "Los Vengadores se reúnen de nuevo y juntan sus fuerzas con las de los recién llegados Quicksilver y Bruja Escarlata para luchar contra un robot maquiavélico llamado Ultrón, el cual Tony Stark creó con el fin de defender la paz, pero resultó defectuoso y ahora pretende exterminar a toda la humanidad.",
                ultron,
                ageOfUltron
        );
        peliculaServicio.guardar(ageOfUltronn);

        Pelicula infinityWarr = new Pelicula(
                3,
                "Infinity War",
                "Saga del Infinito",
                2018,
                156,
                "Los superhéroes se alían para vencer al poderoso Thanos, el peor enemigo al que se han enfrentado. Si Thanos logra reunir las seis gemas del infinito: poder, tiempo, alma, realidad, mente y espacio, nadie podrá detenerlo.",
                thanos,
                infinityWar

        );
        peliculaServicio.guardar(infinityWarr);

        for(Pelicula pelicula : peliculaServicio.obtenerTodos()){
            pelicula.mostrarFicha();
        }

        Pelicula buscarPelicula = peliculaServicio.obtenerPorId(3);
        buscarPelicula.mostrarFicha();


        peliculaServicio.eliminar(1);

        for(Pelicula pelicula : peliculaServicio.obtenerTodos()){
            pelicula.mostrarFicha();
        }

    }
}