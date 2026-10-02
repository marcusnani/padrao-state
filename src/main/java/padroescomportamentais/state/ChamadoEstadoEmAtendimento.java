package padroescomportamentais.state;

public class ChamadoEstadoEmAtendimento extends ChamadoEstado {

    private ChamadoEstadoEmAtendimento() {};
    private static ChamadoEstadoEmAtendimento instance = new ChamadoEstadoEmAtendimento();
    public static ChamadoEstadoEmAtendimento getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Em Atendimento";
    }

    public boolean abrir(Chamado chamado) {
        chamado.setEstado(ChamadoEstadoAberto.getInstance());
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

}