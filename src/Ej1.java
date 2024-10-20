import jdk.swing.interop.SwingInterOpUtils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;

public class Ej1 {
    public static void main(String[] args) {

        String path = ".";

        if (args.length > 0) {
            path = args[0];
        }

        File file = new File(path);

        // Ejercicio1
        if (file.exists()) {
            System.out.println("Can read: " + file.canRead());
            System.out.println("Can write: " + file.canWrite());
            System.out.println("Can execute: " + file.canExecute());
        } else  {
            System.out.println("File does not exist");
        }

        // Ejercicio 3
        if (file.exists() && file.isFile()) {
            System.out.println("File size: " + file.length() + " bytes.");
        } else  {
            System.out.println("File does not exist");
        }

        // Ejercicio 4
        if (file.exists()){
            System.out.println("Parent directory: " + file.getParent());
        } else {
            System.out.println("File does not exist");
        }

        // Ejercicio 4b
        if (file.exists()){


            System.out.println("Parent directory: " + file.getParentFile().getName());
        } else {
            System.out.println("File does not exist");
        }

        // Ejercicio 6
        //File.createNewFile("algo.txt");
        File newFile = new File(args[0]);
        try {
            if (newFile.createNewFile()){
                System.out.println("Se ha creado el archivo");
            } else {
                System.out.println("No se ha creado el archivo");
            }
        } catch (IOException e) {
            System.out.println("No se ha podido crear el archivo");
            throw new RuntimeException(e);
            //e.printStackTrace();
        }

        // Ejercicio 7: Eliminar y renombrar archivos
        File fileToDelete = new File("archivoEliminar.txt");
/*
        if (fileToDelete.exists()){
            System.out.println("Archivo eliminado " + fileToDelete.delete());
        } else {
            System.out.println("Archivo no encontrado");
        }*/


        if (fileToDelete.exists()){
            if (fileToDelete.delete()){
                System.out.println("Archivo eliminado");
            } else {
                System.out.println("Archivo NO eliminado");
            }
        } else {
            System.out.println("El archivo no existe");
        }

        File fileToRename = new File("archivoRenombrar.txt");
        File renamedFile = new File("archivoRenombrado.txt");

        if (fileToRename.exists()){
            if (fileToRename.renameTo(renamedFile)){
                System.out.println("Archivo renombrado");
            } else {
                System.out.println("Archivo NO renombrado");
            }
        } else {
            System.out.println("El archivo no existe");
        }


        // Ejercicio 8: Crear un directorio
        File newDirectory = new File("nuevoDirectorio");
        if(newDirectory.mkdir()) {
            System.out.println("Directorio creado");
        } else{
            System.out.println("Directorio NO creado");
        }

        // Ejercicio 9: Convertir objeto a Path
        Path newPath = file.toPath();
        System.out.println("Ruta del archivo: " + newPath);


    }


}
