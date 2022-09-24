# Reto - Spring Boot

Crear un servicio Rest, este debe tener los métodos:

*	GET
*	POST
*	PUT
*	DELETE

La colección de datos deberá crear usuario, usando el modelo Users, con sus respectivas validaciones.

```json
Users
{
	id: "string",
	name: "string",
	surName: "string",
	documentType: "string",
	document: "string",
	email: "string",
	address: "string",
	city: "string",
	level: "string",
	state: "number" 1 activo o 0 inactivo
}
```
Conectar el servicio a MongoDB Atlas, y hacer Deploy en Heroku e implementación e Swagger.

### Tecnologias :wrench:

*	VSC

![](https://code.visualstudio.com/assets/apple-touch-icon.png)


*	MongoDB

![](https://terracloudx.com/wp-content/uploads/2020/07/icono-mongo.png)

*	Heroku

![](https://dashboard.snapcraft.io/site_media/appmedia/2017/09/heroku.png)

*	Swagger.io

![](https://upload.wikimedia.org/wikipedia/commons/a/ab/Swagger-logo.png)

### Autor
[@Nirsch95](https://github.com/Nirsch95) - Andrés Castro :wolf:

Resolución del reto planteado aplicando los metodos planteados y el momedo estipulado, implementado en Heroku y las validaciones en Swagger.

Implemenado en Heroku

![image](https://user-images.githubusercontent.com/37886668/192075694-6403c325-9b20-47d2-8646-c749066fbf6f.png)

Validación en Swagger

![image](https://user-images.githubusercontent.com/37886668/192075840-9fcc9df0-f4e7-4adf-bd3c-536dc2fe7da8.png)

## GET LIST USERS

### Parameters

![image](https://user-images.githubusercontent.com/37886668/192075854-669cc11d-03ed-4dfe-95e7-719fb157f8a2.png)

### Responses

![image](https://user-images.githubusercontent.com/37886668/192075865-4323a266-9fbb-4727-ab58-630ef7dbe794.png)

## POST CREATE USER

### Parameters

![image](https://user-images.githubusercontent.com/37886668/192075903-7fe734ae-3a8f-4201-a1bb-c82ba16eaafd.png)

### Responses

![image](https://user-images.githubusercontent.com/37886668/192075952-b55fbba2-8836-4cf6-bbd7-6cd7f1d9f0ec.png)

## PUT UPDATE USER

### Parameters

![image](https://user-images.githubusercontent.com/37886668/192075972-0be67d04-6fa9-4f79-b97a-bf55e5f5b072.png)

### Responses

![image](https://user-images.githubusercontent.com/37886668/192076002-96fe48d4-f58a-4354-8aa8-60c9540e74ec.png)

## GET USER

### Parameters

![image](https://user-images.githubusercontent.com/37886668/192076031-aaa1c170-3357-4823-9d82-c2b8dc6f4391.png)

### Responses

![image](https://user-images.githubusercontent.com/37886668/192076055-baa135fa-c68a-48b1-a423-37be149acf96.png)

## DELETE USER

### Parameters

![image](https://user-images.githubusercontent.com/37886668/192076083-d3068115-51cb-4575-aee5-46833acf224e.png)

### Responses

![image](https://user-images.githubusercontent.com/37886668/192076118-458a48ef-61cf-43ef-8810-b38b0274e755.png)
