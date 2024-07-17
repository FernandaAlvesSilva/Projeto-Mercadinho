
package mercadinho;

public class Mercadinho {

    public static void main(String[] args) {
 Produto Maca = new Produto();
 Maca.nome = "Maca"; 
 Maca.preco = 0.99;
 Maca.quantidade = 15;
 Maca.mostrar();
 
 Produto Leite = new Produto();
 Leite.nome = "Leite"; 
 Leite.preco = 7.99;
 Leite.quantidade = 10;
 Leite.mostrar();
 
 Produto Agua = new Produto();
 Agua.nome = "Agua"; 
 Agua.preco = 1.99;
 Agua.quantidade = 20;
 Agua.mostrar();


    }
    
}
