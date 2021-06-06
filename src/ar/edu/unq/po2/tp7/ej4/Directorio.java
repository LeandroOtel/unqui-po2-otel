package ar.edu.unq.po2.tp7.ej4;

import java.time.LocalDate;
import java.util.ArrayList;

public class Directorio implements FileSystem{

	private String nombre; 
	private ArrayList<FileSystem> contenido;
	private LocalDate creacion;
	
	
	public Directorio(String nombre, LocalDate creado, ArrayList<FileSystem> contains) {
		this.nombre =nombre;
		this.creacion = creado;
		this.contenido= contains;
		
	}

	public void agregarElemento(FileSystem f) {
		this.contenido.add(f);
		
	}

	@Override
	public int totalSize() {
		int total= 0;
		for (FileSystem f : this.contenido) {
			total += f.totalSize();
		}
		return total;
	}

	@Override
	public void printStructure() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public FileSystem lastModified() {
		FileSystem last = this;
			for (int i = 0; i<this.contenido.size(); i++)
				{FileSystem actual = this.contenido.get(i);
				if (last.getUltimaModificacion()
					.compareTo(actual.lastModified().getUltimaModificacion())<0) {
				last = actual.lastModified();
				}
			}
			return last;}
	
	/*@Override
	public FileSystem lastModified() {
		FileSystem last = this;
			for (FileSystem f : this.contenido) 
				{
			if (last.getUltimaModificacion()
					.compareTo(f.lastModified().getUltimaModificacion())<0) {
				last = f;
				}
			}
			return last;}
	*/
	
	
	//si da negativo es la izq mas antigua
	//perfecto.

	@Override
	public FileSystem oldestElement() {
		FileSystem oldest = this;
		for (FileSystem f : this.contenido) {
			if (oldest.getUltimaModificacion()
					.compareTo(f.oldestElement().getUltimaModificacion())>0) {
				oldest = f;
			}
		}
		return oldest;
	}


	
	public LocalDate getUltimaModificacion() {
		return creacion;
	}
}
