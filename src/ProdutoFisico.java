import java.util.Objects;

public class ProdutoFisico extends Produto {
        private double peso;
        private boolean fragil;
        private double altura;
        private double largura;
        private double comprimento;

        public ProdutoFisico() {

        }

        public ProdutoFisico(String nome, double preco, String descricao, int quantidade, double peso, boolean fragil, double altura, double largura, double comprimento) {
            super(nome, preco, descricao, quantidade);
            this.peso = peso;
            this.fragil = fragil;
            this.altura = altura;
            this.largura = largura;
            this.comprimento = comprimento;
        }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setFragil(boolean fragil) {
        this.fragil = fragil;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public double getPeso() {
        return peso;
    }

    public boolean isFragil() {
        return fragil;
    }

    public double getAltura() {
        return altura;
    }

    public double getLargura() {
        return largura;
    }

    public double getComprimento() {
        return comprimento;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ProdutoFisico that = (ProdutoFisico) o;
        return Double.compare(peso, that.peso) == 0 && fragil == that.fragil && Double.compare(altura, that.altura) == 0 && Double.compare(largura, that.largura) == 0 && Double.compare(comprimento, that.comprimento) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), peso, fragil, altura, largura, comprimento);
    }

    @Override
    public String toString() {
        return "ProdutoFisico{" +
                "peso=" + peso +
                ", fragil=" + fragil +
                ", altura=" + altura +
                ", largura=" + largura +
                ", comprimento=" + comprimento +
                "} " + super.toString();
    }
}
