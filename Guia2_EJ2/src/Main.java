/*La Conmebol está interesada en conocer datos estadísticos de los partidos de la Copa
América de fútbol “USA 2024” y además el monto recaudado por los mismos. Para ellos
posee un sistema de administración de partidos. El sistema contiene todos los partidos
de la copa..
De cada partido se conoce a los equipos que se enfrentaron y el estadio donde se jugó el
partido. Además de cada partido se conoce el valor de la entrada. Si bien los diferentes
partidos tienen valores diferentes, en el mismo partido todas las entradas tienen el
mismo valor.
De cada estadio se conoce su capacidad total de espectadores, la cual una vez creado el
estadio la misma no varía. */

import classes.*;

public class Main {


    public static void main(String[] args) {

        SistemaCopa2024 s1 = new SistemaCopa2024("SistemaCopita");
        Equipo team1 = new Equipo("Argentina");
        Equipo team2 = new Equipo("Alemania");
        Equipo team3 = new Equipo("Colombia");
        Equipo team4 = new Equipo("Brazil");
        Estadio estadio1= new Estadio("Brasil","Maracana",100000);
        Estadio estadio2= new Estadio("Brazil","Sao Paulinho",50000);
        Jugador j1 = new Jugador("MESSI","DC",36,"InterMiami");
        team1.addJugador(j1);
        Partido partido1= new Partido(estadio1,team1,team2,2,9,24,9,30);
        Partido partido2 = new Partido(estadio2,team3,team4,10);
        s1.addPartido(partido1);
        s1.addPartido(partido2);
        System.out.println(team1.toString());
        System.out.println(partido1.toString());

        System.out.println(s1.cantidadTotalEspectadores());
        System.out.println(s1.estadioMasGrande());
        System.out.println(s1.montoTotalRecaudado());




        }
    }
