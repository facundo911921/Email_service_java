# Microsserviço de Envio de E-mails

Este é um microsserviço desenvolvido em Java com **Spring Boot**, que tem como objetivo realizar o envio de e-mails utilizando o **JavaMailSender** e persistir as informações dos e-mails enviados em um banco de dados PostgreSQL.

## Tecnologias Utilizadas
- **Java 17**
- **Spring Boot**
  - Spring Web
  - Spring Data JPA
  - Spring Boot Starter Mail
- **PostgreSQL**
- **Maven**

## Funcionalidades

### 1. Envio de e-mails
- Recebe um JSON com informações como destinatário, assunto e corpo do e-mail.
- Envia o e-mail usando o JavaMailSender.

### 2. Persistência de dados
- Salva informações como destinatário, assunto, corpo do e-mail, data de envio e status no banco de dados PostgreSQL.

### 3. Gestão de status
- Informa se o e-mail foi enviado com sucesso ou se ocorreu uma falha.
