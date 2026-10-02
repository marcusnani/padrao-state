package padroescomportamentais.state;

public abstract class ChamadoEstado {

    public abstract String getEstado();

    public boolean abrir(Chamado chamado) {
        return false;
    }

    public boolean resolver(Chamado chamado) {
        return false;
    }

    public boolean atender(Chamado chamado) {
        return false;
    }

    public boolean cancelar(Chamado chamado) {
        return false;
    }

    public boolean pendenciar(Chamado chamado) {
        return false;
    }

    public boolean escalar(Chamado chamado) {
        return false;
    }

}