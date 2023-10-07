import java.util.Scanner;

public class Counter {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro: ");
        int paramOne = terminal.nextInt();

        System.out.println("Digite o segundo parâmetro: ");
        int paramTwo = terminal.nextInt();

        try{
            count(paramOne, paramTwo);
        }catch (InvalidParametersException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro!");
        }
    }

    static void count(int paramOne, int paramTwo) throws InvalidParametersException {
        if(paramOne > paramTwo){
            throw new InvalidParametersException();
        }

        int count = paramTwo - paramOne;

        for(int i = 0; i<count; i++){
            System.out.println("Imprimindo o número: " + (i+1));
        }
    }
}
