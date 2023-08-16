package entities;

public class Contrato {

    private String nomeCliente;
    private Integer anoDeValidade;
    private Long id;

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public Integer getAnoDeValidade() {
        return anoDeValidade;
    }

    public void setAnoDeValidade(Integer anoDeValidade) {
        this.anoDeValidade = anoDeValidade;
    }

    public Contrato(String nomeCliente, Integer anoDeValidade, Long id) {
        this.nomeCliente = nomeCliente;
        this.anoDeValidade = anoDeValidade;
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
