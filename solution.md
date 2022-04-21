## Solución SOLID.
### Principios que se incumplen.
- Single Responsability Principle.
    - La clase "File" no debe encargarse de añadir ficheros o listarlos. Mucho menos convertir ficheros MP3 a WAV.
      - SOLUCIÓN: Crear clases que contengan funcionalidades generales para trabajar con ficheros File.
- Principio de Liskov.
  - Tengo duda de si este principio se inclumple, ya que al solucionar el principio "Interface Segregation" éste desaparece.
  - Se lanzan excepciones que en la clase padre no se lanzan. Excepción en concreto: "UnsupportedOperationException".
- Interface Segregation.
  - Existe una interfaz global llamada "FileSystemItem" la cual abarca demasiados métodos muy generales.
    - SOLUCIÓN: Separar esa interfaz en varias interfaces más pequeñas.
- Dependency Inversion.
  - Al trabajar solucionar el principio de Interface Segregation, he tenido que cambiar algunas clases para que el programa compile.
    Esto ocasiona que las clases dependen de CONCRECIONES y no ABSTACCIONES, por lo que se podría solucionar utilizando un patrón
    Builder o algún tipo de Factory (No está implementado ya que ha ocurrido en clases no evaluables. Ahorro de tiempo, lo siento :( ).