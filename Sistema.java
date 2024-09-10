import java.util.ArrayList;
import java.util.List;

public class Sistema {

    private List<Setor> setores;

    public Sistema(){
        this.setores = new ArrayList<>();
    }

    public void adicionarSetor(Setor setor){
        setores.add(setor);
    }

    public void adicionarProdutoEmSewtor(Produto produto, Setor setor){
        setor.adicionarProduto(produto);
    }

    public void removerProdutoEmSewtor(Produto produto, Setor setor){
        setor.removerProduto(produto);
    }

    public List<Produto> listaProdutosPorSetor(Setor setor){
        return setor.getProdutos();
    }
    public List<Setor> listaSetores(){
        return setores;
    }
}
