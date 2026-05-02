# 🛡️ Laboratorio 1: El Gran Censo de Hyrule - Programación de N Capas

![Java](https://img.shields.io/badge/Java-21-orange?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.4.0-brightgreen?style=for-the-badge&logo=springboot&logoColor=white)
![Maven](https://img.shields.io/badge/Maven-3.9-C71A36?style=for-the-badge&logo=apachemaven&logoColor=white)
![Lombok](https://img.shields.io/badge/Lombok-1.18.30-red?style=for-the-badge&logo=lombok&logoColor=white)
![Architecture](https://img.shields.io/badge/Architecture-N--Layers-blue?style=for-the-badge)


## 📜 Descripción del Proyecto
Este sistema ha sido desarrollado por encargo de **Purah**, quien necesita organizar el inventario de materiales y tesoros del reino de Hyrule para asistir a Link en su aventura. La aplicación es una implementación técnica para la materia **Programación de N Capas**, centrada en los principios de **Inversión de Control (IoC)** e **Inyección de Dependencias (DI)** utilizando el contenedor de **Spring Boot**.

> "Es peligroso ir solo, ¡toma esta arquitectura!" 🗡️
---

## 🏛️ Arquitectura del Sistema (N-Capas)

Siguiendo las directrices del laboratorio, el proyecto implementa una separación lógica estricta para garantizar que el sistema sea modular y escalable, incluso sin una base de datos física.

| Capa | Responsabilidad Técnica | Componente Bean |
| :--- | :--- | :--- |
| **Dominio** | Definición de modelos de datos y lógica de negocio pura. | `Material` |
| **Servicio** | Orquestación de lógica y procesamiento de flujos de datos. | `@Service MaterialService` |
| **Repositorio** | Abstracción de la fuente de datos (Persistencia en Memoria). | `@Repository MaterialRepository` |
| **Common** | Fuente de datos estática y utilidades globales. | `@Component ListaMateriales` |

---

## 🎯 Requerimientos del Laboratorio

### 1. Gestión de Datos en Memoria 📦
Debido a la ausencia de una base de datos persistente en el reino, toda la información se gestiona en memoria. Se ha implementado el patrón **Builder** de Lombok para la creación fluida de objetos.

### 2. Lógica de Negocio Implementada 🧠
A través de **Java Streams API**, el sistema realiza las siguientes operaciones críticas:
- ✅ **Ordenación por Precio**: Listado de materiales de mayor a menor precio para optimizar las ventas de Link.
- ✅ **Material de Élite**: Identificación automática del material más caro del catálogo.
- ✅ **Filtrado de Rareza**: Localización de objetos de grado *Legendario*.


### 3. Salida de Consola Estandarizada 📟
El sistema cumple con el formato de log requerido para la base de datos de Hyrule:
`[HYRULE-DB] Nombre: <Nombre> | Categoría: <Categoría> | Precio: <Precio> Rupias`

---

## 🛠️ Especificaciones Técnicas

### Inyección de Dependencias
Se ha evitado estrictamente el uso de la palabra clave `new` para instanciar dependencias. En su lugar, se utiliza la **Inyección por Constructor** mediante la anotación `@RequiredArgsConstructor` de Lombok, asegurando que los componentes sean inmutables y fáciles de testear.

### Modelo de Datos (Entity)
Cada `Material` registrado cuenta con:
- **Atributos**: Nombre, Categoría, Efecto, Precio, Ubicación y Rareza.
- **Patrón Builder**: Implementación obligatoria para garantizar la integridad del objeto durante su creación.

---

## 📂 Estructura del Pergamino (Proyecto)

```text
hyrule-census/
├── src/main/java/com/example/hyrulecensus/
│   ├── Common/       # Fuente de datos "quemados" (ListaMateriales.java)
│   ├── Domain/       # Núcleo del negocio (Material.java)
│   ├── Repository/   # Capa de persistencia simulada
│   ├── Service/      # Lógica de procesamiento (Streams)
│   └── HyruleCensusApplication.java # Runner con logs [HYRULE-DB]
└── src/main/resources/
    └── application.yaml # Configuración de Spring
```

---

## 🚀 Despliegue en el Reino

Para ejecutar este censo, asegúrate de tener instalada la **Master Sword** (JDK 21) y sigue estos pasos:

1. **Clonar el repositorio:**
   ```bash
   git clone https://github.com/Michelljk/Laboratorio1_PNC.git
   ```
2. **Compilar y Testear:**
   ```bash
   mvn clean install
   ```
3. **Ejecutar:**
   ```bash
   mvn spring-boot:run
   ```

---

## 👨‍💻 Autor
**Michelljk**


---
*Este proyecto es parte del Laboratorio 1 de la materia Programación de N Capas.*
