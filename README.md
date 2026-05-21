# CRUD To-Do List

API REST desenvolvida em Java com Spring Boot para gerenciamento de tarefas. O projeto aplica operações CRUD, persistência com PostgreSQL e organização em camadas.

## Funcionalidades

- Cadastro de tarefas.
- Listagem de tarefas ordenadas por prioridade e nome.
- Atualização de tarefas existentes.
- Remoção de tarefas por ID.
- Persistência em banco PostgreSQL.

## Tecnologias

- Java 17
- Spring Boot 3.2.2
- Spring Web
- Spring Data JPA
- PostgreSQL
- Lombok
- Maven

## Estrutura do Projeto

```text
src/main/java/com/desafio/todolist/todolist
├── controller
│   └── TodoController.java
├── entity
│   └── Todo.java
├── repository
│   └── TodoRepository.java
├── service
│   └── TodoService.java
└── TodolistApplication.java
```

## Configuração do Banco

Crie um banco PostgreSQL chamado `todolist`:

```sql
CREATE DATABASE todolist;
```

As configurações podem ser informadas por variáveis de ambiente:

```bash
DB_URL=jdbc:postgresql://localhost:5432/todolist
DB_USER=postgres
DB_PASSWORD=sua_senha
```

Caso não sejam informadas, o projeto usa os valores padrão definidos em `application.properties`.

## Como Executar

```bash
./mvnw spring-boot:run
```

No Windows:

```bash
mvnw.cmd spring-boot:run
```

A aplicação ficará disponível em:

```text
http://localhost:8080
```

## Endpoints

### Criar tarefa

```http
POST /todos
```

```json
{
  "nome": "Estudar Spring Boot",
  "descricao": "Revisar controllers, services e repositories",
  "realizado": false,
  "prioridade": 5
}
```

### Listar tarefas

```http
GET /todos
```

### Atualizar tarefa

```http
PUT /todos
```

```json
{
  "id": 1,
  "nome": "Estudar Spring Boot",
  "descricao": "Finalizar revisão da API",
  "realizado": true,
  "prioridade": 4
}
```

### Remover tarefa

```http
DELETE /todos/{id}
```

## Melhorias Futuras

- Adicionar validações com Bean Validation.
- Retornar códigos HTTP mais específicos.
- Criar DTOs para entrada e saída.
- Implementar testes unitários e de integração.
