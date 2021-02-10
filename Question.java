import java.util.ArrayList;

public class Question {
	private String pergunta;
	private ArrayList<Resposta> altenativas = new ArrayList<Resposta>();

	public void addAlternativa(String textoResposta, boolean essaCorreta){
		Resposta altenativa = new Resposta(textoResposta);
		altenativa.setCerta(essaCorreta);

		if (this.altenativas.size() < 5){
			altenativas.add(altenativa)
		}
	}

	public String getPergunta(){
		return this.pergunta;
	}
	
	public void setPergunta(String pergunta){
		this.pergunta = pergunta;
	}

	// Mudar
	public ArrayList<String> getAlternativas(){
		return this.altenativas;
	}
	public boolean verificaResposta(int altenativaUser){
		return this.altenativas.get(altenativaUser).isCerta();
	}
}