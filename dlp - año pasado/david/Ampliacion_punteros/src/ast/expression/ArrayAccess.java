package ast.expression;

import visitor.Visitor;

public class ArrayAccess extends AbstractExp {

	private Expression name;
	private Expression index;

	public ArrayAccess(int line, int column, Expression name, Expression index) {
		super(line, column);
		this.name = name;
		this.index = index;
	}

	public Expression getName() {
		return name;
	}

	public void setName(Expression name) {
		this.name = name;
	}

	public Expression getIndex() {
		return index;
	}

	public void setIndex(Expression index) {
		this.index = index;
	}

	@Override
	public Object accept(Visitor visitor, Object param) {
		return visitor.visit(this, param);
	}

	@Override
	public String toString() {
		return name.toString() + "[" + index.toString() + "]";
	}

}
