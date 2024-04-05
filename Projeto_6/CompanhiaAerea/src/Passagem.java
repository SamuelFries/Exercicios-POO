public class Passagem {
    private String data;
    private String numeroVoo;
    private double custoBase;
    private int quantidadeMalas;
    private boolean acessoPrioritario;

    // Construtor
    public PassagemAerea(String data, String numeroVoo, double custoBase, int quantidadeMalas, boolean acessoPrioritario) {
        this.data = data;
        this.numeroVoo = numeroVoo;
        this.custoBase = custoBase;
        this.quantidadeMalas = quantidadeMalas;
        this.acessoPrioritario = acessoPrioritario;
    }

    // Método para calcular o custo total da passagem na classe econômica
    public double calcularCustoTotalClasseEconomica() {
        double custoOperacional = custoBase * 0.1;
        double custoTotal = custoBase + custoOperacional;
        return custoTotal;
    }

    // Getters e Setters
    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getNumeroVoo() {
        return numeroVoo;
    }

    public void setNumeroVoo(String numeroVoo) {
        this.numeroVoo = numeroVoo;
    }

    public double getCustoBase() {
        return custoBase;
    }

    public void setCustoBase(double custoBase) {
        this.custoBase = custoBase;
    }

    public int getQuantidadeMalas() {
        return quantidadeMalas;
    }

    public void setQuantidadeMalas(int quantidadeMalas) {
        this.quantidadeMalas = quantidadeMalas;
    }

    public boolean isAcessoPrioritario() {
        return acessoPrioritario;
    }

    public void setAcessoPrioritario(boolean acessoPrioritario) {
        this.acessoPrioritario = acessoPrioritario;
    }

    // Método toString para exibir os detalhes da passagem
    @Override
    public String toString() {
        return "Passagem Aérea [Data=" + data + ", Número do Voo=" + numeroVoo + ", Custo Base=" + custoBase
                + ", Quantidade de Malas=" + quantidadeMalas + ", Acesso Prioritário=" + acessoPrioritario + "]";
    }

    // Exemplo de utilização
    public static void main(String[] args) {
        PassagemAerea passagem = new PassagemAerea("03/04/2024", "ABC123", 200.0, 2, true);
        System.out.println(passagem);
        System.out.println("Custo Total (Classe Econômica): $" + passagem.calcularCustoTotalClasseEconomica());
    }
}
