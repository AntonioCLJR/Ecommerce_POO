# Sistema de Gestão de Produtos

Este projeto é um sistema de gerenciamento de produtos organizados por setores. Através de um menu interativo, o usuário pode adicionar novos setores, adicionar produtos a setores existentes, listar produtos por setor, remover produtos e visualizar todos os produtos cadastrados.

## Funcionalidades

O sistema oferece as seguintes opções no menu principal:

1. **Adicionar Setor**: Permite que o usuário crie um novo setor para organizar os produtos.
2. **Adicionar Produto**: Permite adicionar um novo produto a um setor específico, informando seu nome, descrição, valor, quantidade em estoque, código e categoria.
3. **Listar Produtos por Setor**: Exibe todos os produtos cadastrados dentro de um setor selecionado pelo usuário.
4. **Remover Produtos**: Remove um produto de um setor com base no código informado.
5. **Listar todos os Produtos**: Exibe todos os produtos cadastrados em todos os setores.
6. **Sair**: Encerra o sistema.

## Estrutura do Projeto

O projeto segue a seguinte estrutura de classes:

- **Principal**: Classe que contém o método `main` e o menu interativo do sistema.
- **Sistema**: Classe responsável por gerenciar setores e produtos, fornecendo métodos para adicionar, listar e remover produtos.
- **Setor**: Representa um setor onde os produtos são organizados.
- **Produto**: Representa um produto com nome, descrição, valor, quantidade, código e categoria.

## Como Executar

1. Clone este repositório para o seu ambiente local.
2. Compile as classes Java.
3. Execute a classe `Principal` para iniciar o sistema de menu interativo.
4. Siga as instruções exibidas no console para interagir com o sistema.
