<div align="center">

# 📒 Agenda Telefónica en Java

**Aplicación de consola para gestionar una agenda de contactos: agrega, busca, lista, modifica y elimina contactos con validaciones integradas.**

![Java](https://img.shields.io/badge/Java-17-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![IntelliJ IDEA](https://img.shields.io/badge/IntelliJ_IDEA-000000?style=for-the-badge&logo=intellijidea&logoColor=white)
![Git](https://img.shields.io/badge/Git-F05032?style=for-the-badge&logo=git&logoColor=white)

</div>

---

## 📑 Tabla de contenido

- [Descripción](#-descripción)
- [Características](#-características)
- [Reglas de negocio](#-reglas-de-negocio)
- [Tecnologías](#-tecnologías)
- [Estructura del proyecto](#-estructura-del-proyecto)
- [Instalación y ejecución](#-instalación-y-ejecución)
- [Uso del menú](#-uso-del-menú)
- [Ejemplo de ejecución](#-ejemplo-de-ejecución)
- [Autora](#-autora)

---

## 📖 Descripción

**Hackathon2-AgendaTelefonica** es un programa que funciona como una agenda telefónica dentro de la terminal (la pantalla de texto de tu computadora). Un menú numerado te permite guardar contactos, buscarlos, cambiar su teléfono o borrarlos, y el programa evita errores comunes como datos vacíos o contactos repetidos.

Fue desarrollado en **Java** como parte de un Hackathon.

---

## ✨ Características

| Opción | Qué hace |
|---|---|
| 1. Agregar contacto | Guarda un contacto nuevo; avisa si la agenda está llena |
| 2. Verificar si existe contacto | Comprueba si el contacto ya está guardado |
| 3. Listar contactos | Muestra todos los contactos en orden alfabético |
| 4. Buscar contacto | Busca por nombre y apellido y muestra su teléfono |
| 5. Eliminar contacto | Borra un contacto e informa si se logró |
| 6. Modificar teléfono | Cambia el teléfono de un contacto existente |
| 7. Comprobar si la agenda está llena | Indica si todavía hay espacio |
| 8. Mostrar espacios libres | Muestra cuántos contactos más caben |
| 9. Salir | Cierra el programa |

---

## 📏 Reglas de negocio

- Un contacto tiene **nombre**, **apellido** y **teléfono** (el formato del teléfono no se valida).
- Dos contactos se consideran **iguales** si tienen el mismo nombre y apellido, sin importar mayúsculas o minúsculas.
- La agenda puede crearse con un **tamaño máximo indicado** o con el valor por defecto de **10 contactos**.
- Nombre y apellido **no pueden estar vacíos**.
- **No se permiten contactos duplicados**.

---

## 🛠 Tecnologías

| Herramienta | Versión |
|---|---|
| Java (JDK) | **17** |
| IDE de desarrollo | IntelliJ IDEA |
| Control de versiones | Git y GitHub |

> [!IMPORTANT]
> El proyecto fue desarrollado y probado con **Java 17**. Funciona con **JDK 14 o superior** (usa `var` y `switch` con flechas `->`), pero se recomienda la versión 17 para evitar problemas de compatibilidad.

---

## 🗂 Estructura del proyecto

```text
Hackathon2-AgendaTelefonica/
├── src/
│   └── com/agendaTelefonica/
│       ├── AgendaContactos.java   # Lógica de la agenda
│       ├── Contacto.java          # Modelo del contacto
│       └── Main.java              # Menú por consola (punto de entrada)
├── .gitignore
└── README.md
```

---

## 🚀 Instalación y ejecución

El programa se puede usar **en cualquier computadora con Java 17**, con o sin un IDE. Elige la opción que corresponda:

| Quiero... | Usa la opción |
|---|---|
| Solo usar el programa, sin modificar nada | [Opción A: Terminal](#opción-a-solo-usarlo-desde-la-terminal-sin-ide) |
| Modificar el código | [Opción B: Cualquier IDE](#opción-b-modificar-el-código-en-un-ide) |

### Paso 0: Instalar Java 17 (necesario en ambas opciones)

1. Descarga **JDK 17** desde [adoptium.net](https://adoptium.net/) e instálalo (Windows, macOS o Linux).
2. Abre una terminal y comprueba la instalación:

   ```bash
   java -version
   javac -version
   ```

   Debe mostrar la versión **17** (o superior).

> **¿Cómo abro una terminal?**
> - **Windows:** presiona `Win`, escribe `cmd` o `PowerShell` y presiona Enter.
> - **macOS:** abre la app **Terminal** (Spotlight: `Cmd + Espacio`).
> - **Linux:** `Ctrl + Alt + T`.

### Paso 1: Obtener el proyecto

**Sin Git:** en la página del repositorio en GitHub, haz clic en **Code → Download ZIP** y descomprime la carpeta.

**Con Git:**

```bash
git clone https://github.com/marianaaquinoalarcon/Hackathon2-AgendaTelefonica.git
```

Luego entra a la carpeta del proyecto desde la terminal:

```bash
cd Hackathon2-AgendaTelefonica
```

### Opción A: Solo usarlo desde la terminal (sin IDE)

Estando dentro de la carpeta del proyecto, ejecuta estos dos comandos:

```bash
# 1. Compilar (se hace una sola vez)
javac -d out src/com/agendaTelefonica/*.java

# 2. Ejecutar
java -cp out com.agendaTelefonica.Main
```

Aparecerá el menú y ya puedes usar la agenda. ✅

<details>
<summary><b>Opcional: crear un archivo ejecutable (.jar)</b></summary>

Un `.jar` agrupa todo el programa en un solo archivo, útil para compartirlo con quien solo quiera usarlo.

```bash
# Crear el .jar (después de compilar)
jar --create --file AgendaTelefonica.jar --main-class com.agendaTelefonica.Main -C out .

# Ejecutarlo en cualquier computadora con Java 17
java -jar AgendaTelefonica.jar
```

> El programa es de consola: ejecútalo siempre desde una terminal. Si le das doble clic al `.jar`, la ventana se cerrará sola.

</details>

### Opción B: Modificar el código en un IDE

Funciona con **IntelliJ IDEA, Eclipse, VS Code, NetBeans** o cualquier IDE para Java:

1. Abre la carpeta del proyecto (o impórtala como proyecto Java existente).
2. Configura el **SDK / JDK en versión 17**.
3. Marca la carpeta `src` como carpeta de código fuente (*Sources Root*) si el IDE no lo hace solo.
4. Abre `src/com/agendaTelefonica/Main.java` y ejecuta la clase **`Main`** (botón ▶️ o *Run*).

| IDE | Dónde configurar Java 17 |
|---|---|
| IntelliJ IDEA | `File → Project Structure → Project → SDK` |
| Eclipse | `Project → Properties → Java Build Path → Libraries` |
| VS Code | Extensión *Extension Pack for Java* y comando `Java: Configure Java Runtime` |
| NetBeans | `Project Properties → Libraries → Java Platform` |

> [!TIP]
> Si tu computadora tiene otra versión de Java instalada, verifica que el IDE o la terminal usen la 17. Un error como `class file has wrong version` o `invalid source release` indica que se está usando una versión distinta.

---

## 🎮 Uso del menú

Al iniciar, el programa muestra este menú. Escribe el **número** de la opción y presiona Enter:

```text
*** Bienvenido a nuestra Agenda Telefonica ***

Menu:
1. Agregar contacto
2. Verificar si existe contacto
3. Listar contactos
4. Buscar contacto
5. Eliminar Contacto
6. Modificar telefono
7. Comprobar si Agenda esta llena
8. Mostrar espacios libres
9. Salir
Elige una opcion:
```

---

## 💻 Ejemplo de ejecución

**Verificar si existe un contacto**

```text
Elige una opcion: 2
Nombre del contacto: Luis
Apellido del contacto: Maldonado
Telefono del contacto: 7635261878
El contacto ya existe en tu agenda
```

**Listar contactos**

```text
Elige una opcion: 3
Luis Maldonado - 7635261878
```

**Eliminar un contacto**

```text
Elige una opcion: 5
Nombre del contacto: Luis
Apellido del contacto: Maldonado
Telefono del contacto: 7635261878
Contacto eliminado correctamente
```

**Modificar teléfono**

```text
Elige una opcion: 6
Nombre del contacto: Mariana
Apellido del contacto: Arleth
Contacto encontrado...
Teléfono actual : 7444543829
Introduce el nuevo numero de telefono: 7645098765
Teléfono actualizado correctamente.
```

**Estado de la agenda**

```text
Elige una opcion: 7
Agenda con espacio disponible, puede agregar nuevos contactos

Elige una opcion: 8
Se pueden agregar 8 contactos mas
```

**Salir**

```text
Elige una opcion: 9
Regresa pronto!
```

---

## 👩‍💻 Autores

**César Andre García León**            [@Andre1012](https://github.com/https://github.com/Andre1012)

**Eric Alexander Wences Pimentel**     [@AlexW13Rift](https://github.com/AlexW13Rift)

**Mariana Arleth Aquino Alarcón**      [@marianaaquinoalarcon](https://github.com/marianaaquinoalarcon)

**Victor Caicedo**                     [@VMCaicedo](https://github.com/VMCaicedo)

**Yessica Chaparro**                   [@yessicachaparro4-cmyk](https://github.com/yessicachaparro4-cmyk)


