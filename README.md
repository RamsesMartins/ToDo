# Projeto ToDo List com Bootstrap, Spring Boot e MariaDB
![Bootstrap](https://img.shields.io/badge/Bootstrap-4.1.0-7952B3?logo=bootstrap&style=flat)  ![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.1.3-6DB33F?logo=spring-boot&style=flat)  ![MariaDB](https://img.shields.io/badge/MariaDB-11.1.2-003545?logo=mariadb&style=flat)



Este é um projeto de exemplo para uma aplicação de gerenciamento de tarefas (ToDo) desenvolvido usando o framework Spring Boot no back-end, Bootstrap no front-end e o banco de dados MariaDB para armazenar dados.

## Pré-requisitos

Antes de executar a aplicação, certifique-se de ter as seguintes ferramentas e tecnologias instaladas em seu ambiente de desenvolvimento:

- [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/javase-downloads.html)
- [Maven](https://maven.apache.org/download.cgi)
- [MariaDB](https://mariadb.org/download/)

## Configuração do Banco de Dados

1. Crie um banco de dados MariaDB chamado `tododb`:

   ```sql
   CREATE DATABASE todo;
2. Configure as informações de conexão com o banco de dados no arquivo application.properties do projeto Spring Boot.
Peço desculpas pela confusão anterior. Parece que o código Markdown não estava formatando corretamente. Aqui está o tópico "Executando a Aplicação" em Markdown corrigido:

## Executando a Aplicação

1. Clone o repositório:

```bash
git clone https://github.com/RamsesMartins/ToDo.git
```

2. Navegue até o diretório do projeto:

```bash
cd nome-do-repositorio
```

3. Compile e inicie o aplicativo Spring Boot:

```bash
mvn spring-boot:run
```

4. A aplicação estará disponível em [http://localhost:8080/tasks](http://localhost:8080/tasks).
