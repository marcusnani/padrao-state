package padroescomportamentais.state;

public class ChamadoEstadoResolvido extends ChamadoEstado {

    private ChamadoEstadoResolvido() {};
    private static ChamadoEstadoResolvido instance = new ChamadoEstadoResolvido();
    public static ChamadoEstadoResolvido getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Resolvido";
    }


}