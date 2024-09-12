//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        var produto1 = new Produto("Coca-Cola", 5.0, "Refrigerante de Cola", 10);
        System.out.println(produto1.getNome() + " - R$" + produto1.getPreco());
        produto1.setPreco(10.0);

    }
}
