import java.util.ArrayList;

public class Quiz {
	private ArrayList<Question> listaQuestoes = new ArrayList<Question>();

	public void addQuestion(Question questao){
		this.listaQuestoes.add(questao);
	}
	public ArrayList<Question> getListaQuestoes(){
		return this.listaQuestoes;
	}
}