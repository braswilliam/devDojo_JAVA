package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Estudante;

public class Estudanteteste02 {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante();

        estudante1.nome = "Sanji"; // mudei a inicialização de Zoro pata Sanji

        System.out.println(estudante1.nome); //Agora é Sanji
        System.out.println(estudante1.idade);//0
        System.out.println(estudante1.sexo); //NULL


        System.out.println("-----------------");

        Estudante estudante2 = new Estudante();

        System.out.println(estudante2.nome); //foi inicializada com o nome zoro.
        System.out.println(estudante2.idade);//0
        System.out.println(estudante2.sexo); //NULL


    }
}
