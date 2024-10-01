**Enunciado del ejercicio:**

Crea un programa en Java que liste el contenido de un directorio y diferencie entre archivos y subdirectorios.

### Objetivo:
Desarrollar un programa que, dado un camino de un directorio, muestre en pantalla si dicho camino corresponde a un archivo o a un directorio. En caso de ser un directorio, debe listar todo su contenido, indicando claramente si cada elemento es un archivo o un subdirectorio.

### Instrucciones:
1. Crea una clase llamada `DirectoryList` que contenga el método `main`.
2. El programa debe aceptar un argumento opcional (una ruta de un directorio). Si no se proporciona ningún argumento, se debe asumir que la ruta es el directorio actual (`.`).
3. Verifica si el camino proporcionado existe. Si no existe, el programa debe imprimir el mensaje: `File does not exist`.
4. Si el camino corresponde a un archivo, imprime: `<nombre_de_archivo> is a file`.
5. Si el camino corresponde a un directorio, imprime el mensaje: `<nombre_del_directorio> is a directory. Contents:`.
6. Para cada elemento dentro del directorio:
    - Si es un archivo, muestra el nombre precedido por `(_)`.
    - Si es un subdirectorio, muestra el nombre precedido por `(/)`.
    - Si es un elemento desconocido, precede el nombre con `(?)`.

### Ejemplo de salida:
Si el directorio actual tiene los archivos y carpetas siguientes:
```
/dir1
/file1.txt
/file2.txt
```

La salida del programa sería:
```
./ is a directory. Contents:
(/)dir1
(_)file1.txt
(_)file2.txt
```

Si se ejecuta con una ruta a un archivo, por ejemplo, `file1.txt`, el programa debería imprimir:
```
file1.txt is a file
```

### Puntos clave:
- Asegúrate de comprobar si el camino existe antes de intentar listar el contenido.
- Utiliza la clase `File` de Java para realizar todas las operaciones relacionadas con archivos y directorios.