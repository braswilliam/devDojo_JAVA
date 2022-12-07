package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao {
    public static void main(String[] args) {

        //while, do while, for

        int count = 1;

        while(count <= 10){
            System.out.print(count);
            count++;
        }

        System.out.println();
        
        count = 0;
        do {
            System.out.println("dentro do do-while");
            count++;
        } while (count < 10);


        for (int i = 1; i <= 10 ; i++) {
            System.out.println("dentro do for");
        }
        
    }




}
