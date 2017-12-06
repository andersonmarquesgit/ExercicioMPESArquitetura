package chainOfResponsability;

public class Main {
	
	public static void main(String[] args) {
		EscolaChainCommand chain1 = new Diretor();
		EscolaChainCommand chain2 = new Coordenador();
		EscolaChainCommand chain3 = new Professor();
		EscolaChainCommand chain4 = new Monitor();
		
		chain1.setNextChainOfCommand(chain2);
		chain2.setNextChainOfCommand(chain3);
		chain3.setNextChainOfCommand(chain4);
		
		chain1.lidarComOcorrencia(Ocorrencia.GRAVE);
		chain1.lidarComOcorrencia(Ocorrencia.BAIXA);
		chain1.lidarComOcorrencia(Ocorrencia.MEDIA);
		
	}
}
