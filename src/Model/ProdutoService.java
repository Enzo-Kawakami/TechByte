package Model;

import java.util.ArrayList;
import java.util.List;

public class ProdutoService {

    private static int id = 1;

    List<Produto> banco = new ArrayList<>();

    public void cadastrarProduto (String nome, String descricao, Double preco){
        Produto produto = new Produto(id++, nome, descricao, preco);
        banco.add(produto);
    }

    public List<Produto> listarProduto(){
        return banco;
    }

    public void deletarProduto(int id){
        for(Produto p : banco){
            if(p.getId() == id){
                banco.remove(p);
                IO.println("Produto Excluido com Sucesso");
                break;
            }
        }
    }

    public void atualizarProduto(long id, Double preco){
        for(Produto p : banco){
            if(p.getId() == id){
                p.setPreco(preco);
                IO.println("Preço Atualizado com Sucesso!");
            }
        }
    }
}
