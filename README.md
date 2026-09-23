# API de Gestión de Clientes - UTN

Este proyecto es una API REST desarrollada para la gestión de clientes, permitiendo realizar operaciones CRUD básicas. Ha sido diseñada como parte de las clases de la UTN utilizando tecnologías modernas de Java y Spring Boot.

## 🚀 Tecnologías Utilizadas

*   **Java 21**: Versión de soporte a largo plazo.
*   **Spring Boot 4.0.6**: Framework principal para el desarrollo de la API.
*   **Spring Data JPA**: Para la persistencia de datos.
*   **MySQL**: Base de datos relacional para el almacenamiento persistente.
*   **Lombok**: Para la generación automática de código (getters, setters, etc.).
*   **Maven**: Gestor de dependencias y construcción.
*   **H2 Database**: Utilizada para pruebas en entorno de desarrollo/test.

## 📋 Requisitos Previos

Antes de ejecutar el proyecto, asegúrate de tener instalado:

*   [JDK 21](https://www.oracle.com/java/technologies/downloads/#java21)
*   [Maven](https://maven.apache.org/download.cgi)
*   [MySQL Server](https://dev.mysql.com/downloads/installer/)

## ⚙️ Configuración

1.  Crea una base de datos en MySQL llamada `utn`.
2.  Configura tus credenciales como variables de entorno:
    ```bash
    export DB_USERNAME=root          # opcional, por defecto: root
    export DB_PASSWORD=tu_password
    ```

## 🏃 Ejecución

Para ejecutar la aplicación localmente, navega a la carpeta `api` y ejecuta:

```bash
mvn spring-boot:run
```

La API estará disponible por defecto en `http://localhost:8080`.

## 🛠️ Endpoints de la API

La base de la URL para los clientes es `/clientes`.

| Método | Endpoint | Descripción |
| :--- | :--- | :--- |
| `GET` | `/clientes` | Lista todos los clientes registrados. |
| `GET` | `/clientes/{id}` | Obtiene los detalles de un cliente por su ID. |
| `POST` | `/clientes/agregar` | Registra un nuevo cliente. |
| `DELETE` | `/clientes/eliminar/{id}` | Elimina un cliente por su ID. |

### Ejemplo de JSON para creación (POST):
```json
{
  "nombre": "Juan",
  "apellidoORazonSocial": "Pérez",
  "documentoOCuit": "20-12345678-9",
  "direccion": "Calle Falsa 123",
  "telefono": "1144556677",
  "email": "juan.perez@example.com",
  "tipoCliente": "PERSONA_FISICA",
  "activo": true,
  "saldoPendiente": 0.0,
  "fechaAlta": "2026-05-13"
}
```

## 🏗️ Estructura del Proyecto

*   **Entity (`Client`)**: Define los atributos del cliente y la lógica de negocio básica (ej. `esClienteReciente`).
*   **Repository (`ClientRepository`)**: Maneja el acceso a datos mediante Spring Data JPA.
*   **Service (`ClientService`)**: Contiene la lógica de negocio y mediación entre el controlador y el repositorio.
*   **Controller (`ClientController`)**: Expone los endpoints REST.

---
Proyecto desarrollado para **Clases UTN**.
