import java.util.ArrayList;

class QuestionMultipleChoise extends Question{
	public ArrayList<Boolean> verificaResposta(ArrayList<Integer> altenativaUser){
		ArrayList<Boolean> result = new ArrayList<Boolean>();

		for(int alternativa : altenativaUser){
			result.add(this.alternativas.get(alternativa).isCerta());
		}

		return result;
	}
}