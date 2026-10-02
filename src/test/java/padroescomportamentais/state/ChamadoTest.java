package padroescomportamentais.state;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ChamadoTest {

    Chamado chamado;

    @BeforeEach
    public void setUp() {
        chamado = new Chamado();
    }

    // Chamado aberto

    @Test
    public void naoDeveAbrirChamadoAberto() {
        chamado.setEstado(ChamadoEstadoAberto.getInstance());
        assertFalse(chamado.abrir());
    }

    @Test
    public void deveResolverChamadoAberto() {
        chamado.setEstado(ChamadoEstadoAberto.getInstance());
        assertTrue(chamado.resolver());
        assertEquals(ChamadoEstadoResolvido.getInstance(), chamado.getEstado());
    }

    @Test
    public void deveAtenderChamadoAberto() {
        chamado.setEstado(ChamadoEstadoAberto.getInstance());
        assertTrue(chamado.atender());
        assertEquals(ChamadoEstadoEmAtendimento.getInstance(), chamado.getEstado());
    }

    @Test
    public void deveCancelarChamadoAberto() {
        chamado.setEstado(ChamadoEstadoAberto.getInstance());
        assertTrue(chamado.cancelar());
        assertEquals(ChamadoEstadoCancelado.getInstance(), chamado.getEstado());
    }

    @Test
    public void devePendenciarChamadoAberto() {
        chamado.setEstado(ChamadoEstadoAberto.getInstance());
        assertTrue(chamado.pendenciar());
        assertEquals(ChamadoEstadoPendente.getInstance(), chamado.getEstado());
    }

    @Test
    public void deveEscalarChamadoAberto() {
        chamado.setEstado(ChamadoEstadoAberto.getInstance());
        assertTrue(chamado.escalar());
        assertEquals(ChamadoEstadoEscalado.getInstance(), chamado.getEstado());
    }

    // Chamado em atendimento

    @Test
    public void deveAbrirChamadoEmAtendimento() {
        chamado.setEstado(ChamadoEstadoEmAtendimento.getInstance());
        assertTrue(chamado.abrir());
        assertEquals(ChamadoEstadoAberto.getInstance(), chamado.getEstado());
    }

    @Test
    public void naoDeveResolverChamadoEmAtendimento() {
        chamado.setEstado(ChamadoEstadoEmAtendimento.getInstance());
        assertFalse(chamado.resolver());
    }

    @Test
    public void naoDeveAtenderChamadoEmAtendimento() {
        chamado.setEstado(ChamadoEstadoEmAtendimento.getInstance());
        assertFalse(chamado.atender());
    }

    @Test
    public void deveCancelarChamadoEmAtendimento() {
        chamado.setEstado(ChamadoEstadoEmAtendimento.getInstance());
        assertTrue(chamado.cancelar());
        assertEquals(ChamadoEstadoCancelado.getInstance(), chamado.getEstado());
    }

    @Test
    public void devePendenciarChamadoEmAtendimento() {
        chamado.setEstado(ChamadoEstadoEmAtendimento.getInstance());
        assertTrue(chamado.pendenciar());
        assertEquals(ChamadoEstadoPendente.getInstance(), chamado.getEstado());
    }

    @Test
    public void naoDeveEscalarChamadoEmAtendimento() {
        chamado.setEstado(ChamadoEstadoEmAtendimento.getInstance());
        assertFalse(chamado.escalar());
    }

    // Chamado resolvido

    @Test
    public void naoDeveAbrirChamadoResolvido() {
        chamado.setEstado(ChamadoEstadoResolvido.getInstance());
        assertFalse(chamado.abrir());
    }

    @Test
    public void naoDeveResolverChamadoResolvido() {
        chamado.setEstado(ChamadoEstadoResolvido.getInstance());
        assertFalse(chamado.resolver());
    }

    @Test
    public void naoDeveAtenderChamadoResolvido() {
        chamado.setEstado(ChamadoEstadoResolvido.getInstance());
        assertFalse(chamado.atender());
    }

    @Test
    public void naoDeveCancelarChamadoResolvido() {
        chamado.setEstado(ChamadoEstadoResolvido.getInstance());
        assertFalse(chamado.cancelar());
    }

    @Test
    public void naoDevePendenciarChamadoResolvido() {
        chamado.setEstado(ChamadoEstadoResolvido.getInstance());
        assertFalse(chamado.pendenciar());
    }

    @Test
    public void naoDeveEscalarChamadoResolvido() {
        chamado.setEstado(ChamadoEstadoResolvido.getInstance());
        assertFalse(chamado.escalar());
    }

    // Chamado cancelado

    @Test
    public void naoDeveAbrirChamadoCancelado() {
        chamado.setEstado(ChamadoEstadoCancelado.getInstance());
        assertFalse(chamado.abrir());
    }

    @Test
    public void naoDeveResolverChamadoCancelado() {
        chamado.setEstado(ChamadoEstadoCancelado.getInstance());
        assertFalse(chamado.resolver());
    }

    @Test
    public void naoDeveAtenderChamadoCancelado() {
        chamado.setEstado(ChamadoEstadoCancelado.getInstance());
        assertFalse(chamado.atender());
    }

    @Test
    public void naoDeveCancelarChamadoCancelado() {
        chamado.setEstado(ChamadoEstadoCancelado.getInstance());
        assertFalse(chamado.cancelar());
    }

    @Test
    public void naoDevePendenciarChamadoCancelado() {
        chamado.setEstado(ChamadoEstadoCancelado.getInstance());
        assertFalse(chamado.pendenciar());
    }

    @Test
    public void naoDeveEscalarChamadoCancelado() {
        chamado.setEstado(ChamadoEstadoCancelado.getInstance());
        assertFalse(chamado.escalar());
    }

    // Chamado pendente

    @Test
    public void naoDeveAbrirChamadoPendente() {
        chamado.setEstado(ChamadoEstadoPendente.getInstance());
        assertFalse(chamado.abrir());
    }

    @Test
    public void naoDeveResolverChamadoPendente() {
        chamado.setEstado(ChamadoEstadoPendente.getInstance());
        assertFalse(chamado.resolver());
    }

    @Test
    public void naoDeveAtenderChamadoPendente() {
        chamado.setEstado(ChamadoEstadoPendente.getInstance());
        assertFalse(chamado.atender());
    }

    @Test
    public void deveCancelarChamadoPendente() {
        chamado.setEstado(ChamadoEstadoPendente.getInstance());
        assertTrue(chamado.cancelar());
        assertEquals(ChamadoEstadoCancelado.getInstance(), chamado.getEstado());
    }

    @Test
    public void naoDevePendenciarChamadoPendente() {
        chamado.setEstado(ChamadoEstadoPendente.getInstance());
        assertFalse(chamado.pendenciar());
    }

    @Test
    public void naoDeveEscalarChamadoPendente() {
        chamado.setEstado(ChamadoEstadoPendente.getInstance());
        assertFalse(chamado.escalar());
    }

    // Chamado escalado

    @Test
    public void naoDeveAbrirChamadoEscalado() {
        chamado.setEstado(ChamadoEstadoEscalado.getInstance());
        assertFalse(chamado.abrir());
    }

    @Test
    public void naoDeveResolverChamadoEscalado() {
        chamado.setEstado(ChamadoEstadoEscalado.getInstance());
        assertFalse(chamado.resolver());
    }

    @Test
    public void naoDeveAtenderChamadoEscalado() {
        chamado.setEstado(ChamadoEstadoEscalado.getInstance());
        assertFalse(chamado.atender());
    }

    @Test
    public void naoDeveCancelarChamadoEscalado() {
        chamado.setEstado(ChamadoEstadoEscalado.getInstance());
        assertFalse(chamado.cancelar());
    }

    @Test
    public void naoDevePendenciarChamadoEscalado() {
        chamado.setEstado(ChamadoEstadoEscalado.getInstance());
        assertFalse(chamado.pendenciar());
    }

    @Test
    public void naoDeveEscalarChamadoEscalado() {
        chamado.setEstado(ChamadoEstadoEscalado.getInstance());
        assertFalse(chamado.escalar());
    }

}