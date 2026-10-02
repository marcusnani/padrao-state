package padroescomportamentais.state;

public class ChamadoEstadoCancelado extends ChamadoEstado {

    private ChamadoEstadoCancelado() {};
    private static ChamadoEstadoCancelado instance = new ChamadoEstadoCancelado();
    public static ChamadoEstadoCancelado getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Cancelado";
    }


}