# Estructuras Lineales – Ejercicios con Pilas y Colas

Este proyecto contiene una serie de ejercicios prácticos usando **estructuras lineales** en Java, específicamente **Stacks (pilas)** y **Queues (colas)**, implementados de forma genérica. A continuación se explican los dos primeros ejercicios desarrollados.

---

## Ejercicio 1: Validación de Signos

**Objetivo:**  
Verificar si una cadena de texto contiene signos de agrupación correctamente balanceados y anidados.

**Signos evaluados:**
- Paréntesis: `()`
- Corchetes: `[]`
- Llaves: `{}`

**Ejemplo:**

| Entrada           | Resultado |
|------------------|-----------|
| `{[()]}`         | Válido |
| `{[(])}`         | Inválido |

**Lógica utilizada:**
- Se recorre cada carácter de la cadena.
- Si es un signo de apertura (`{`, `[`, `(`), se apila.
- Si es un signo de cierre (`}`, `]`, `)`), se compara con el tope de la pila.
  - Si no corresponde al signo de apertura esperado, es inválido.
- Al final, la pila debe estar vacía si todo está correctamente balanceado.

**Clase principal:**  
`SignValidator.java`

---

## Ejercicio 2: Ordenar una Pila

**Objetivo:**  
Ordenar una pila de enteros de modo que los elementos más pequeños queden en el tope.

**Restricciones:**
- No se pueden usar estructuras distintas a pilas.
- Se permite el uso de pilas auxiliares.

**Ejemplo:**

```text
Input (tope):     5 -> 1 -> 4 -> 2 
````


## Versión
2.0.2 – “Estructuras Lineales – Ejercicios”

## Autor
Daniel Uyaguari- Segundo Ciclo