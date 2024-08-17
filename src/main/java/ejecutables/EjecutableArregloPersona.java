package ejecutables;

import modelo.Persona;

public class EjecutableArregloPersona {

    public static void main (String[] args){
        Persona p1 = new Persona("Pedro","Ospina","1094948276",29);
        Persona p2 = new Persona("Jaime","Benitez","1094948275",39);
        Persona p3 = new Persona("Sara","Ospina","1094948274",12);
        Persona p4 = new Persona("Sofia","Perez","1094948273",50);
        Persona p5 = new Persona("Jordy","Diaz","1094948272 ",2);

        Persona[] arreglo = {p5,p3,p1,p2,p4};

        System.out.println( buscarPersonaEdad(arreglo,13, 0,arreglo.length - 1));

    }

    public static String buscarPersonaEdad(Persona[] personas, int edadBuscada, int inicio, int fin) {
        if (inicio > fin) {
            return "No se encontro"; // No se encontró la persona
        }

        int medio = inicio + (fin - inicio) / 2;

        if (personas[medio].getEdad() == edadBuscada) {
            return personas[medio].getNombre();
        } else if (edadBuscada < personas[medio].getEdad()) {
            return buscarPersonaEdad(personas, edadBuscada, inicio, medio - 1);
        } else {
            return buscarPersonaEdad(personas, edadBuscada, medio + 1, fin);
        }
    }

}
