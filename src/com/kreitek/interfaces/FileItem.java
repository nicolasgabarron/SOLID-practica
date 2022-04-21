package com.kreitek.interfaces;

public interface FileItem extends FileSystemItem{
    String getExtension();
    void open();
    void setPosition(int numberOfBytesFromBeginning);
    byte[] read(int numberOfBytesToRead);
    void write(byte[] buffer);
}
