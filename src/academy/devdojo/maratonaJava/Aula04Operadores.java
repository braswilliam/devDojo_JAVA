package academy.devdojo.maratonaJava;

import java.util.Enumeration;

public class Aula04Operadores {
    public static void main(String[] args) {
        // + - / * %

        int n1 = 10;
        int n2 = 20;

        int soma  =  n1 + n2;
        double divisao =  n1 / (double) n2;
        System.out.println("soma  = " + soma);
        System.out.println("divisão = " + divisao);

        //%
        int resto = 20 % 2; // 20/2 = 10, resta o 0.
        System.out.println(resto);

        //"<" menor, ">" maior, "<=" menor igua, "==" igual, "!=" diferente
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean IsDezDiferenteDeDez = 10 != 10;
        boolean isDezIgualADez = 10 == 10;

        System.out.println("isDezMaiorQueVinte?? " + isDezMaiorQueVinte);
        System.out.println("isDez<MenorQueVinte?? " + isDezMenorQueVinte);
        System.out.println("IsDezDiferenteDeDez?? " + IsDezDiferenteDeDez);
        System.out.println("isDezIgualADez?? " + isDezIgualADez);

        //&&(and) ||(or) !(not)
        int idade = 29;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario > 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;

        System.out.println(isDentroDaLeiMaiorQueTrinta);
        System.out.println(isDentroDaLeiMenorQueTrinta);




    }
}
