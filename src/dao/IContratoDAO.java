package dao;

import entities.Contrato;

import java.util.List;

public interface IContratoDAO {

    List<Contrato> getTodosContratos();

    void setTodosContratos(List<Contrato> todosContratos);

    public String salvar();

    public Contrato buscar(Long id);

    void excluir(Long id);

    Contrato atualizarContrato(Long id, String nomeCliente, Integer anoDeValidade);

    //TODO
    // fazer métodos de
    // atualizar.
}
