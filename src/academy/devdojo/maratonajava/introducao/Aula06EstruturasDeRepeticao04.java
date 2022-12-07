package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao04 {
    public static void main(String[] args) {

        //Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado
        //Condição: valor da parcela 1000;

        double valorTotal = 30000;


        for (int parcela = 1; parcela <= valorTotal ; parcela++) {
            double valorPecela = valorTotal / parcela;
            if (valorPecela < 1000){
                break;
            }else {
                System.out.printf("Parcela %d = R$ %.2f%n", parcela, valorPecela) ;
            }
        }

    }
}
