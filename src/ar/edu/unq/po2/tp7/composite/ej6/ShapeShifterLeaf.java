package ar.edu.unq.po2.tp7.composite.ej6;

import java.util.ArrayList;
import java.util.List;

public class ShapeShifterLeaf implements IShapeShifter{
	
	private Integer valor;
	
	public ShapeShifterLeaf(int v) {
		super();
		this.valor = v;
	}
	


	public Integer getValor() {
		return valor;
	}

	public void setValor(int v) {
		this.valor = v;
	}
	
	
	@Override
	public int deepest() {
		return 0;
	}

	@Override
	public IShapeShifter flat() {
		return this;
	}

	@Override
	public List<Integer> values() {
		ArrayList<Integer> valores = new ArrayList<Integer>();
		valores.add(this.getValor());
		
		return valores;
	}
	
	@Override
	public IShapeShifter compose(IShapeShifter iShapeShifter) {
		ShapeShifterComposite nuevoSC = new ShapeShifterComposite();
		nuevoSC.addShapeShifter(this);
		nuevoSC.addShapeShifter(iShapeShifter);
		
		

		return nuevoSC;
	}
	
}
