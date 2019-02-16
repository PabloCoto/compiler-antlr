package ast.type;

import java.util.List;

import ast.definition.Definition;
import visitor.Visitor;

public class FuncType extends AbstractType {

	private Type retType;
	private List<Definition> parameters;

	public FuncType(int line, int column, Type retType, List<Definition> parameters) {
		super(line, column);
		this.retType = retType;
		this.parameters = parameters;
	}

	public Type getRetType() {
		return retType;
	}

	public List<Definition> getParameters() {
		return parameters;
	}

	@Override
	public Type parentesis(List<Type> types) {
		if (parameters.size() != types.size()) {
			return null;
		}
		for (int i = 0; i < types.size(); i++) {
			if (null == types.get(i).promotesTo(this.parameters.get(i).getType())) {
				return null;
			}
		}

		return this.retType;
	}

	@Override
	public Object accept(Visitor visitor, Object param) {
		return visitor.visit(this, param);
	}

}
