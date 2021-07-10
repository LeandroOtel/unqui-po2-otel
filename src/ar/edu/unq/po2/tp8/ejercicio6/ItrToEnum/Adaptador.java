package ar.edu.unq.po2.tp8.ejercicio6.ItrToEnum;

import java.util.Enumeration;
import java.util.Iterator;

public class Adaptador<E> implements Enumeration<E>{
		
	private Iterator<E> adaptee;
	
	public Adaptador(Iterator<E>ad) {
		super();
		this.adaptee = ad;
	}
	
	@Override
	public boolean hasMoreElements() {
		return this.adaptee.hasNext();
	}

	@Override
	public E nextElement() {
		return this.adaptee.next();
	}
	
}	
