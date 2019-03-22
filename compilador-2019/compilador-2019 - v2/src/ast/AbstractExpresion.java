package ast;


public abstract class AbstractExpresion extends AbstractAST implements Expresion{

	private Tipo tipo;
	private boolean modificable;

	@Override
	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	@Override
	public Tipo getTipo() {
		return tipo;
	}

	@Override
	public void setModificable(boolean modificable) {
		this.modificable = modificable;
	}

	@Override
	public boolean isModificable() {
		return modificable;
	}

}
