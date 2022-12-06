package academy.devdojo.maratonaJava;

public class Aula06EstruturasDeRepeticao04 {
    public static void main(String[] args) {

        //Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado
        //Condição: valor da parcela 1000;

        double valorTotal = 30000;
        var count = 0;

        for (int i = 1000; i <= valorTotal; i+=1000) {
            count++;
        }

        System.out.println("Quantidade de Parcelas: " + count + "X");

    }
}
