package chainOfResponsability;

public class Coordenador implements EscolaChainCommand {

	private EscolaChainCommand chain;
	
	@Override
	public void setNextChainOfCommand(EscolaChainCommand chain) {
		this.chain = chain;
	}

	@Override
	public void lidarComOcorrencia(Ocorrencia ocorrencia) {
		if(ocorrencia.getValor() <= Ocorrencia.ALTA.getValor()) {
			System.out.println("Ocorrencia tratada pelo Coordenador");
		}else {
			this.chain.lidarComOcorrencia(ocorrencia);
		}
	}


}
