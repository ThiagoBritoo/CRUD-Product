# CRUD-Product

![Java](https://img.shields.io/badge/Java-red)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-green)
![MySQL](https://img.shields.io/badge/MySQL-blue)

Este é um projeto de CRUD (Create, Read, Update, Delete) de produtos, desenvolvido em Java com Spring Boot.

## Descrição

O projeto fornece operações básicas de gerenciamento de produtos, incluindo a criação, leitura, atualização e exclusão. Ele utiliza o framework Spring Boot para facilitar o desenvolvimento e manutenção do aplicativo.

## Estrutura do Projeto

- `ProductController`: Controlador que gerencia as operações CRUD para produtos.
- `ProductService`: Serviço responsável pela lógica de negócios relacionada a produtos.
- `Product`: Entidade representando um produto.
- `ProductDTO`: Objeto de transferência de dados para criar ou atualizar produtos.

## Endpoints

- **GET /product:** Obtém todos os produtos.
- **GET /product/{id}:** Obtém um produto específico por ID.
- **POST /product:** Cria um novo produto.
- **PUT /product/{id}:** Atualiza um produto existente.
- **DELETE /product/{id}:** Exclui um produto.

## Banco de Dados

O projeto utiliza MySQL como banco de dados para armazenar informações. As configurações e migrações do banco de dados são gerenciadas automaticamente pelo Spring Boot, utilizando as anotações de persistência.

## Pré-requisitos

Certifique-se de ter o Java e o Spring Boot configurados em seu ambiente de desenvolvimento.

Certifique-se de ter um servidor MySQL configurado e acessível antes de executar o aplicativo.

## Configuração

1. Clone este repositório.
2. Execute o aplicativo usando sua IDE favorita ou utilizando o comando `./mvnw spring-boot:run`.

## Contribuição

Contribuições são bem-vindas! Sinta-se à vontade para abrir problemas (issues) ou enviar pull requests.
