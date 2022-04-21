package com.kreitek.interfaces;


public interface FileSystemItem{ // Comprobar sentido de la herencia.
    String getName();
    void setName(String name);
    FileSystemItem getParent();
    void setParent(FileSystemItem directory);
    String getFullPath();
    int getSize();
    void close();


}
