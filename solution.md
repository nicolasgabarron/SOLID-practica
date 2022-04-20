## Solución SOLID.
### Principios que se incumplen.
- Single Responsability Principle.
    - La clase "File" no debe encargarse de añadir ficheros o listarlos. Mucho menos convertir ficheros MP3 a WAV.
      - SOLUCIÓN: Crear clases que contengan funcionalidades generales para trabajar con ficheros File.
- Interface Segregation.
  - Existe una interfaz global llamada "FileSystemItem" la cual abarca demasiados métodos muy generales.
    - SOLUCIÓN: Separar esa interfaz en varias interfaces más pequeñas.
- Principio de Liskov.
  - Tengo duda de si este principio se inclumple, ya que al solucionar el principio "Interface Segregation" éste desaparece.
  - Se lanzan excepciones que en la clase padre no se lanzan. Excepción en concreto: "UnsupportedOperationException".