### <p align="left">Projeto sauceDemoWeb</p>
O projeto <b>sauceDemoWeb</b> foi criado durante a capacitação de automatizadores de testes QA,
com a finalidade de aplicação prática das diversas técnicas abordadas durtante o curso.

#### <u>Tecnologias</u>
#### O projeto foi construído em Maven utilizando diversas tecnologias como:</p>
- Linguagem de programação Java
- Selenium
  - selenium-shutterbug
- JUnit5
  - junit-platform-runner
  - junit-platform-launcher
  - junit-platform-suite-api   
- WebDriverManager
- ExtentReport
- JavaFaker
#### <u>Designer da estrutura</u>
O padrão de projeto escolhido foi o PageObjects
pois é um dos mais utilizados para testes automatizados e
possui uma melhor estrutura de diretórios e organização
das funções de cada classe dentro do código de testes.
#### Foi estruturado da seguinte forma:
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
        
#### <u>Estudo de caso</u>
O projeto tem o objetivo de efetuar a compra de um produto no site,
através de interções totalmente automáticas e validar asserções
feitas durante a execução do sistema. 

