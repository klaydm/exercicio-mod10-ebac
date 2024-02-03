public class MediaAluno {

    double nota1;
    double nota2;
    double nota3;
    double nota4;

    public static double calcularMedia(double nota1, double nota2, double nota3, double nota4) {

        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        if(media >= 7.00) {
            System.out.printf("Aprovado!!");
        }else {
            if(media >= 5.00){
                System.out.printf("Recuperação, média: %.2f", media);
            }else{
                System.out.printf("Reprovado, média %.2f", media);
            }
        }

        return media;
    }
}
