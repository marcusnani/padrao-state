package padroescomportamentais.state;

public class ChamadoEstadoEscalado extends ChamadoEstado {

    private ChamadoEstadoEscalado() {};
    private static ChamadoEstadoEscalado instance = new ChamadoEstadoEscalado();
    public static ChamadoEstadoEscalado getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Escalado";
    }

}