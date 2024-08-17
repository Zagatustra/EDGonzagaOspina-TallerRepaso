package modelo;

public class Factura {
    private int valorTotal;

    public Factura() {
        this.valorTotal = 0;
    }

    public Factura(int valorTotal) {
        this.valorTotal = valorTotal;
    }

    public int getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(int valorTotal) {
        this.valorTotal = valorTotal;
    }
}
