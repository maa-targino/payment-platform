# Payment Platform

## Overview

Projeto de Plataforma de Pagamentos com finalidade de evoluir conhecimentos em Java 25, Spring Boot, Arquitetura Hexagonal e Gestão de Projetos Ágeis. 

## Architecture

O Projeto seguirá a Arquitetura Hexagonal.

- Packages serão introduzidos conforme responsabilidades reais surgirem;
- Não criaremos packages vazios ou classes placeholder;
- O domínio não dependerá de Spring, HTTP, JPA ou infraestrutura;
- Dependências devem apontar para o core da aplicação.

## Technologies

- Java 25
- Spring Boot 4.1.1
- Maven

## Requirements

- Java 25

## Build

O projeto utilizará o Maven para gerenciar as dependências e construir o projeto.

```bash
.\mvnw.cmd clean verify
```

## Run

```bash
.\mvnw.cmd spring-boot:run
```

## Development Workflow

Issue → Branch → Implementation → Tests → Pull Request → Code Review → Merge

## Branch convention

```text
feature/<issue-id>-<short-description>
```

Example:

```text
feature/DEV-5-bootstrap-application
```