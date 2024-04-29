public class Carro {
    private String placa;
    private String marca;
    
    public Carro(String placa, String marca) {
        this.placa = placa;
        this.marca = marca;
    }

    public String getPlaca() {
        return placa;
    }

    public String getMarca() {
        return marca;
    }

    @Override
    public String toString() {
        return "Carro [placa=" + placa + ", marca=" + marca + "]";
    }
}
