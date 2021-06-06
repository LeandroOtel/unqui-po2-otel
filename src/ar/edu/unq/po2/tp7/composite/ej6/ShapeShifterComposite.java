package ar.edu.unq.po2.tp7.ej6;

import java.util.ArrayList;
import java.util.List;

public class ShapeShifterComposite implements IShapeShifter{

	private List<IShapeShifter> elements;
	
	
	
	
	public ShapeShifterComposite() {
		this.elements = new ArrayList<IShapeShifter>();
	}

	
	
	public void addShapeShifter(IShapeShifter i) {
		this.elements.add(i);
	}

	public List<IShapeShifter> getElements() {
		return elements;
	}

	public void setElements(List<IShapeShifter> e) {
		this.elements = e;
	}
	
	
	@Override
	public IShapeShifter compose(IShapeShifter i) {
		
		ShapeShifterComposite nuevo = new ShapeShifterComposite();
		nuevo.addShapeShifter(i);
		nuevo.addShapeShifter(this);
		
		return nuevo;
	}
	
	@Override
	public int deepest() {
		
		int total = 1;
		
		for (IShapeShifter i : elements) {
			total += i.deepest();
		}
		return total;
	}
	
	@Override
	public IShapeShifter flat() {
		
		ShapeShifterComposite newShape = new ShapeShifterComposite();
		
		for (Integer i : this.values()) {
			newShape.addShapeShifter(new ShapeShifterLeaf(i));
		}
		
		return newShape;
	}
	
	@Override
	public List<Integer> values() {
		
		ArrayList<Integer> values = new ArrayList<Integer>();
		
		for (IShapeShifter s : elements) {
			values.addAll(s.values());
		}
		
		return values;
	}
	

}
