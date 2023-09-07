# Laboratorio 3 - TDD

Este repositorio contiene el código y los pasos necesarios para completar el Laboratorio 3 de TDD. 

## Ejercicio "Registraduría"

### Configuración Inicial

1. Crea un proyecto Maven.
2. Actualiza y agrega las dependencias necesarias, incluyendo JUnit.
3. Cambia la versión del compilador de Java a la versión 8 en el archivo `pom.xml`.
![image](https://github.com/samuelmahecha/CVDSLaboratorio3/assets/112221181/8193d691-8e8f-4379-b9bf-b451b3f6f961)
![image](https://github.com/samuelmahecha/CVDSLaboratorio3/assets/112221181/b27d3c54-1a66-4d07-82c5-7e806981c6f6)
![image](https://github.com/samuelmahecha/CVDSLaboratorio3/assets/112221181/ed23e336-56cc-4400-89cb-3c91f8447d60)
![image](https://github.com/samuelmahecha/CVDSLaboratorio3/assets/112221181/3beee0db-b734-4ac3-9984-037945e0a031)


### Estructura del Proyecto

El proyecto tiene la siguiente estructura:

- `src/main/java/edu/eci/cvds/tdd/registry`: Contiene las clases principales del ejercicio.
  - `Person.java`: Representa una persona.
  - `RegisterResult.java`: Enumeración de resultados del registro.
  - `Gender.java`: Enumeración de géneros.
  - `Registry.java`: Clase principal con el método `registerVoter`.

- `src/test/java/edu/eci/cvds/tdd/registry`: Contiene las pruebas unitarias.
  - `RegistryTest.java`: Pruebas para el método `registerVoter`.
![image](https://github.com/samuelmahecha/CVDSLaboratorio3/assets/112221181/a1458708-1226-4893-a05a-764202c5b730)
![image](https://github.com/samuelmahecha/CVDSLaboratorio3/assets/112221181/d76d4080-9c1f-40af-a8b8-173cd3adcaa2)

### Casos de Equivalencia

Se identificaron los siguientes casos de equivalencia:

1. Caso de equivalencia para una persona válida.
2. Caso de equivalencia para una persona con número de documento duplicado.
3. Caso de equivalencia para una persona menor de edad.
4. Caso de equivalencia para una persona con género no válido.
5. Caso de equivalencia para una persona con información faltante.

### Implementación

En el archivo `RegistryTest.java`, se han implementado pruebas para cada uno de los casos de equivalencia identificados. Asegurandonos de que las pruebas pasen correctamente.
![image](https://github.com/samuelmahecha/CVDSLaboratorio3/assets/112221181/136b1776-cbc2-4a3c-a6b8-2e1ebe69cd55)

En el archivo `Registry.java`, completamos la implementación del método `registerVoter` para que devuelva el resultado esperado según la entrada.
![image](https://github.com/samuelmahecha/CVDSLaboratorio3/assets/112221181/58613d8a-1360-42cc-abf2-5f663b3cd56b)

## Ejercicio "Descuento de Tarifas"

### Configuración Inicial

1. Descarga el archivo `aerodescuentos.jar`.
2. Agrega la dependencia al archivo `pom.xml`.
![image](https://github.com/samuelmahecha/CVDSLaboratorio3/assets/112221181/9999123e-8641-4365-a261-ca6c630aec77)

### Estructura del Proyecto

- `src/test/java/edu/eci/cvds/tdd/aerodescuentos`: Contiene las pruebas para el ejercicio de descuento de tarifas.
  - `TarifasTest.java`: Implementación de las pruebas diseñadas previamente.
 ![image](https://github.com/samuelmahecha/CVDSLaboratorio3/assets/112221181/b27a90ff-c963-4521-a8cc-66ebaed43bf5)

### Diseño de Puebas de Acuerdo al Documento
## Excepción de tipo ExcepcionParametrosInvalidos

De acuerdo con la especificación, deberiamos arrojar una excepción de tipo ExcepcionParametrosInvalidos en los siguientes casos:

- Si la tarifaBase es un valor negativo o cero.
- Si los diasAntelacion es un valor negativo.
- Si la edad es un valor negativo o cero.

### Clases de Equivalencia

#### Clase 1: Valores válidos
- tarifaBase > 0
- diasAntelacion > 0
- edad > 0

#### Clase 2: tarifaBase no válido
- tarifaBase <= 0

#### Clase 3: diasAntelacion no válido
- diasAntelacion <= 0

#### Clase 4: edad no válido
- edad <= 0

### Casos de prueba específicos

**Caso 1: Valores válidos**
- tarifaBase = 1000
- diasAntelacion = 21
- edad = 30
- Resultado esperado: No se debe arrojar una excepción.

**Caso 2: tarifaBase no válido**
- tarifaBase = 0
- diasAntelacion = 21
- edad = 30
- Resultado esperado: Se debe arrojar ExcepcionParametrosInvalidos.

**Caso 3: diasAntelacion no válido**
- tarifaBase = 1000
- diasAntelacion = 0
- edad = 30
- Resultado esperado: Se debe arrojar ExcepcionParametrosInvalidos.

**Caso 4: edad no válido**
- tarifaBase = 1000
- diasAntelacion = 21
- edad = -5
- Resultado esperado: Se debe arrojar ExcepcionParametrosInvalidos.

### Condiciones de frontera

Las condiciones de frontera serian los valores límites que marcan la transición entre clases de equivalencia. Para los casos de prueba anteriores, las condiciones de frontera serían:

- tarifaBase = 1 (El valor más bajo permitido)
- diasAntelacion = 1 (El valor más bajo permitido)
- edad = 1 (El valor más bajo permitido)

### Casos de prueba para condiciones de frontera

**Caso 5.1: tarifaBase en el límite inferior**
- tarifaBase = 1
- diasAntelacion = 21
- edad = 30
- Resultado esperado: No se debe arrojar una excepción.

**Caso 5.2: diasAntelacion en el límite inferior**
- tarifaBase = 1000
- diasAntelacion = 1
- edad = 30
- Resultado esperado: No se debe arrojar una excepción.

**Caso 5.3: edad en el límite inferior**
- tarifaBase = 1000
- diasAntelacion = 21
- edad = 1
- Resultado esperado: No se debe arrojar una excepción.


### Implementación de Pruebas

En el archivo `TarifasTest.java`, se encuentran las pruebas diseñadas previamente para el cálculo de tarifas de vuelos. Estas pruebas utilizan el método `calculoTarifa` de la clase `CalculadorDescuentos`.

### Ejecución de Pruebas

Ejecuta el comando Maven para compilar y ejecutar las pruebas. Verifica que todas las pruebas sean exitosas y revisa el reporte generado.

### Autores
 - Jose Samuel Mahecha Alarcon
 - Hann Jang
