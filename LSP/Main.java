package SOLID_ENZO_DUTRA.LSP;

public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.descrever();

        Produto pizza = new Pizza();
        pizza.descrever();

        Produto hamburguer = new Hamburguer();
        hamburguer.descrever();

        Produto bebida = new Bebida();
        bebida.descrever();
    }
}
