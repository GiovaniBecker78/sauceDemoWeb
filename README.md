## Projeto sauceDemoWeb

#### Índice
- [Sobre](#-sobre)
- [Tecnologias](#-tecnologias-utilizadas)
- [Design Pattern](#-design-pattern)
- [Estrutura de diretórios](#-estrutura-de-diretórios)
---
#### Sobre
O projeto sauceDemoWeb foi criado durante a capacitação de automatizadores de testes QA.
Tem o objetivo de efetuar a compra de um produto no site,
através de interações totalmente automatizadas, validar asserções
e extrair relatório, utilizando na prática as diversas
técnicas abordadas durtante o curso.
---
#### Tecnologias utilizadas
O projeto foi construído em Maven utilizando diversas tecnologias como:</p>
- [Intellij IDEA](https://www.jetbrains.com/idea/download/)
- [Java](https://www.java.com/pt-BR/)
- [Selenium](http://www.seleniumframework.com/)
  - [selenium-shutterbug](https://mvnrepository.com/search?q=selenium-shutterbug)
- [JUnit5](https://junit.org/junit5/)
  - [junit-platform-runner](https://mvnrepository.com/search?q=junit-platform-runner)
  - [junit-platform-launcher](https://mvnrepository.com/search?q=junit-platform-launcher)
  - [junit-platform-suite-api](https://mvnrepository.com/search?q=junit-platform-suite-api)   
- [WebDriverManager](https://mvnrepository.com/search?q=webdrivermanager)
- [ExtentReport](https://mvnrepository.com/search?q=extentreports)
- [JavaFaker](https://mvnrepository.com/artifact/com.github.javafaker)
---
#### Design Pattern
O padrão de projeto escolhido foi o PageObjects
pois é um dos mais utilizados para testes automatizados e
possui uma melhor estrutura de diretórios e organização
das funções de cada classe dentro do código de testes.
---
#### Estrutura de diretórios
- sauceDemoWeb
  - .idea
  - src
    - main
      - java
        - Framework
        - Utils
      - resourses
    - test
      - java
        - PageObjects
        - Tasks
        - TestCases
        - TestSuites
---
#### Como baixar o prejeto
````bash
# aqui você vai clonar o repositório
$ git clone https://github.com/GiovaniBecker78/sauceDemoWeb

# entrar no diretório
$ cd sauceDemoWeb

# instalar as dependências
$ yarn install

# iniciar o projeto
$ yarn start
```

