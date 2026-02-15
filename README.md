# URL-ARSW-LAB03

## Descripcion

Este proyecto es un ejercicio practico que demuestra el uso de la clase URL en Java para analizar y extraer los diferentes componentes de una direccion web.

## Funcionalidad del Codigo

El programa EjercicioURL1.java realiza las siguientes operaciones:

1. Crea un objeto URL utilizando la sintaxis moderna de Java mediante URI.create().toURL()
2. Extrae e imprime los siguientes componentes de la URL:
   - Protocolo: El esquema de comunicacion (https)
   - Autoridad: La combinacion de host y puerto
   - Host: El nombre del servidor (docs.oracle.com)
   - Puerto: El numero de puerto (-1 si no esta especificado)
   - Path: La ruta del recurso en el servidor
   - Query: Los parametros de consulta (null si no existen)
   - File: La combinacion de path y query
   - Referencia: El fragmento o ancla de la URL (null si no existe)

## Ejecucion

Para ejecutar el programa:

```bash
javac EjercicioURL1.java
java EjercicioURL1
```

## Nota Tecnica

El codigo incluye un comentario importante sobre la depreciacion del formato tradicional de creacion de URLs. La forma moderna recomendada es:

```java
URL nombre = URI.create("url").toURL();
```

En lugar del formato deprecado:

```java
URL nombre = new URL("url");
```