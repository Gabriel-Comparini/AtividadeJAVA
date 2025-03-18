public class Produto {
    private String nome;
    private int id;
    private float preco, tamanho, peso;

    public Produto (int id, float preco) {
        this.id = id;
        this.preco = preco;
    }

    public Produto (String nome, float peso) {
        this.nome = nome;
        this.peso = peso;
    }

    public Produto (float tamanho) { 
        this.tamanho = tamanho;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public float getTamanho() {
        return tamanho;
    }

    public void setTamanho(float tamanho) {
        this.tamanho = tamanho;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
}
