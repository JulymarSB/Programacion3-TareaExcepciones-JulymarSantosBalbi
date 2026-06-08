## Autor

**Julymar Santos Balbi 
Matricula 10005890**

**Asignatura:** Programación III

# Tarea: Manejo de Excepciones en Java

## Descripcin

Aplicación de consola desarrollada en Java para el registro de usuarios. El sistema solicita información del usuario y valida los datos ingresados mediante el uso de excepciones personalizadas y manejo de excepciones.

## Datos Solicitados

- Nombre
- Edad
- Correo electrónico
- Salario mensual

## Validaciones Implementadas

### Nombre
- No puede estar vacío.
- Debe tener al menos 3 caracteres.

### Edad
- Debe ser mayor o igual a 18 años.
- Debe ser menor o igual a 100 años.

### Correo Electrónico
- Debe contener el carácter `@`.
- Debe contener el carácter `.`.

### Salario
- Debe ser mayor que 0.

## Excepciones Personalizadas

El proyecto incluye las siguientes excepciones:

- `NombreInvalidoExcepcion`
- `EdadInvalidaExcepcion`
- `CorreoInvalidoExcepcion`
- `SalarioInvalidoExcepcion`

## Conceptos Aplicados

- `try`
- `catch`
- Múltiples `catch`
- `finally`
- `throw`
- `throws`
- `getMessage()`
- Excepciones personalizadas
- `InputMismatchException`

## Requisitos

- Java JDK 8 o superior.
- Visual Studio Code o cualquier IDE compatible con Java.