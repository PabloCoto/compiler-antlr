package ast.statement;

import java.util.List;

import ast.expression.Expression;
import visitor.Visitor;

public class DoWhile extends AbstractStatement {

	private Expression condition;
	private List<Statement> statements;

	public DoWhile(int line, int column, Expression condition, List<Statement> statements) {
		super(line, column);
		this.condition = condition;
		this.statements = statements;
	}

	public Expression getCondition() {
		return condition;
	}

	public void setCondition(Expression condition) {
		this.condition = condition;
	}

	public List<Statement> getStatements() {
		return statements;
	}

	public void setStatements(List<Statement> statements) {
		this.statements = statements;
	}

	@Override
	public Object accept(Visitor visitor, Object param) {
		return visitor.visit(this, param);
	}

	@Override
	public String toString() {
		return "While [condition=" + condition + ", statements=" + statements + "]";
	}

}
