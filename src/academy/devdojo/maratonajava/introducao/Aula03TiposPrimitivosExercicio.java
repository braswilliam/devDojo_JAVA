package academy.devdojo.maratonajava.introducao;

import java.util.Date;

public class Aula03TiposPrimitivosExercicio {
    /*
    *Prática
    ≥ Crie variáveis para os campos descritos abaixo <> e imprima a seguinte mensagem
    ≥ Eu <nome> estou morando no endereco <endereço>, confirmo que recebi o salário de <salario>, na data <data>
    */


    public static void main(String[] args) {
        String nome = "Kakaroto";
        String endereco = "Rua 23, Olinda PE";
        double salario = 2500;
        Date data = new Date();


        System.out.println("Eu " + nome + " estou morando no endereco " + endereco +", confirmo que recebi o salário de "
                + salario + ", na data: " + data.toInstant());

    }

}
