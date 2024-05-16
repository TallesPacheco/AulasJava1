public class Main {
    public static void main(String[] args) {

        CategoriaProduto categoria = new CategoriaProduto();
        categoria.setTitle("Pizza");
        categoria.setDescription("Pizza com borda");

        Produto produto = new Produto();
        produto.setName("Calabresa");
        produto.setValue(50);
        produto.setDescription("molho, cebola e queijo");
        produto.setCategoria(categoria);

        Produto produto2 = new Produto();
        produto2.setName("Frango");
        produto2.setValue(55);
        produto2.setDescription("molho, cebola e queijo");
        produto2.setCategoria(categoria);

        categoria.getProdutos().add(produto);
        categoria.getProdutos().add(produto2);


        int size = categoria.getProdutos().size();
        for (int i = 0; i < size; i++) {
            System.out.println("Categoria tem: " + categoria.getProdutos().get(i).getName());
        }

        produto.setStatus(produto.DISABLED);

    }








}