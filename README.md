# TDA-Gestor-Impresora

Sistema interactivo desarrollado en **Java** para la gestión de documentos de impresión utilizando Estructuras de Datos Lineales (`Deque` y `ArrayDeque`). El proyecto simula una cola para los documentos pendientes y una pila para el historial, permitiendo operaciones combinadas de control de flujo.

## Funcionalidades del Sistema

* **Registrar documento:** Añade un nuevo documento al final de la cola de pendientes utilizando `offerLast`.
* **Imprimir siguiente:** Retira el documento más antiguo del frente de pendientes (`pollFirst`) y lo almacena en la cima del historial (`push`).
* **Recuperar última impresión:** Saca el último documento impreso del historial (`pop`) y lo devuelve al frente de la cola (`addFirst`).
* **Mostrar estado:** Visualiza el contenido actual de las estructuras de pendientes e historial.

## Requisitos Técnicos

* Java Development Kit (JDK) 11 o superior.
* Visual Studio Code (con Extension Pack for Java).

## Instrucciones de Ejecución

1. Clona el repositorio o descarga el archivo fuente `GestorImpresionesInteractivo.java`.
2. Abre la terminal en la carpeta del proyecto y compila el archivo:
   ```bash
   javac GestorImpresionesInteractivo.java
