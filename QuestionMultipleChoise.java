class QuestionMultipleChoise extends Question{
	public ArrayList<boolean> verificaResposta(ArrayList<int> altenativaUser){
		ArrayList<boolean> result = new ArrayList<boolean>();

		for(int alternativa : altenativaUser){
			result.add(this.altenativas.get(altenativa).isCerta());
		}

		return result
	}
}