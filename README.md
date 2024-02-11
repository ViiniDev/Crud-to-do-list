Projeto inicial
Criação de uma lista de serviços 
com metodos POST, GET, PUT e DELETE

Instale as dependencias do maven;
Configure a conexão com o banco : 
utilizando base de dados Postgresql, segue comandos para configuração da conexão com o banco : 
spring.datasource.url=jdbc:postgresql://localhost:****/todolist
spring.datasource.username=*******
spring.datasource.password=*******
spring.datasource.driver-class-name=org.postgresql.Driver

spring.jpa.hibernate.ddl-auto=update

e faça os teste com a devida porta da sua configuração (geralmente é a 8080 do spring boot): localhost:8080/todolist





