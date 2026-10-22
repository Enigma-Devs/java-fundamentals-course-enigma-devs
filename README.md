# Fundamentos de Java para Principiantes

> Curso introductorio de Java y Programación Orientada a Objetos (POO) para estudiantes de 12 a 17 años. No se requiere instalar software: las prácticas se realizan en editores web gratuitos.

## Información general

- **Curso académico:** 1ASI0729 Desarrollo de Aplicaciones Open Source, ciclo 202620.
- **Formato:** 9 lecciones breves en video, aproximadamente 60 minutos en total.
- **Público objetivo:** estudiantes de secundaria sin conocimientos previos.
- **Entorno de práctica:** navegador web y editor Java en línea (p. ej., OnlineGDB, JDoodle o Replit).
- **Proyecto integrador provisional:** mascota virtual en consola. Se desarrolla gradualmente desde la primera lección hasta convertirse en una aplicación basada en objetos.

## Plan de curso

Consulta el **[plan de curso completo](./upc-pre-202620-1asi0729-NRC-STARTUP-course-plan.md)**, que contiene el recorrido de aprendizaje, las duraciones, las actividades, los enlaces pendientes de los videos y la participación del equipo.

**Enlace público al repositorio:** `[AGREGAR URL REAL DE GITHUB CUANDO SE CREE]`.

## Estructura del repositorio

```text
java-fundamentals-course-[nombre-del-equipo]/
├── README.md
├── upc-pre-202620-1asi0729-NRC-STARTUP-course-plan.md
├── starter-files/         # Código inicial para actividades prácticas
├── completed-examples/   # Código Java final de cada lección
└── scripts/              # Guiones de narración y grabación
```

Las carpetas están creadas inicialmente con archivos `.gitkeep`; se añadirán los ejercicios y guiones conforme avance el trabajo.

## Cómo realizar las prácticas (sin instalaciones)

1. Abre el enlace del editor en línea correspondiente a la lección desde el [plan de curso](./upc-pre-202620-1asi0729-NRC-STARTUP-course-plan.md).
2. Ejecuta el código inicial en tu navegador.
3. Completa los retos indicados en el video.
4. Si necesitas comprobar tu resultado, consulta el código de `completed-examples/`.

No se debe exigir al estudiante instalar JDK, IDE, extensiones ni herramientas locales; toda la experiencia de aprendizaje funciona en línea.

## Colaboración del equipo

Las personas integrantes colaboran a través de sus propias cuentas de GitHub y deben registrar cambios mediante commits identificables. Propuesta de flujo:

```bash
git clone https://github.com/ORGANIZACION/java-fundamentals-course-NOMBRE-EQUIPO.git
cd java-fundamentals-course-NOMBRE-EQUIPO
git checkout -b feature/mi-leccion
# Editar archivos de la lección
git add .
git commit -m "docs: add lesson content"
git push -u origin feature/mi-leccion
```

Luego se crea un **Pull Request** para revisar e integrar los cambios a `main`. Se recomienda que cada integrante use su propia cuenta GitHub, sin compartir contraseñas ni tokens.

## Estado del proyecto

**Plantilla inicial, no entrega final:** aún se deben reemplazar los identificadores `NRC`, `STARTUP`, el nombre del equipo, los nombres de los participantes, los enlaces de YouTube y los enlaces a las prácticas precargadas. También se deben agregar todos los códigos y guiones.

## Condiciones de publicación

- Repositorio **público** y propiedad de una **organización GitHub**.
- Videos publicados como **no listados** en YouTube.
- Los ejemplos y videos dirigidos al alumnado no deben contener branding ni atribución personal de los autores.
- La identificación de integrantes y su contribución se documenta en la sección administrativa "Elaboración" del plan de curso.
