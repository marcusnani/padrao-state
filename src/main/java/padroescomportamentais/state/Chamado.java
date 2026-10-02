package padroescomportamentais.state;

public class Chamado {

    private String descricao;
    private ChamadoEstado estado;

    public Chamado() {
        this.estado = ChamadoEstadoAberto.getInstance();
    }

    public void setEstado(ChamadoEstado estado) {
        this.estado = estado;
    }

    public boolean abrir() {
        return estado.abrir(this);
    }

    public boolean resolver() {
        return estado.resolver(this);
    }

    public boolean atender() {
        return estado.atender(this);
    }

    public boolean cancelar() {
        return estado.cancelar(this);
    }

    public boolean pendenciar() {
        return estado.pendenciar(this);
    }

    public boolean escalar() {
        return estado.escalar(this);
    }

    public String getNomeEstado() {
        return estado.getEstado();
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public ChamadoEstado getEstado() {
        return estado;
    }
}