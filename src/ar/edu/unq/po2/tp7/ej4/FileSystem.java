package ar.edu.unq.po2.tp7.ej4;

import java.time.LocalDate;

public interface FileSystem {
	public int totalSize();
	public void printStructure();
	public FileSystem lastModified();
	public FileSystem oldestElement();
	public LocalDate getUltimaModificacion();
}
