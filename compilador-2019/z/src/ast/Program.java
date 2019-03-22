/**
 * @generated VGen (for ANTLR) 1.5.0
 */

package ast;

import java.util.*;
import visitor.*;

import org.antlr.v4.runtime.*;

//	program -> definitions:varDefinition*  sentences:sentence*

public class Program extends AbstractAST  {

	public Program(List<VarDefinition> definitions, List<Sentence> sentences) {
		this.definitions = definitions;
		this.sentences = sentences;

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(definitions, sentences);
	}

	@SuppressWarnings("unchecked")
	public Program(Object definitions, Object sentences) {
		this.definitions = this.<VarDefinition>getAstFromContexts(definitions);
		this.sentences = this.<Sentence>getAstFromContexts(sentences);

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(definitions, sentences);
	}

	public List<VarDefinition> getDefinitions() {
		return definitions;
	}
	public void setDefinitions(List<VarDefinition> definitions) {
		this.definitions = definitions;
	}

	public List<Sentence> getSentences() {
		return sentences;
	}
	public void setSentences(List<Sentence> sentences) {
		this.sentences = sentences;
	}

	@Override
	public Object accept(Visitor v, Object param) { 
		return v.visit(this, param);
	}

	private List<VarDefinition> definitions;
	private List<Sentence> sentences;

	public String toString() {
       return "{definitions:" + getDefinitions() + ", sentences:" + getSentences() + "}";
   }
}
