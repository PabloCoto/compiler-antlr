package ast.expression;

import java.util.List;

import ast.definition.Definition;
import visitor.Visitor;

public class InvocationExp extends AbstractExp {

	private String name;
	private List<Expression> parameters;
	private Definition definition;

	public InvocationExp(int line, int column, String name, List<Expression> parameters) {
		super(line, column);
		this.name = name;
		this.parameters = parameters;
	}

	public Definition getDefinition() {
		return definition;
	}

	public void setDefinition(Definition definition) {
		this.definition = definition;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Expression> getParameters() {
		return parameters;
	}

	public void setParameters(List<Expression> parameters) {
		this.parameters = parameters;
	}

	@Override
	public Object accept(Visitor visitor, Object param) {
		return visitor.visit(this, param);
	}

	@Override
	public String toString() {
		String output = name + "(";
		for (Expression each : parameters) {
			output += each.toString() + ",";
		}
		output = output.substring(0, output.length() - 1);
		output += ")";
		return output;
	}

}
