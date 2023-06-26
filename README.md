# POOI-UNO
:zap: :zap: :zap: :zap: :zap: :zap: :zap: :zap: :zap: :zap: :zap: :zap: :zap: :zap: :zap: :zap: :zap: :zap: :zap: :zap: :zap: :zap: :zap: :zap: :zap: :zap: :zap: :zap: :zap: :zap: 
### _Juego de Estrategia creado para Trabajo Practico de la materia Programación Orientada a Objetos I_
:zap: :zap: :zap: :zap: :zap: :zap: :zap: :zap: :zap: :zap: :zap: :zap: :zap: :zap: :zap: :zap: :zap: :zap: :zap: :zap: :zap: :zap: :zap: :zap: :zap: :zap: :zap: :zap: :zap: :zap:

Herencia - Polimorfismo - Clases abstractas - Interfaces.
1. Introducción:
  Vamos a modelar y desarrollar las distintas unidades de un juego de estrategia.

2. Especificación:
   Del juego participan las siguientes Unidades

* Soldados  
* Arqueros  
* Lanceros  
* Caballeros  

3. Reglas del juego:

Los soldados pueden atacar cuerpo a cuerpo a otras unidades si tienen suficiente energía.
Cada ataque les consume 10 puntos de energía, y comienzan con 100.
Restauran energía si reciben la ración de agua. Infringen un daño de 10 puntos y comienzan con 200 de salud.

Los Arqueros pueden atacar a una distancia de entre 2 y 5 respecto de su enemigo, y si tienen suficientes flechas.
Comienzan con 20 flechas en su carcaj, y pueden recargar si reciben un paquete de seis flechas. Infringen un daño de 5 puntos, y comienzan con 50 de salud.  

Los lanceros pueden atacar a una distancia de 1 a 3, sin condición. Infringen un daño de 25 puntos, y comienzan con 150 de salud.  

Los caballeros pueden atacar a una distancia de 1 a 2, siempre que su caballo no se haya puesto rebelde. Infringe un daño de 50 puntos y comienza con 200 de salud.  

Un caballo se pone rebelde luego de 3 ataques, y puede calmarse si recibe una ración de agua.  

**Ninguna unidad muerta puede atacar, por supuesto**

4. Pruebas: Se debe probar (JUnit) cada aspecto de la definición, y simular encuentros
entre las unidades.

5. Entrega: La presente actividad se realizará de a pares de alumnos.
a. Diagrama de clases:
b. Código java.
c. Casos de prueba exhaustivos con JUnit.
