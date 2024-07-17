# Projeto Mercadinho - Encapsulamento com NetBeans

## Descrição Geral

No meu primeiro projeto de encapsulamento usando o NetBeans, desenvolvi um sistema simples para um mercadinho. Foi uma experiência incrível porque pude aplicar diretamente o que aprendi sobre programação orientada a objetos (POO). No projeto, criei classes para representar diferentes aspectos do mercadinho: produtos, clientes e transações de venda. Utilizei encapsulamento para proteger os dados dentro das classes e garantir que apenas os métodos apropriados tivessem acesso a eles.

## Objetivos do Projeto

- **Encapsulamento**: Proteger os dados dentro das classes.
- **Organização do Código**: Melhorar a manutenção e legibilidade do código.
- **Simulação de Operações**: Adicionar produtos ao estoque, registrar vendas e calcular o total de vendas diárias.
- **Aprendizado e Aplicação de POO**: Estruturar um projeto de software de forma eficiente e modular.

## Funcionalidades

- **Adicionar Produtos**: Simula a adição de novos produtos ao estoque.
- **Registrar Vendas**: Registra as vendas de produtos.
- **Calcular Total de Vendas**: Calcula o total das vendas diárias.

## Estrutura do Projeto

O projeto contém dois arquivos principais:

### Mercadinho.java

Este arquivo contém o método `main()`, onde são criados objetos da classe `Produto` e demonstradas suas funcionalidades.

```java
package mercadinho;

public class Mercadinho {

    public static void main(String[] args) {
        Produto maca = new Produto();
        maca.setNome("Maca");
        maca.setPreco(0.99);
        maca.setQuantidade(15);
        maca.mostrar();

        Produto leite = new Produto();
        leite.setNome("Leite");
        leite.setPreco(7.99);
        leite.setQuantidade(10);
        leite.mostrar();

        Produto agua = new Produto();
        agua.setNome("Agua");
        agua.setPreco(1.99);
        agua.setQuantidade(20);
        agua.mostrar();
    }
}
```

### Produto.java

Este arquivo define a classe `Produto` com seus atributos privados e métodos públicos para acessá-los (getters e setters). Além disso, possui um método `mostrar()` que exibe as informações do produto no console.

```java
package mercadinho;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void mostrar() {
        System.out.println("Produto: " + nome + ", Preço: " + preco + ", Quantidade: " + quantidade);
    }
}
```

## Como Executar

Para executar este projeto:

1. Clone o repositório ou baixe os arquivos `Mercadinho.java` e `Produto.java` para o seu ambiente de desenvolvimento Java.
2. Abra o projeto no NetBeans ou outro IDE de sua preferência.
3. Compile os arquivos.
4. Execute o arquivo `Mercadinho.java`.

Certifique-se de ter um ambiente de desenvolvimento Java configurado corretamente.

## Considerações Finais

Foi uma experiência gratificante ver o projeto funcionando no NetBeans, com cada classe e método desempenhando seu papel conforme planejado. Isso me motivou ainda mais a continuar aprendendo e explorando novos conceitos na programação.
