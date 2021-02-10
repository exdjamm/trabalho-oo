import java.util.ArrayList;

public class Question {
	private String pergunta;
	protected ArrayList<Resposta> alternativas = new ArrayList<Resposta>();

	public void addAlternativa(String textoResposta, boolean essaCorreta){
		Resposta altenativa = new Resposta(textoResposta);
		altenativa.setCerta(essaCorreta);

		if (this.alternativas.size() < 5){
			alternativas.add(altenativa);
		}
	}

	public String getPergunta(){
		return this.pergunta;
	}
	
	public void setPergunta(String pergunta){
		this.pergunta = pergunta;
	}

	// Mudar
	public ArrayList<Resposta> getAlternativas(){
		return this.alternativas;
	}
	public boolean verificaResposta(int altenativaUser){
		return this.alternativas.get(altenativaUser).isCerta();
	}
}