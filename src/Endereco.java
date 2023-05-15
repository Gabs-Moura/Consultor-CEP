public record Endereco(String cep, String logradouro, String bairro, String localidade, String uf) {
    @Override
    public String toString() {
        return "Endereço{" +
                "CEP= " + cep +
                ", Logradouro = " + logradouro  +
                ", Bairro = " + bairro +
                ", Localidade = " + localidade +
                ", UF = " + uf  +
                '}';
    }
}
