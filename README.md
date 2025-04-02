# BancolombiaScaffold_Student
# 👤 User Service

Este microservicio fue desarrollado usando el plugin **Scaffold Clean Architecture** de Bancolombia, siguiendo principios de Clean Architecture y DDD (Domain-Driven Design). Su objetivo es gestionar usuarios dentro de una plataforma.

---

## 📦 Stack tecnológico

- Java 17
- Spring Boot 3
- Arquitectura Limpia (Scaffold Bancolombia)
- JPA (Hibernate)
- Base de datos relacional (ej: PostgreSQL o MySQL)
- Lombok
- Gradle
- Swagger/OpenAPI

---

## 🧱 Estructura del Proyecto

```bash
├── model/              # Entidades del dominio (User)
├── usecase/            # Casos de uso (UserUseCase)
├── entry-points/       # Adaptadores de entrada (controladores REST)
├── driven-adapters/    # Adaptadores de salida (persistencia con JPA)

