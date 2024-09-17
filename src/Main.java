//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        var produto1 = new Produto("Coca-Cola", 5.0, "Refrigerante de Cola", 10);
        produto1.getCaracteristicas().add(new Caracteristica("Alcoolico: ", "Não"));
        produto1.getCaracteristicas().add(new Caracteristica("Volume: ", "2l"));

        System.out.println(produto1);
        var produto2 = new Produto("Pepsi", 4.0, "Refrigerante de cola", 11);
        var produto3 = new Produto("Fanta", 4.50, "Refrigerante de uva", 15);
        if(produto1 == produto2);

        var produto4 = new ProdutoFisico();
        produto4.setNome("Guaraná");
    }
}
