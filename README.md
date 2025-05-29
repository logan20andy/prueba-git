# Conversor de Monedas - Java & API ExchangeRate

## Descripción 📌
Este proyecto es una aplicación Java que permite convertir soles peruanos (**PEN**) a diferentes monedas latinoamericanas utilizando la API de **ExchangeRate**. El usuario puede seleccionar una moneda, ingresar un monto y obtener la conversión en tiempo real. Además, todas las conversiones quedan registradas en un archivo JSON como historial.

## 🚀 Características
✅ Consumo de API para obtener tasas de cambio actuales.  
✅ Conversión de **PEN** a las siguientes monedas:
- **BRL** (Real Brasileño)
- **ARS** (Peso Argentino)
- **VES** (Bolívar Venezolano)
- **UYU** (Peso Uruguayo)
- **PYG** (Guaraní Paraguayo)
- **CLP** (Peso Chileno)
- **BOB** (Boliviano)
- **COP** (Peso Colombiano)  
  ✅ Menú interactivo en **bucle hasta que el usuario decida salir**.  
  ✅ Registro de conversiones en un archivo `historial.json`.

## 🛠 Tecnologías Utilizadas
- **Java 17+**
- **Librería Gson** para manejo de JSON
- **API ExchangeRate** para tasas de conversión
- **IntelliJ IDEA** como IDE de desarrollo

## 📁 Estructura del Proyecto
-📦 com.conversionmonedas

    ┣ 📜 Main.java
    ┣ 📜 ApiClient.java
    ┣ 📜 ExchangeRateService.java
    ┣ 📜 CurrencyConverter.java
    ┣ 📜 JsonManager.java
    ┣ 📜 historial.json
    ┗ 📜 README.md


### 📌 Descripción de cada archivo
- **Main.java** → Punto de entrada con el menú interactivo.
- **ApiClient.java** → Obtiene las tasas de cambio desde la API.
- **ExchangeRateService.java** → Extrae la tasa de conversión de una moneda específica.
- **CurrencyConverter.java** → Realiza la conversión de moneda seleccionada por el usuario.
- **JsonManager.java** → Guarda el historial de conversiones en formato JSON.
- **historial.json** → Contiene el registro de todas las conversiones realizadas.

## 🔧 Instalación y Uso
### 1️⃣ Clonar el repositorio
- git clone https://github.com/logan20andy/prueba-git 
- cd prueba-git

### 2️⃣ Agregar dependencias (Maven)
En `pom.xml`, asegúrate de incluir la dependencia de Gson:
```xml
<dependency>
    <groupId>com.google.code.gson</groupId>
    <artifactId>gson</artifactId>
    <version>2.8.9</version>
</dependency>
```

### 3️⃣ Ejecutar el Programa
Compila y ejecuta el proyecto en **IntelliJ IDEA:**
```
javac Main.java
java Main
```

## 🎯 Uso del Programa
- **El usuario ingresa la cantidad en soles.**
- **Selecciona la moneda de destino.**
- **La aplicación realiza la conversión y muestra el resultado.**
- **El historial de conversiones se guarda en historial.json.**
- **El usuario puede seguir usando el programa hasta decidir salir.**


## 🗂 Ejemplo de Historial en JSON
Cada conversión queda registrada con fecha:
```
{
  "historial_conversiones": [
    {
      "moneda_origen": "PEN",
      "moneda_destino": "BOB",
      "cantidad": 23.0,
      "resultado": 43.656299999999995,
      "fecha": "2025-05-28T22:22:58.418051200"
    },
    {
      "moneda_origen": "PEN",
      "moneda_destino": "COP",
      "cantidad": 6.0,
      "resultado": 6758.742,
      "fecha": "2025-05-28T22:23:02.407701200"
    }
  ]
}
```
## 💡 Mejoras Futuras
- 🔹 Agregar más monedas disponibles.
- 🔹 Implementar interfaz gráfica (Swing o JavaFX).
- 🔹 Opción de visualizar historial completo desde el menú.
- 🔹 Manejo avanzado de errores en la API.

## 📄 Licencia
Este proyecto está bajo la licencia MIT.


