import java.util.Objects;

public class ProdutoDigital extends Produto{
    private String linkDownload;
    private String formatoArquivo;

    public ProdutoDigital() {

    }

    public ProdutoDigital(String nome, double preco, String descricao, int quantidade, String linkDownload, String formatoArquivo) {
        super(nome, preco, descricao, quantidade);
        this.linkDownload = linkDownload;
        this.formatoArquivo = formatoArquivo;
    }

    public String getLinkDownload() {
        return linkDownload;
    }

    public String getFormatoArquivo() {
        return formatoArquivo;
    }

    public void setLinkDownload(String linkDownload) {
        this.linkDownload = linkDownload;
    }

    public void setFormatoArquivo(String formatoArquivo) {
        this.formatoArquivo = formatoArquivo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ProdutoDigital that = (ProdutoDigital) o;
        return Objects.equals(linkDownload, that.linkDownload) && Objects.equals(formatoArquivo, that.formatoArquivo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), linkDownload, formatoArquivo);
    }

    @Override
    public String toString() {
        return "ProdutoDigital{" +
                "linkDownload='" + linkDownload + '\'' +
                ", formatoArquivo='" + formatoArquivo + '\'' +
                "} " + super.toString();
    }
}
