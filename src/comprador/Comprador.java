package comprador;
import java.time.LocalDateTime;
public class Comprador {

    private String nomeCompleto;
    private String rg;
    private LocalDateTime dataNascimento;
    
	public Comprador(String nomeCompleto, String rg,LocalDateTime dataNascimento) {
		setNomeCompleto(nomeCompleto);
		setRg(rg);
        setDataNascimento(dataNascimento);
    }
    
	public void setNomeCompleto(String nomeCompleto) {
	    this.nomeCompleto = nomeCompleto;
    }

    public void setRg(String rg) {
	    this.rg = rg;
    }

    public void setDataNascimento(LocalDateTime dataNascimento) {
	    this.dataNascimento = dataNascimento;
    }

    public String getNomeCompleto() {
		return nomeCompleto;
    }

    public String getRg() {
		return rg;
    }

    public LocalDateTime getDataNascimento() {
		return dataNascimento;
    }

    public String imprimirComprador() {
		return "nomeCompleto: " + getNomeCompleto() + "\n Rg: " + getRg() + "\n Data de Nascimento: " + toString(getDataNascimento());
    }
    
    public String toString(LocalDateTime data) {
		return data.getDayOfMonth() + "/" + data.getMonthValue() + "/" + data.getYear() 
		+ " - " + data.getHour() + ":" + data.getMinute() + " hs";
	}
}