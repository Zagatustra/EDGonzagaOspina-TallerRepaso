package ejecutables;

public class EjecutableDeclaraciones {
    public static void main (String [] args){
        declararNumerosEnteros();
        declararNumerosDecimales();
        declararTextos();
        declararArreglos();
    }

    public static void declararNumerosEnteros(){
        int a=1;
        int b=2;
        int c=3;
        int d=4;
        System.out.println(a*b*c*d);
    }
    public static void declararNumerosDecimales(){
        double a =2.3;
        double b=1.4;
        double c=4.2;
        double d=3.2;
        System.out.println(a*b*c*d);

    }
    public static void declararTextos(){
        char char1='2';
        char char2='a';
        System.out.print(char1);
        System.out.println(char2);
        String str="texto1";
        String str2="texto2";
        System.out.println(str+str2);
    }
    public static void declararArreglos() {

        int numeros[] = {5, -1, 3, 4};
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(+numeros[i]+" ");
        }
        System.out.println();

        long numero1[] = {526, 789, 654};
        for (int i = 0; i < numero1.length; i++) {
            System.out.print(+numero1[i]+" ");
        }
        System.out.println();
        char letra[] = {'2', '4', 'c'};
        for (int i = 0; i < letra.length; i++) {
            System.out.print(+letra[i]+" ");
        }
        System.out.println();
        String palabra[] = {"Hola","Adios", "Cansado"};
        for (int i = 0; i < palabra.length; i++) {
            System.out.print(palabra[i] + " ");
        }
        System.out.println();

    }

}
