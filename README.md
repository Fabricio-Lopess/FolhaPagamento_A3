# 💰 Sistema de Folha de Pagamento

## 📌 Sobre o Projeto

Este projeto consiste no desenvolvimento de um **Sistema de Folha de Pagamento**, desenvolvido como trabalho acadêmico do curso de **Ciências da Computação**.

O sistema foi implementado utilizando a linguagem Java e tem como objetivo realizar o cadastro de diferentes categorias de colaboradores, calcular seus respectivos salários e gerar informações referentes à folha de pagamento.

A aplicação utiliza conceitos fundamentais da programação orientada a objetos, como **herança, encapsulamento, sobrescrita de métodos e polimorfismo**.

## 🎯 Objetivos

- Desenvolver um sistema para gerenciamento de colaboradores.
- Implementar diferentes modalidades de remuneração.
- Automatizar o cálculo dos salários finais.
- Gerar a folha de pagamento dos colaboradores cadastrados.
- Apresentar um resumo dos valores totais da folha de pagamento.
- Aplicar conceitos de programação orientada a objetos na construção de uma aplicação Java.

## ⚙️ Funcionalidades

O sistema disponibiliza um menu interativo pelo terminal, permitindo ao usuário realizar as seguintes operações:

| Opção | Funcionalidade |
|---|---|
| 1 | Cadastrar colaborador padrão |
| 2 | Cadastrar colaborador comissionado |
| 3 | Cadastrar colaborador por produção |
| 4 | Gerar folha de pagamento |
| 5 | Exibir resumo da folha de pagamento |
| 6 | Listar colaboradores cadastrados |
| 0 | Encerrar o programa |

### 👥 Categorias de Colaboradores

O sistema trabalha com três categorias de colaboradores:

**1. Colaborador Padrão**
- Possui matrícula, nome e salário base.
- O salário final corresponde ao próprio salário base.

**2. Colaborador Comissionado**
- Possui matrícula, nome, salário base, valor das vendas e percentual de comissão.
- O salário final é calculado pela soma do salário base com a comissão sobre as vendas.

Fórmula:

`Salário Final = Salário Base + (Valor das Vendas × Percentual de Comissão / 100)`

**3. Colaborador por Produção**
- Possui matrícula, nome, salário base, quantidade de peças produzidas e valor pago por peça.
- O salário final é calculado pela soma do salário base com o valor correspondente à produção.

Fórmula:

`Salário Final = Salário Base + (Quantidade de Peças × Valor por Peça)`

## 🛠️ Tecnologias Utilizadas

- **Java:** linguagem de programação utilizada no desenvolvimento.
- **Maven:** ferramenta de gerenciamento e construção do projeto.
- **IntelliJ IDEA:** ambiente de desenvolvimento compatível com o projeto.

## 🧠 Conceitos de Programação Aplicados

Durante o desenvolvimento foram utilizados os seguintes conceitos:

- **Programação Orientada a Objetos (POO):** organização do código em classes e objetos.
- **Herança:** as classes específicas de colaboradores herdam características da classe principal `colaborador`.
- **Polimorfismo:** utilização do método `calcularSalarioFinal()` com comportamentos diferentes conforme a categoria do colaborador.
- **Encapsulamento:** utilização de atributos privados e métodos de acesso nas classes especializadas.
- **Sobrescrita de métodos (Override):** implementação de comportamentos específicos para o cálculo salarial de cada categoria.
- **Estruturas de repetição e decisão:** utilizadas para controlar o menu, validar entradas e percorrer os colaboradores cadastrados.
- **Collections:** utilização de `ArrayList` para armazenar os colaboradores durante a execução.

## 📂 Estrutura do Projeto

```text
FolhaPagamento_A3/
│
├── pom.xml
│
└── src/
    ├── main/
    │   └── java/
    │       └── org/
    │           └── example/
    │               ├── Main.java
    │               ├── colaborador.java
    │               ├── ColaboradorPadrao.java
    │               ├── ColaboradorComissionado.java
    │               └── ColaboradorProducao.java
    │
    └── test/
        └── java/
```

### 📄 Descrição dos Arquivos

- **Main.java:** contém o menu principal, as operações de cadastro, geração da folha de pagamento, resumo e listagem de colaboradores.
- **colaborador.java:** classe base que define os atributos e comportamentos comuns aos colaboradores.
- **ColaboradorPadrao.java:** representa o colaborador que recebe apenas o salário base.
- **ColaboradorComissionado.java:** implementa o cálculo de remuneração com base em vendas e comissão.
- **ColaboradorProducao.java:** implementa o cálculo de remuneração com base na quantidade de peças produzidas.

## ▶️ Como Executar o Projeto

### Pré-requisitos

Antes de executar o projeto, é necessário possuir:

- Java Development Kit (JDK) 26.
- Apache Maven.
- Uma IDE compatível com projetos Java, como IntelliJ IDEA, Eclipse ou VS Code.

### Executando pela IDE

1. Faça o download ou clone deste repositório.
2. Abra o projeto em sua IDE.
3. Aguarde o carregamento das configurações do Maven.
4. Localize o arquivo `Main.java`.
5. Execute o método `main()`.
6. Utilize o menu apresentado no terminal para interagir com o sistema.

### Executando pelo terminal

Na pasta raiz do projeto, execute:

```bash
mvn clean package
```

Após a construção do projeto, execute:

```bash
java -cp target/classes org.example.Main
```

## 📌 Observações

- Os colaboradores são armazenados em memória por meio de uma lista (`ArrayList`).
- Os dados cadastrados não são persistidos em banco de dados ou arquivos.
- As informações são mantidas somente durante a execução do programa.
- A interação com o sistema acontece por meio do terminal.

## 🎓 Contexto Acadêmico

Projeto desenvolvido como atividade acadêmica do curso de **Ciências da Computação**, com o propósito de aplicar conhecimentos de programação Java e orientação a objetos na construção de um sistema de gerenciamento de folha de pagamento.

---

**Projeto acadêmico — Sistema de Folha de Pagamento**

Desenvolvido em Java.
