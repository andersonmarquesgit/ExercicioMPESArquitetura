package chainOfResponsability;

public class Professor implements EscolaChainCommand {

	private EscolaChainCommand chain;
	
	@Override
	public void setNextChainOfCommand(EscolaChainCommand chain) {
		this.chain = chain;
	}

	@Override
	public void lidarComOcorrencia(Ocorrencia ocorrencia) {
		if(ocorrencia.getValor() <= Ocorrencia.MEDIA.getValor()) {
			System.out.println("Ocorrencia tratada pelo Professor");
		}else {
			this.chain.lidarComOcorrencia(ocorrencia);
		}
	}
}
