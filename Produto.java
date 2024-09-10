public class Produto extends Item{

    private String nome;
    private String descricao;

    private double valor;

    private int quantidadeEmEstoque;

    public Produto(int codigo, String categoria, String nome, String descricao, double valor, int quantidadeEmEstoque){
        super(codigo, categoria);
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public String getNome(){return nome;}

    public String getDescricao(){return descricao;}

    public double getValor(){return valor;}

    public int getQuantidadeEmEstoque(){return quantidadeEmEstoque;}
}

