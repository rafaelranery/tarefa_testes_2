package dao;

import entities.Contrato;

import java.util.List;
import java.util.stream.Collectors;

public class ContratoDAO implements IContratoDAO {
    private List<Contrato> todosContratos;

    @Override
    public List<Contrato> getTodosContratos() {
        return todosContratos;
    }
    @Override
    public void setTodosContratos(List<Contrato> todosContratos) {
        this.todosContratos = todosContratos;
    }

    @Override
    public String salvar() {
        throw new UnsupportedOperationException("Erro ao contactar banco de dados");
    }

    @Override
    public Contrato buscar(Long id) {
        throw new NullPointerException("Não foi possível encontrar um contrato com o ID fornecido");
    }

    @Override
    public void excluir(Long id) {
        this.todosContratos = this.todosContratos.stream()
                .filter(contrato -> contrato.getId() != id)
                .collect(Collectors.toList());
    }

    @Override
    public Contrato atualizarContrato(Long id, String nomeCliente, Integer anoDeNascimento) {
        throw new NullPointerException("Não foi possível encontrar um contrato com o ID fornecido");
    }
}
