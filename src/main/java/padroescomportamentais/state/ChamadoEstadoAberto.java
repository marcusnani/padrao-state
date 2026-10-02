package padroescomportamentais.state;

public class ChamadoEstadoAberto extends ChamadoEstado {

    private ChamadoEstadoAberto() {};
    private static ChamadoEstadoAberto instance = new ChamadoEstadoAberto();
    public static ChamadoEstadoAberto getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Aberto";
    }

    public boolean resolver(Chamado chamado) {
        chamado.setEstado(ChamadoEstadoResolvido.getInstance());
        return true;
    }

    public boolean atender(Chamado chamado) {
        chamado.setEstado(ChamadoEstadoEmAtendimento.getInstance());
        return true;
    }

    public boolean cancelar(Chamado chamado) {
        chamado.setEstado(ChamadoEstadoCancelado.getInstance());
        return true;
    }

    public boolean pendenciar(Chamado chamado) {
        chamado.setEstado(ChamadoEstadoPendente.getInstance());
        return true;
    }

    public boolean escalar(Chamado chamado) {
        chamado.setEstado(ChamadoEstadoEscalado.getInstance());
        return true;
    }

}