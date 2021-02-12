class Resposta{
	private String texto;
	private boolean certa = false;

	public Resposta(String texto){
		this.texto = texto;
	}

	public void setCerta(boolean certa){
		this.certa = certa;
	}

	public boolean isCerta(){
		return this.certa;
	}
	
	public String getTexto(){
		return this.texto;
	}
}
