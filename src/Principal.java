import java.io.IOException;
import java.util.Scanner;

public class Principal{
    public static void main(String[] args) {

        try {
            Scanner leitura = new Scanner(System.in);
            System.out.println("Digite um CEP:");
            var cep = leitura.nextLine();

            BuscadorDeCEP consulta = new BuscadorDeCEP();
            Endereco novoEndereco = consulta.buscaEndereco(cep);
            geradorArquivo gerador = new geradorArquivo();
            gerador.salvaJson(novoEndereco);

            System.out.println("Arquivo JSON, contendo o endereço, gerado com sucesso!");
        }
        catch (RuntimeException | IOException e){
            System.out.println(e.getMessage());
            System.out.println("Finalizando aplicação.");
        }
    }
}