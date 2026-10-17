import java.util.InputMismatchException;
import java.util.Scanner;

public class ConsultaEstoque{
    public static void main(String[] args) {

        int[] estoque = {12, 0, 5, 25, 8};

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Digite o código do produto (0 a 4):");
            int codigo = scanner.nextInt();

            System.out.println("Quantidade disponível: " + estoque[codigo]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Código de produto inválido! Digite um valor entre 0 e 4.");

        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida! Você deve digitar um número inteiro.");

        } finally {
            scanner.close();
            System.out.println("Consulta de estoque finalizada.");
        }
    }
}
