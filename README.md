# taller-motos-api

API REST para gestionar un taller de motos: clientes y motos.

## Tecnologías
- Java y Spring Boot
- Spring Data JPA con MySQL
- Spring Security (Basic Auth)
- Docker para la base de datos
- Bruno para probar la API

## Endpoints de motos
| Método | Ruta | Qué hace | Respuesta |
| --- | --- | --- | --- |
| GET | /motos | Lista todas las motos | 200 |
| GET | /motos?marca={marca} | Filtra motos por marca | 200 (lista vacía si no hay) |
| GET | /motos/{matricula} | Busca una moto | 200 o 404 |
| POST | /motos | Crea una moto | 201 o 409 si la matrícula ya existe |
| PUT | /motos/{matricula} | Actualiza una moto | 200 o 404 |
| DELETE | /motos/{matricula} | Borra una moto | 204 o 404 |

## Endpoints de clientes

| Método | Ruta | Qué hace | Respuesta |
| --- | --- | --- | --- |
| GET | /clientes | Lista todos los clientes | 200 |
| GET | /clientes/{id} | Busca un cliente | 200 o 404 |
| POST | /clientes | Crea un cliente (el id lo genera MySQL) | 201 |

## Cómo arrancarla
1. Levantar MySQL con Docker:
   docker run --name taller-mysql -e MYSQL_ROOT_PASSWORD=tu_password -e MYSQL_DATABASE=taller_motos -p 3307:3306 -d mysql:8
2. Definir la variable de entorno DB_PASSWORD con esa contraseña.
3. Arrancar la aplicación desde IntelliJ.
4. Las peticiones necesitan Basic Auth con el usuario user y la contraseña que aparece en la consola al arrancar.

## Organización
Controller, service, repository y model, separados por capas.