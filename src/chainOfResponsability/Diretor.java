package chainOfResponsability;

public class Diretor implements EscolaChainCommand {
	
	private EscolaChainCommand chain;
	
	@Override
	public void setNextChainOfCommand(EscolaChainCommand chain) {
		this.chain = chain;
	}

	@Override
	public void lidarComOcorrencia(Ocorrencia ocorrencia) {
		if(ocorrencia.getValor() <= Ocorrencia.GRAVE.getValor()) {
			System.out.println("Ocorrencia tratada pelo Diretor");
		}else {
			this.chain.lidarComOcorrencia(ocorrencia);
		}
	}
}
