# Actividad 2 - Proyecto Maven con Commons-CLI y Log4j

## Alumno: Joel Natanael Ochoa

## 📋 Descripción
Aplicación Java que demuestra:
- Uso de **Apache Commons CLI** para procesamiento de argumentos por línea de comandos
- Implementación de **Log4j 2** para sistema de logging estructurado
- Gestión de dependencias con **Maven**
- Empaquetado como archivo JAR ejecutable

## 🚀 Requisitos
- Java JDK 11+
- Apache Maven 3.6+
- IntelliJ IDEA (recomendado) o cualquier IDE compatible

## 🛠️ Configuración
1. Clonar repositorio
2. Importar como proyecto Maven en tu IDE
3. Configurar SDK de Java 11 en:
   - `File > Project Structure > Project SDK`

## 📦 Estructura del Proyecto
Actividad2/
├── src/
│ ├── main/
│ │ ├── java/
│ │ │ └── org/example/
│ │ │ └── Main.java
│ │ └── resources/
│ │ └── log4j2.xml
├── target/
│ ├── Actividad2-1.0-SNAPSHOT.jar
│ └── Actividad2-1.0-SNAPSHOT-jar-with-dependencies.jar
├── pom.xml
└── README.md

Copy

## ⚙️ Compilación y Ejecución
```bash
# Compilar y empaquetar
mvn clean package

# Ejecutar versión estándar (requiere classpath)
java -jar target/Actividad2-1.0-SNAPSHOT.jar --name Joel

# Ejecutar versión con dependencias incluidas (recomendado)
java -jar target/Actividad2-1.0-SNAPSHOT-jar-with-dependencies.jar --name Joel
🎯 Funcionalidades
Comando	Descripción	Ejemplo de uso
-h, --help	Muestra mensaje de ayuda	java -jar ... --help
-v, --version	Muestra versión de la aplicación	java -jar ... --version
-n, --name	Saluda al nombre especificado	java -jar ... --name "Juan Pérez"
📊 Ejemplo de Salida
bash
Copy
$ java -jar target/Actividad2-1.0-SNAPSHOT.jar --name Joel

14:25:30.123 [main] INFO  org.example.Main - Iniciando aplicación Actividad2
14:25:30.456 [main] INFO  org.example.Main - Hola, Joel!
Hola, Joel!
14:25:30.457 [main] INFO  org.example.Main - Aplicación finalizada
📚 Dependencias
Apache Commons CLI 1.5.0 - Para manejo de argumentos

Log4j Core 2.20.0 - Para sistema de logging

Maven Compiler Plugin 3.11.0 - Para compilación Java 11

🛠️ Troubleshooting
Si encuentras problemas:

Verifica que tengas JDK 11 instalado:

bash
Copy
java -version
Si aparecen warnings de Maven, ignóralos (son por compatibilidad)

Para errores de dependencias:

bash
Copy
mvn clean install
📄 Licencia
Este proyecto es con fines educativos. Libre para uso académico.
