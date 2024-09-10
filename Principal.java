import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Principal {
    public static void main(String[] args) {

        Sistema sistema = new Sistema();
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("----- MENU PRINCIPAL -----");
            System.out.println("1- Adicionar Setor");
            System.out.println("2- Adicionar Produto");
            System.out.println("3- Listar Produtos por Setor");
            System.out.println("4- Remover Produtos");
            System.out.println("5- Listar todos os Produtos");
            System.out.println("6- Sair");

            System.out.println("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();
            switch (opcao){
                case 1:
                    System.out.println("Digite o nome do setor: ");
                    String nomeSetor = scanner.nextLine();
                    Setor novoSetor = new Setor(nomeSetor);
                    sistema.adicionarSetor(novoSetor);
                    System.out.println("Setor " + nomeSetor + " Setor adicionado com sucesso!");
                    break;
                case 2:
                    System.out.println("Digite o nome produto: ");
                    String nomeProduto = scanner.nextLine();
                    System.out.println("Digite a descrição do produto: ");
                    String descricaoProduto = scanner.nextLine();
                    System.out.println("Digite o valor do produto: ");
                    double valorProduto = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println("Digite a quantidade em estoque do produto: ");
                    int quantidadeProduto = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Digite o código do produto");
                    int codigoProduto = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Digite a categoria do produto: ");
                    String categoriaProduto = scanner.nextLine();

                    Produto novoProduto = new Produto(codigoProduto, categoriaProduto, nomeProduto, descricaoProduto, valorProduto, quantidadeProduto);

                    System.out.println("Digite o nome do setor onde o produto será adicionado: ");
                    String nomeSetorProduto = scanner.nextLine();
                    Setor setorProduto = null;
                    for (Setor setor: sistema.listaSetores()){
                        if (setor.getNome().equals(nomeSetorProduto)){
                            setorProduto = setor;
                            break;
                        }
                    } if (setorProduto != null){
                    sistema.adicionarProdutoEmSewtor(novoProduto, setorProduto);
                    System.out.println("Produto adicionado com sucesso");
                } else{
                    System.out.println("Setor não encontrado!");
                    break;
                }
                    break;
                case 3:
                    System.out.println("Digite o nome do setor para listar os produtos: ");
                    String nomeSetorListagem = scanner.nextLine();
                    Setor setorListagem = null;
                    for (Setor setor: sistema.listaSetores()){
                        if (setor.getNome().equals(nomeSetorListagem)){
                            setorListagem = setor;
                            break;
                        }
                        }if (setorListagem != null){
                            List<Produto> produtosDoSetor = sistema.listaProdutosPorSetor(setorListagem);
                            System.out.println("Produtos no setor " + nomeSetorListagem + ": ");
                            for (Produto produto: produtosDoSetor){
                                System.out.println(produto.getNome());
                            }
                        } else{
                            System.out.println("Setor não encontrado");
                        }
                     break;
                case 4:
                    System.out.println("Digite o código do produto a ser removido: ");
                    int codigoProdutoRemover = scanner.nextInt();
                    scanner.nextLine();

                    boolean produtoRemovido = false;
                    for (Setor setor : sistema.listaSetores()) {
                        List<Produto> produtosDoSetor = setor.getProdutos();
                        for (int i = 0; i < produtosDoSetor.size(); i++) {
                            Produto produto = produtosDoSetor.get(i);
                            if (produto.getCodigo() == codigoProdutoRemover) {
                                sistema.removerProdutoEmSewtor(produto, setor);
                                produtoRemovido = true;
                                System.out.println("Produto removido com sucesso!");
                                break;
                            }
                        }
                        if (produtoRemovido) {
                            break;
                        }
                    }

                    if (!produtoRemovido) {
                        System.out.println("Produto não encontrado!");
                    }
                    break;
                    case 5:
                        System.out.println("Todos os produtos: ");
                        for (Setor setor: sistema.listaSetores()){
                            for (Produto produto : sistema.listaProdutosPorSetor(setor)){
                                System.out.println(produto.getNome());
                            }
                        }
                        break;
                    case 6:
                    System.out.println("Obrigado por utilizar nosso sistema");
                    System.exit(0);
                default:
                    System.out.println("Opção Invalida!");
            }
        }
    }
}
