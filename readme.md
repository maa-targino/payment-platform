# Payment Platform

## Overview

Projeto de Plataforma de Pagamentos com finalidade de evoluir conhecimentos em Java 25, Springboot Framework, Arquitetura Hexagonal e Gestão de Projetos Ágeis. 

## Architecture

O Projeto seguirá a Arquitetura Hexagonal.

## Development Workflow

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

```bash
.\mvnw.cmd clean verify

## Run

```powershell
.\mvnw.cmd spring-boot:run