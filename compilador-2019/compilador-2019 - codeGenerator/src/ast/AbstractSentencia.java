/**
 * @generated VGen (for ANTLR) 1.4.0
 */

package ast;

public abstract class AbstractSentencia extends AbstractAST implements Sentencia {

	public DefFuncion funcionEnLaQueEstoy;
	
	public DefFuncion getFuncionEnLaQueEstoy() {
		return this.funcionEnLaQueEstoy;
	}

	public void setFuncionEnLaQueEstoy(DefFuncion funcionEnLaQueEstoy) {
		this.funcionEnLaQueEstoy = funcionEnLaQueEstoy;
	}
	
	@Override
	public boolean isFinFuncion() {
		return false;
	}

}
