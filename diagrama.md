
```mermaid
classDiagram
    class Main {
        +main(args: String[])$ void
    }

    class GestorImpresiones {
        -Deque~String~ pendientes
        -Deque~String~ historial
        +registrarDocumento(nombre: String)
        +imprimirSiguiente()
        +recuperarUltima()
        +mostrarEstado()
    }

    Main --> GestorImpresiones : usa
