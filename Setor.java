
import java.util.ArrayList;
import java.util.List;

public class Setor {

    private String nome;

    private List<Produto> produtos;

    public Setor(String nome){
        this.nome = nome;
        this.produtos = new ArrayList<>();
    }

    public String getNome() {return nome; }

    public List<Produto> getProdutos() {return produtos;}

    public void adicionarProduto(Produto produto){produtos.add(produto);}

    public void removerProduto(Produto produto){produtos.remove(produto);}

}
