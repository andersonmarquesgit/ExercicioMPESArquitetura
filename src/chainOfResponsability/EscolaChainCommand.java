package chainOfResponsability;

public interface EscolaChainCommand {

	public void setNextChainOfCommand(EscolaChainCommand chain);
	public void lidarComOcorrencia(Ocorrencia ocorrencia);
}
