public class Programa {
	public static void main(String[] args) {
		User usuario = new User();
		usuario.setNome("Juliano");
		usuario.setScore(5520);

		System.out.println("O nome do usuário é: " +usuario.getNome());
		System.out.println("A pontuação do usuário é: " +usuario.getScore());

		Question questao = new Question();

		questao.setPergunta("É o satélite natural do planeta terra, "
		+ "tem aproximadamente 384.415 km de distância da Terra ");
		questao.addAlternativa("Europa", false);
		questao.addAlternativa("Júpiter", false);
		questao.addAlternativa("Lua", true);
		questao.addAlternativa("Marte", false);
		questao.addAlternativa("Sol", false);

		System.out.println("\n1) " +questao.getPergunta());

		for(String questoes: questao.getAlternativas()) {
			System.out.println(questoes);
		}

		User usuario2 = new User();
		usuario2.setNome("Vinicius Jr");
		usuario2.setScore(4300);

		System.out.println("\nO nome do usuário 2 é: " +usuario2.getNome());
		System.out.println("A pontuação do usuário 2 é: " +usuario2.getScore());

		Question questao2 = new Question();
		questao2.setPergunta("Quantas luas tem Júpiter? ");
		questao2.addAlternativa("13", false);
		questao2.addAlternativa("17", false);
		questao2.addAlternativa("45", false);
		questao2.addAlternativa("57", false);
		questao2.addAlternativa("79", true);

		System.out.println("\n2) " +questao2.getPergunta());

		for(String questoes: questao2.getAlternativas()) {
			System.out.println(questoes);
		}

		Quiz q = new Quiz();
		q.addQuestion(questao);
		q.addQuestion(questao2);
		
		System.out.println(q.getListaQuestoes());
		System.out.println(questao.verificaResposta(3));
	}
}