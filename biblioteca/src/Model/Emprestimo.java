package Model;

public class Emprestimo {

    private Usuario usuario;
    private Livro livro;
    private int diasAtraso;
    private double calcularMulta;

    public Emprestimo(Usuario usuario, double calcularMulta, int diasAtraso, Livro livro) {
        this.usuario = usuario;
        this.calcularMulta = calcularMulta;
        this.diasAtraso = diasAtraso;
        this.livro = livro;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public int getDiasAtraso() {
        return diasAtraso;
    }

    public void setDiasAtraso(int diasAtraso) {
        this.diasAtraso = diasAtraso;
    }

    public double getCalcularMulta() {
        return calcularMulta;
    }

    public void setCalcularMulta(double calcularMulta) {
        this.calcularMulta = calcularMulta;
    }

    public String getResumo(){
        return usuario.getNome() + "-" + livro.getTitulo() + "-" + "o valor com multa é: " + livro.getValorMulta();
    }
}
