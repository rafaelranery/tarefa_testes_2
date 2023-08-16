package dao;

import entities.Contrato;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ContratoDAOMock implements IContratoDAO {
    private List<Contrato> todosContratos;

    public ContratoDAOMock() {
        this.todosContratos = List.of(
                new Contrato("Rafael", 2023, 1L),
                new Contrato("Andre", 2024, 2L),
                new Contrato("Andre", 2024, 3L)
        );
    }

    @Override
    public List<Contrato> getTodosContratos() {
        return this.todosContratos;
    }

    @Override
    public void setTodosContratos(List<Contrato> todosContratos) {
        this.todosContratos = todosContratos;
    }

    @Override
    public String salvar() {
        return "Sucesso";
    }

    @Override
    public Contrato buscar(Long id) {
        return new Contrato("Rafael", 2023, 1L);
    }

    @Override
    public void excluir(Long id) {
        this.todosContratos = this.todosContratos.stream()
                .filter(contrato -> contrato.getId() != id)
                .collect(Collectors.toList());
    }

    @Override
    public Contrato atualizarContrato(Long id, String nomeCliente, Integer anoDeValidade) {
        final Contrato[] contratoAtualizado = new Contrato[1];

        this.todosContratos =  this.todosContratos.stream()
                .map(contrato -> {
            if (contrato.getId().equals(id)) {
                contrato.setAnoDeValidade(anoDeValidade);
                contrato.setNomeCliente(nomeCliente);
                contratoAtualizado[0] = contrato;
            }
            return contrato;
        })
                .collect(Collectors.toList());

        return contratoAtualizado[0];
    }
}
