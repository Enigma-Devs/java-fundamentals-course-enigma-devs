# Fundamentos de Java para Principiantes

> Curso introductorio de Java y Programación Orientada a Objetos (POO) para estudiantes de 12 a 17 años. No se requiere instalar software: las prácticas se realizan en editores web gratuitos.

▶️ **[Ver el curso completo en YouTube](https://www.youtube.com/playlist?list=PLdj8RZo5b8Io)**


## Información general

- **Curso académico:** 1ASI0729 Desarrollo de Aplicaciones Open Source, ciclo 202620.
- **Formato:** 10 lecciones breves en video (5 a 7 minutos cada una), aproximadamente 60 minutos en total.
- **Público objetivo:** estudiantes de secundaria sin conocimientos previos.
- **Entorno de práctica:** navegador web y editor Java en línea (p. ej., OnlineGDB, JDoodle o Replit).
- **Proyecto final:** «Mi playlist», una aplicación en consola basada en objetos que integra lo aprendido en las lecciones 1 a 9. Cada lección construye un proyecto corto propio (tarjeta de presentación, plan de ahorro, batería del celular, alcancía digital, entre otros).

upc-pre-202620-1asi0729-7760-Enigma-Devs-course-plan.md
## Plan de curso

Consulta el **[plan de curso completo](./upc-pre-202620-1asi0729-7760-Enigma-Devs-course-plan.md)**, que contiene el recorrido de aprendizaje, las duraciones, las actividades, los enlaces pendientes de los videos y la participación del equipo.

**Enlace público al repositorio:** [https://github.com/Enigma-Devs/java-fundamentals-course-enigma-devs](https://github.com/Enigma-Devs/java-fundamentals-course-enigma-devs)

## Estructura del repositorio

```text
java-fundamentals-course-[enigma-devs]/
├── README.md
├── upc-pre-202620-1asi0729-NRC-STARTUP-course-plan.md
├── starter-files/         # Código inicial para actividades prácticas
├── completed-examples/   # Código Java final de cada lección
└── scripts/              # Guiones de narración y grabación
```
Cada lección tiene una carpeta con el mismo nombre en `starter-files/` y `completed-examples/` (por ejemplo, `leccion-03-plan-de-ahorro/`), y su guion en `scripts/` (por ejemplo, `leccion-03-plan-de-ahorro.md`). Todos los programas se llaman `Main.java`, para que puedan copiarse y ejecutarse directamente en OnlineGDB sin realizar cambios.

## Cómo realizar las prácticas (sin necesidad de instalaciones)

1. Abre el enlace del editor en línea correspondiente a la lección desde el [plan de curso](upc-pre-202620-1asi0729-7760-Enigma-Devs-course-plan.md).
2. Ejecuta el código inicial en tu navegador.
3. Completa los retos indicados en el video.
4. Si necesitas comprobar tu resultado, consulta el código de `completed-examples/`.

No se exige al estudiante instalar JDK, IDE, extensiones ni herramientas locales; toda la experiencia de aprendizaje funciona en línea.

## Colaboración del equipo

Los integrantes de **Enigma-devs** colaboran a través de sus propias cuentas de GitHub y deben registrar cambios mediante commits identificables. Propuesta de flujo:

```bash
git clone https://github.com/Enigma-Devs/java-fundamentals-course-enigma-devs.git
cd java-fundamentals-course-enigma-devs
git checkout -b feature/mi-leccion
# Editar archivos de la lección
git add .
git commit -m "docs: add lesson content"
git push -u origin feature/mi-leccion
```
Luego se crea un **Pull Request** para revisar e integrar los cambios a `main`.

## Estado del proyecto

Las 10 lecciones están publicadas en YouTube como una playlist de videos no listados. El repositorio contiene el código inicial, los ejemplos completos y los guiones de cada lección.

## Condiciones de publicación

- Repositorio **público** y propiedad de una **organización GitHub**.
- Videos publicados como **no listados** en YouTube.
- Los ejemplos y videos dirigidos al alumnado no deben contener branding ni atribución personal de los autores.
- La identificación de integrantes y su contribución se documenta en la sección administrativa "Elaboración" del plan de curso.
