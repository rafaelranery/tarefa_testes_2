package service;

import entities.Contrato;

import java.util.List;

public interface IContratoService {
    public String salvar();

    public Contrato buscar(Long id);

    void excluir(Long id);

    List<Contrato> todosContratos();

    Contrato atualizarContrato(long id, String nomeCliente, int anoDeValidade);

    //TODO
    // fazer métodos de
    // atualizar.
}
