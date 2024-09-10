public class Item {
    private int codigo;
    private String categoria;

    public Item(int codigo, String categoria){

        this.codigo = codigo;
        this.categoria = categoria;

    }

    public int getCodigo(){ return codigo;}

    public String getCategoria(){ return categoria; }
}