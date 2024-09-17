import java.util.ArrayList;
import java.util.Objects;

public class Produto {
    // atributos
    private String nome;
    private double preco;
    private String descricao;
    private int quantidade;
    private ArrayList<Caracteristica> caracteristicas  = new ArrayList<>();
    // construtor
    public Produto(String nome, double preco, String descricao, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.descricao = descricao;
        this.quantidade = quantidade;
    }

    public Produto(String nome, double preco, String descricao, int quantidade, ArrayList<Caracteristica> caracteristicas) {
        this.nome = nome;
        this.preco = preco;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.caracteristicas = caracteristicas;
    }

    public Produto(){

    }

    public ArrayList<Caracteristica> getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(ArrayList<Caracteristica> caracteristicas) {
        this.caracteristicas = caracteristicas;
    }



    //métodos
    public void adicionarQuantidade(int quantidade) {
        this.quantidade += quantidade;
    }

    public void removerQuantidade(int quantidade){
        if(this.quantidade - quantidade < 0){
            System.out.println("Quantidade insuficiente");
            return;
        }
        this.quantidade -= quantidade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return Double.compare(preco, produto.preco) == 0 && quantidade == produto.quantidade && Objects.equals(nome, produto.nome) && Objects.equals(descricao, produto.descricao) && Objects.equals(caracteristicas, produto.caracteristicas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, preco, descricao, quantidade, caracteristicas);
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", descricao='" + descricao + '\'' +
                ", quantidade=" + quantidade +
                ", caracteristicas=" + caracteristicas +
                '}';
    }
}
