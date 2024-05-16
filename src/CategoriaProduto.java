import java.util.ArrayList;
import java.util.List;

public class CategoriaProduto extends Base{
    private String title;
    private String description;

    private List<Produto> produtos;

    CategoriaProduto() {
        this.produtos = new ArrayList<>();
    }


    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
