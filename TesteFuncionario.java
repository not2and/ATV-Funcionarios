import java.util.Scanner;

public class TesteFuncionario {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("João", 1518.0, 'j', false);
        Funcionario funcionario2 = new Funcionario("Maria", 1518.0, 'p', true);
        Funcionario funcionario3 = new Funcionario("Carlos", 1518.0, 's', false);

        Funcionario[] funcionarios = {funcionario1, funcionario2, funcionario3};

        Scanner scanner = new Scanner(System.in);

        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario);
            System.out.println("Escolha uma opção para " + funcionario.getNome() + ": ");
            System.out.println("1. Aplicar desconto por falta");
            System.out.println("2. Aplicar aumento por hora extra");
            System.out.println("3. Não aplicar nada");
            int escolha = scanner.nextInt();

            if (escolha == 1) {
                funcionario.aplicarDescontoPorFalta();
                System.out.println("Após desconto por falta: " + funcionario);
            } else if (escolha == 2) {
                funcionario.aplicarAumentoPorHoraExtra();
                System.out.println("Após aumento por hora extra: " + funcionario);
            } else if (escolha == 3) {
                System.out.println("Não aplicar nada");
            } else {
                System.out.println("Opção inválida.");
            }
        }

        scanner.close();
    }
}
