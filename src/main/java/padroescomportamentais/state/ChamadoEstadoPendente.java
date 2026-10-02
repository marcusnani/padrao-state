package padroescomportamentais.state;

public class ChamadoEstadoPendente extends ChamadoEstado {

    private ChamadoEstadoPendente() {};
    private static ChamadoEstadoPendente instance = new ChamadoEstadoPendente();
    public static ChamadoEstadoPendente getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Pendente";
    }

    public boolean cancelar(Chamado chamado) {
        chamado.setEstado(ChamadoEstadoCancelado.getInstance());
        return true;
    }
}