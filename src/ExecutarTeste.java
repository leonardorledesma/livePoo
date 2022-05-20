import java.math.BigDecimal;

public class ExecutarTeste {

    public static void main(String[] args){

        Produto produto1 = new Produto();
        produto1.setNome("Módulo orientação a objeto");
        produto1.setId(1L);
        produto1.setValor(BigDecimal.valueOf(100));

        Produto produto2 = new Produto();
        produto2.setNome("Módulo Spring Boot");
        produto2.setId(2L);
        produto2.setValor(BigDecimal.valueOf(300));

        Produto produto3 = new Produto();
        produto3.setNome("Módulo Angular");
        produto3.setId(3L);
        produto3.setValor(BigDecimal.valueOf(200));


        Venda venda = new Venda();
        venda.setDescricaoVenda("Curso de formação java");
        venda.setId(10L);
        venda.setEnderecoEntrega("Entrega por email");
        venda.setNomeCliente("Leonardo Ledesma");
        venda.setValorTotal(BigDecimal.valueOf(197.00));

        venda.getListaProdutos().add(produto1);
        venda.getListaProdutos().add(produto2); // não consigo fazer validações
        venda.addProduto(produto3); // consigo fazer valiações antes de adicionar na lista

        for (Produto produto: venda.getListaProdutos()) {
            System.out.println("Descrição produto: " + produto);
            
        }

        System.out.println("Descrição de venda: " + venda.getDescricaoVenda()
                + " e o total da venda " + venda.getValorTotal());
    }
}
