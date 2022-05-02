import java.lang.Math;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static int SelecaoTexto(){
        int selecao;
        while(true){
            try{
                System.out.println("1\t\t=>\t\tCalcula área de um triângulo\n" +
                        "2\t\t=>\t\tCheca sexo da pessoa\n" +
                        "3\t\t=>\t\tPega qual é a maior idade entre 3\n" +
                        "0\t\t=>\t\tFECHA O PROGRAMA\n\n");

                System.out.print("Digite sua opção: ");
                selecao = new Scanner(System.in).nextInt();

                if (selecao < 0) {
                    System.out.println("\n\nDigite uma opção VÁLIDA!\n\n");
                    continue;
                } else if (selecao > 7) {
                    System.out.println("\n\nDigite uma opção VÁLIDA!\n\n");
                    continue;
                }else{
                    break;
                }


            } catch (Exception e) {
                System.out.println("\n\nDigite uma opção VÁLIDA!\n\n");
                continue;
            }
        }
        return selecao;

    }

    public static Double AreaTriangulo(Double a, Double b, Double c){
        Double p = (a + b + c )/2;
        Double area = Math.sqrt(p* (p - a) * (p-b) * (p-c));
        return area;
    }

    public static String SexoPessoa(String sexo){
        sexo = sexo.toUpperCase();
        if(sexo.equals("M")){
            return "Seu sexo é Masculino";
        }else if(sexo.equals("F")){
            return "Seu sexo é Feminino";
        }else{
            return "Houve um erro e o programa não conseguiu identificar seu sexo!";
        }
    }

    public static String MaiorIdade(int n1, int n2, int n3){
        Integer[] idades = {n1,n2,n3};
        Arrays.sort(idades, Collections.reverseOrder());
        return "A maior idade é "+idades[0];
    }

    public static void main(String[] args) {
        System.out.println("Atividade SENAI 2/5/2022 - Revisão de Funções - Curso: Desenvolvedor Java Vespertino\n\n");

        int num1,num2,num3;
        Double num1_double,num2_double,num3_double;

        Boolean run = true;
        while(run){
            int selecionado = SelecaoTexto();

            switch (selecionado) {
                case 1:
                    System.out.print("\n\nDigite o valor de a: ");
                    num1_double = new Scanner(System.in).nextDouble();
                    System.out.print("\n\nDigite o valor de b: ");
                    num2_double = new Scanner(System.in).nextDouble();
                    System.out.print("\n\nDigite o valor de c: ");
                    num3_double = new Scanner(System.in).nextDouble();

                    System.out.println("\n\nA area do triângulo é " + AreaTriangulo(num1_double, num2_double,num3_double) + "\n\n");
                    continue;

                case 2:
                    System.out.println("\n\nDigite o seu sexo (M = Masculino / F = Feminino)");
                    String sexo = new Scanner(System.in).nextLine();
                    System.out.println("\n\n" + SexoPessoa(sexo) + "\n\n");

                    continue;

                case 3:
                    System.out.println("\n\nDigite três idades:");
                    System.out.print("idade 1 = ");
                    num1 = new Scanner(System.in).nextInt();
                    System.out.print("idade 2 = ");
                    num2 = new Scanner(System.in).nextInt();
                    System.out.print("idade 3 = ");
                    num3 = new Scanner(System.in).nextInt();
                    System.out.println("\n\n" + MaiorIdade(num1, num2, num3) + "\n\n");
                    continue;

                case 0:
                    run = false;
                    break;
            }
        }
    }
}
