package com.kreitek.utils;

import com.kreitek.exceptions.InvalidFileFormatException;
import com.kreitek.files.File;
import com.kreitek.interfaces.FileSystemItem;

public class FileConverter {
    /*
    TODO: PRINCIPIO DEPENDENCY INVERSION.
    TODO: Utilizaría Factorías o Builder para crear los objetos File.
    Para este caso he cambiado los tipos de instancias específicos.
     */
    public static FileSystemItem convertMp3ToWav(FileSystemItem parent, File fileToConvert) {
        if (!"mp3".equalsIgnoreCase(fileToConvert.getExtension())) {
            throw new InvalidFileFormatException("El fichero debe ser mp3");
        }

        int indexOfLastDot = fileToConvert.getName().lastIndexOf(".");
        String nameWithoutExtension = fileToConvert.getName();
        if (indexOfLastDot > 0) {
            nameWithoutExtension = fileToConvert.getName().substring(0, indexOfLastDot);
        }
        String newFileName = nameWithoutExtension + ".wav";
        File result = new File(parent, newFileName);
        result.open();
        // Lógica de conversión de mp3 a wav. Se lee de este fichero y se escribe en result
        result.close();
        return result;
    }

    public static FileSystemItem convertWavToMp3(FileSystemItem parent, File fileToConvert) {
        if (!"wav".equalsIgnoreCase(fileToConvert.getExtension())) {
            throw new InvalidFileFormatException("El fichero debe ser wav");
        }

        int indexOfLastDot = fileToConvert.getName().lastIndexOf(".");
        String nameWithoutExtension = fileToConvert.getName();
        if (indexOfLastDot > 0) {
            nameWithoutExtension = fileToConvert.getName().substring(0, indexOfLastDot);
        }
        String newFileName = nameWithoutExtension + ".mp3";
        File result = new File(parent, newFileName);
        result.open();
        // Lógica de conversión de wav a mp3. Se lee de este fichero y se escribe en result
        result.close();
        return result;
    }
}
