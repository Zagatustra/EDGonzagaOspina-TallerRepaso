package ejecutables;

public class EjecutablesFuncionesEnCadena {
    public static void main (String[] args) {
        saludar();
    }
    public static void saludar(){
        System.out.println("Hola");
        mostrarDia();
    }
    public static void mostrarDia(){
        System.out.println("Viernes");
        mostrarHora();
    }
    public static void mostrarHora(){
        System.out.println("4:00 pm");
    }

}
