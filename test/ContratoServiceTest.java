import dao.ContratoDAO;
import dao.ContratoDAOMock;
import entities.Contrato;
import org.junit.Assert;
import org.junit.Test;
import service.ContratoService;
import service.IContratoService;

import java.util.List;
import java.util.Optional;

public class ContratoServiceTest {

    @Test
    public void salvarTeste() {
        IContratoService service = new ContratoService(new ContratoDAOMock());
        String res = service.salvar();
        Assert.assertEquals("Sucesso", res);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void salvarTesteExpectedUnsupportedOperationException() {
        IContratoService service = new ContratoService(new ContratoDAO());
        String res = service.salvar();
    }

    @Test
    public void buscarTeste() {
        IContratoService service = new ContratoService(new ContratoDAOMock());
        Contrato contrato = service.buscar(1L);
        Contrato contratoT = new Contrato("Rafael", 2023, 1L);
        Assert.assertEquals(contratoT.getNomeCliente(), contrato.getNomeCliente());
        Assert.assertEquals(contratoT.getAnoDeValidade(), contrato.getAnoDeValidade());
        Assert.assertEquals(contratoT.getId(), contrato.getId());
    }

    @Test(expected = NullPointerException.class)
    public void buscarTesteExpectedNullPointerException() {
        IContratoService service = new ContratoService(new ContratoDAO());
        Contrato contrato = service.buscar(1L);
    }

    @Test
    public void excluirTeste() {
        IContratoService service = new ContratoService(new ContratoDAOMock());
        service.excluir(1L);
        List<Contrato> contratoList = service.todosContratos();
        contratoList.forEach(contrato -> Assert.assertTrue(contrato.getId() != 1));
    }

    @Test (expected = NullPointerException.class)
    public void excluirTesteExpectedNullPointer() {
        IContratoService service = new ContratoService(new ContratoDAO());
        service.excluir(1L);
    }

    @Test
    public void atualizarTeste() {
        IContratoService service = new ContratoService(new ContratoDAOMock());
        Contrato contratoAtualizado =  service.atualizarContrato(1L, "Joaquim", 2024);
        Assert.assertEquals((Long) 1L, contratoAtualizado.getId());
        Assert.assertEquals("Joaquim", contratoAtualizado.getNomeCliente());
        Assert.assertEquals((Integer) 2024, contratoAtualizado.getAnoDeValidade());
    }

    @Test(expected = NullPointerException.class)
    public void atualizarTesteExpectedNullPointerException() {
        IContratoService service = new ContratoService(new ContratoDAO());
        service.atualizarContrato(1L, "Joaquim", 2024);
    }
}
