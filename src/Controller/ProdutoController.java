package Controller;

import Model.ProdutoService;

import java.util.List;

public class ProdutoController {

    private final ProdutoService produtoService;

    public ProdutoController(ProdutoService produtoService) {
        this.produtoService = produtoService;
    }

    public void cadastrar(){
        produtoService.cadastrarProduto("Placa de Vídeo RTX4070", "12GB GDDR6X", 12000.00);
        produtoService.cadastrarProduto("Teste de Gravidez","Roda Doom",20.00);
        produtoService.cadastrarProduto("GTA V", "Super Confiavel 🗿",1000000000.00);
        produtoService.cadastrarProduto("PS5","Para jogar Sonic Genereitions ",120.00);
        produtoService.cadastrarProduto("Luz LGBT", "Para fazer seu Computador aceitar todos os jogos", 250.00);
    }

    public List<?> mostrar(){
        return produtoService.listarProduto();
    }

    public void deletar(int id){
        produtoService.deletarProduto(id);
    }

    public void atualizar(int id, Double preco){
        produtoService.atualizarProduto(id,preco);
    }
}
