package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {

        int idade = (int) 10000000000000L; //forçando a entrada do valor via cast.
        long numeroGrande = (long)155.23;
        double salario = 2000D;
        float salarioFloat = (float) 2500D;//cast de double para float
        byte idadeByte = 10;
        short idadeShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 87;//tabela asc
        char outroCaractere = '\u0041'; //tabela unicode
        //String nome = new String();
        String nome = "Goku"; //sapas Duplas


        System.out.println("A idade é " + idade);
        System.out.println(verdadeiro);
        System.out.println(falso);
        System.out.println(caractere);
        System.out.println(outroCaractere);
        System.out.println(idade);
        System.out.println(numeroGrande);
        System.out.println("Oi eu sou " + nome);




    }
}
