package com.kreitek.utils;

import com.kreitek.files.Directory;
import com.kreitek.interfaces.FileSystemItem;
import com.kreitek.service.FileManager;

public class FileSystemPrinter {

    private final FileManager fileManager;

    public FileSystemPrinter() {
        this.fileManager = new FileManager();
    }

    public static void print(FileSystemItem item, int nivel) {
        String indentation = "\t".repeat(nivel);
        String message = String.format("%s%s = %d bytes", indentation, item.getFullPath(), FileManager.calculateSize(item));
        System.out.println(message);

        /*
        TODO: PRINCIPIO DEPENDENCY INVERSION.
        TODO: Utilizaría Factorías o Builder para crear el objeto Directory.
        Para este caso he cambiado los tipos de instancias específicos.
         */
        if (item instanceof Directory) {
            Directory dir = (Directory) item;
            for (FileSystemItem subitem: dir.listFiles()) {
                FileSystemPrinter.print(subitem, nivel + 1);
            }
        }

    }

}
