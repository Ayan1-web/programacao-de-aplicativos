import java.util.Scanner;

public class mainAluno {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Aluno aluno = new Aluno();

        System.out.print("Digite o nome do aluno: ");
        aluno.setnome(scanner.nextLine());

        System.out.print("Quantas notas deseja inserir? ");
        int quantidade = scanner.nextInt();

        double[] notas = new double[quantidade];

        for (int i = 0; i < quantidade; i++) {

            System.out.print("Digite a nota " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();

        }

        double calc_media = aluno.media();

        aluno.resultado(calc_media);

        scanner.close();
    }
}