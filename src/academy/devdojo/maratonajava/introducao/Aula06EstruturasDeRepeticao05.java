package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao05 {
    public static void main(String[] args) {

        //Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado
        //Condição: valor da parcela 1000;

        double valorTotal = 30000;


        for (int parcela = (int)valorTotal; parcela >= 1 ; parcela--) {
            double valorPecela = valorTotal / parcela;

            if(valorPecela < 1000) {
                continue;
            }
            System.out.printf("Parcela %d = R$ %.2f%n", parcela, valorPecela) ;
        }

    }
}
