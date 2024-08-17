package ejecutables;

import modelo.Factura;

public class EjecutableFactura{
    public static void main(String[]args ) {
        Factura[][] matrizFacturas=new Factura[4][4];
        for(int i=0;i<matrizFacturas.length;i++){
            for(int j=0;j<matrizFacturas[i].length;j++){
                matrizFacturas[i][j]=new Factura(i+j);
                //System.out.print(matrizFacturas[i][j].getValorTotal());
            }
            //System.out.println();
        }
        System.out.println(sumaFacturas(matrizFacturas));
        System.out.println(calcularPromedio(matrizFacturas));
    }
    public static int sumaFacturas(Factura[][] matrizFacturas){
        int sumaFacturas=0;
        for(int i=0;i<matrizFacturas.length;i++){
            for(int j=0;j<matrizFacturas[i].length;j++){
                sumaFacturas=sumaFacturas+matrizFacturas[i][j].getValorTotal();
                //System.out.print(matrizFacturas[i][j].getValorTotal());
            }
            //System.out.println();
        }
        return sumaFacturas;
    }
    public static double calcularPromedio(Factura[][] matrizFacturas) {
        int elementosMatriz = matrizFacturas.length*matrizFacturas[0].length;

        return (double) sumaFacturas(matrizFacturas) /elementosMatriz;

    }
}
