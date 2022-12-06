package academy.devdojo.maratonaJava;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int idade = 15;
        boolean altorizadoComprarBebida = idade >= 18;

        if(idade >= 18){
            System.out.println("Pode comprar bebida");
        }else{
            System.out.println("Não pode comprar bebidas");
        }

    }
}
