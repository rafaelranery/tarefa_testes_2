package service;

import dao.IContratoDAO;
import entities.Contrato;

import java.util.List;

public class ContratoService implements IContratoService {
    private IContratoDAO contratoDAO;

    public ContratoService(IContratoDAO contratoDAO) {
        this.contratoDAO = contratoDAO;
    }

    public IContratoDAO getContratoDAO() {
        return contratoDAO;
    }

    public void setContratoDAO(IContratoDAO contratoDAO) {
        this.contratoDAO = contratoDAO;
    }

    @Override
    public String salvar() {
        return this.contratoDAO.salvar();
    }

    @Override
    public Contrato buscar(Long id) {
        return this.contratoDAO.buscar(id);
    }

    @Override
    public List<Contrato> todosContratos() {
        return this.contratoDAO.getTodosContratos();
    }

    @Override
    public Contrato atualizarContrato(long id, String nomeCliente, int anoDeValidade) {
        return this.contratoDAO.atualizarContrato(id, nomeCliente, anoDeValidade);
    }

    @Override
    public void excluir(Long id) {
        this.contratoDAO.excluir(id);
    }
}
