package transportes.assentos;

public class AssentoVoo extends Assento {
    private String codigo;
    private String classe;

    //GS

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }
}
