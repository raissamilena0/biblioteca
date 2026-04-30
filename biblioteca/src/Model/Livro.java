package Model;

public class Livro {

    public String titulo;
    public String autor;
    public double valorMulta;

    public Livro(String titulo, String autor, double valorMulta) {
        this.titulo = titulo;
        this.autor = autor;
        this.valorMulta = valorMulta;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getValorMulta() {
        return valorMulta;
    }

    public void setValorMulta(double valorMulta) {
        this.valorMulta = valorMulta;
    }

    public void exibirDetalhes(){
        System.out.println("titulo:" + getTitulo());
        System.out.println("autor:" + getAutor());
        System.out.println("autor" + getValorMulta());

    }

    public void AplicarMultaExtra(){
        double valor = valorMulta * 1.50;

        if (valorMulta > 20);{
            valor = valor + 10;
        }
        System.out.println("0 total é: " + valor);
    }
}
