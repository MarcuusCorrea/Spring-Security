# Spring Security Example Application

## Descrição
Este projeto é um exemplo básico de uma aplicação utilizando Spring Security para autenticação e autorização de usuários.

## Requisitos
- Java Development Kit (JDK) - versão 1.8 ou superior
- Apache Maven
- Banco de dados H2 (embedded, para facilitar o exemplo)

## Configuração do Projeto

### 1. Clonar o Repositório

    git clone https://github.com/seu-usuario/spring-security-example.git
    cd spring-security-example
    2. Compilar e Empacotar o Projeto

mvn clean package
3. Executar a Aplicação

    java -jar target/spring-security-example-0.0.1-SNAPSHOT.jar
    A aplicação estará disponível em http://localhost:8080.

##Funcionalidades

Endpoints Protegidos
/users: Endpoint acessível apenas para usuários com a role "USERS" ou "MANAGERS".
/managers: Endpoint acessível apenas para usuários com a role "MANAGERS".

##Autenticação

 - A aplicação utiliza autenticação HTTP Basic para acesso aos endpoints protegidos.

 - Inicialização de Dados

Ao iniciar a aplicação (StartApplication), são criados dois usuários de exemplo no banco de dados H2:
Usuário "admin" com role "MANAGERS"
Usuário "user" com role "USERS"
Testes
O projeto inclui testes de unidade e integração para as configurações de segurança e endpoints protegidos.
Documentação Adicional
Para mais informações sobre o Spring Security, consulte a documentação oficial do Spring Security.

Autor
Marcos Corrêa - 
