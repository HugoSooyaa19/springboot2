# Microservicio de Palíndromo

Este microservicio está diseñado para recibir una cadena JSON que contiene un parámetro llamado `palíndromo` y devolver una respuesta que incluye la longitud de la cadena, si es un palíndromo y la longitud de los caracteres especiales presentes.

## Funcionalidad

El servicio realiza las siguientes operaciones:

- **Recibe un JSON** que contiene la cadena a evaluar.
- **Devuelve un JSON** con los siguientes parámetros:
  - `lengthCadena`: La longitud de la cadena proporcionada.
  - `isPalindromo`: Un valor booleano que indica si la cadena es un palíndromo.
  - `lengthCaracteresEspeciales`: La cantidad de caracteres especiales en la cadena.

## Endpoint

- **POST** `/palindrome`
  
### Cuerpo de la Solicitud

Debes enviar un JSON con el siguiente formato:

```json
{
  "palindromo": "palabra"
}
