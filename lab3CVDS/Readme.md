# LABORATORIO 3 - PBT - 2021-2
# COMPILAR Y EJECUTAR:

* Ejecute los comandos necesarios de Maven, para compilar el proyecto y verificar que el proyecto se creó
correctamente y los cambios realizados al archivo pom no generan inconvenientes.

Creamos las dependencias del proyecto con requisitos:

* Grupo: edu.eci.cvds
* Artefacto: ClasesEquivalencia
* Paquete: edu.eci.cvds.tdd
* archetypeArtifactId: maven-archetype-quickstart

Con la linea: 

``` 
mvn archetype:generate -DgroupId=edu.eci.cvds -DartifactId=ClasesEquivalencia -DarchetypeArtifactId=maven-archetype-quickstart -Dpackage=edu.eci.cvds.tdd -DinteractiveMode=false 
```


Compilamos con el codigo `mvn package`



* Busque el comando requerido para ejecutar las pruebas unitarias de un proyecto desde Maven y ejecútelo 
sobre el proyecto. Se debe ejecutar la clase AppTest con resultado exitoso

ejecutamos las pruebas con `mvn test`

## Clases de equivalencia:

Se identificaron 5 distintas clases de equivalencia:

* Que el votante este muerto
* Que sea mayor de edad y este vivo
* Que su edad no sea valida (menor a 100) y este vivo
* Que no pueda votar 
* Que haya sido registrado y este vivo

# Ejecutar las pruebas
La diferencia que se encontra al utilizar mvn package y mvn test es que la primera
ejecuta todo el codigo y las pruebas y la segunda solo ejecuta las pruebas 

# Ejercicio "Descuento de Tarifas"
## Realizar diseño de pruebas

# AeroDescuentos
1. De acuerdo con lo indicado, y teniendo en cuenta que NO hay precondiciones, en qué casos se debería
arrojar una excepción de tipo ExcepcionParametrosInvalidos?. Agregue esto a la especificación

En el caso de que la edad o los dias sean negativos, incluso si son valores distintos a numero o nulos

2. En la siguiente tabla enumere un conjunto de clases de equivalencia que -según usted- creen una
buena división del conjunto de datos de entrada de la función anterior:

|Numero	| Clases de equivalencia| Resultado correcto / incorrecto|
|---	|---	     		|---			         |
|   1	|-15%->dias>20 y dias>0 | Correcto			 |
|   2	|-5%->edad<18 y dias > 0| Correcto			 |
|   3	|-8%->edad>65 y dias > 0| Correcto			 |
|   4   | dias < 0 y edad < 0   | Incorrecto			 |

3. Para cada clase de equivalencia, defina un caso de prueba específico, definiendo: parámetros de
entrada y resultados esperados.

4. A partir de las clases de equivalencia identificadas en el punto 2, identifique las condiciones límite o
de frontera de las mismas.

5. Para cada una de las condiciones de frontera anteriores, defina casos de prueba específicos.

Los puntos 3, 4 y 5 se encuentran desarrollados en el directorio AeroDescuentos

