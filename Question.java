import java.util.ArrayList;
public class Question {
	private String pergunta;
	private ArrayList<String> altenativas = new ArrayList<String>();
	private int alternativaCerta = -1;

	public void addAlternativa(String altenativa, boolean essaCorreta){
		if (this.altenativas.size() < 5){
			this.altenativas.add(altenativa);

			if(essaCorreta){
				this.alternativaCerta = this.altenativas.size() -1;
			}
		}
	}
	
	public String getPergunta(){
		return this.pergunta;
	}
	public void setPergunta(String pergunta){
		this.pergunta = pergunta;
	}
	public ArrayList<String> getAlternativas(){
		return this.altenativas;
	}
	public boolean verificaResposta(int altenativaUser){
		if (this.alternativaCerta == altenativaUser) {
			return true;
		}
		else {
			return false;
		}
	}
}