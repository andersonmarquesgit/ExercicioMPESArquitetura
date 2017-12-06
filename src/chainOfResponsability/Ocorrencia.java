package chainOfResponsability;

public enum Ocorrencia {

	GRAVE(1), ALTA(2), MEDIA(3), BAIXA(4);
    
    private final int valor;
    Ocorrencia(int valorOpcao){
        valor = valorOpcao;
    }
    public int getValor(){
        return valor;
    }
}
