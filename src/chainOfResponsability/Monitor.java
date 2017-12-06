package chainOfResponsability;

public class Monitor implements EscolaChainCommand {

	private EscolaChainCommand chain;
	
	@Override
	public void setNextChainOfCommand(EscolaChainCommand chain) {
		this.chain = chain;
	}

	@Override
	public void lidarComOcorrencia(Ocorrencia ocorrencia) {
		if(ocorrencia.getValor() <= Ocorrencia.BAIXA.getValor()) {
			System.out.println("Ocorrencia tratada pelo Monitor");
		}else {
			this.chain.lidarComOcorrencia(ocorrencia);
		}
	}
}
