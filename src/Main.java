import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double altura, raio, volume, area;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Vamos calcular a area do Cilindro!! ");
        System.out.println("Digite um valor para o raio do cilindro em cm: ");
        raio = entrada.nextDouble();
        area = 3.14 * (raio * raio);
        System.out.println("Essa é a area do cilindro: " + area);

        System.out.println("Digite um valor para a altura do cilindro em cm: ");
        altura = entrada.nextDouble();

        volume = altura*area;

        System.out.printf(" volume do cilindro é: %.2f\n", + volume);

    }
}