import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        try{
            System.out.println("Número do contrato: ");
            Integer contratoNumero = sc.nextInt();

            System.out.print("Valor do contrato: ");
            Double valor = sc.nextDouble();
            
            LocalDate data = LocalDate.parse("2000-01-01");
            while(true){
                try{
                    System.out.print("Data [YYYY-MM-DD]: ");
                    data = LocalDate.parse(sc.next());
                    break;
                }
                catch(DateTimeParseException e){
                    System.out.println("Formato de data inválido, tente novamente [YYYY-MM-DD]: ");
                }
            }

            System.out.print("Número de parcelas ");
            int parcelas = sc.nextInt();

            Contrato c1 = new Contrato(contratoNumero, valor, data);
            
            ServicoContrato servicoContrato = new ServicoContrato(new ServicoPaypal());
            servicoContrato.fazerContrato(c1, parcelas);
            
            System.out.println("Parcelas: ");
            for (Parcela parcela : c1.getParcelas()) {
                System.out.print(parcela);
            }

            sc.close();
        }
        catch(InputMismatchException e){
            System.out.println("Formato inválido.");
        }
    }
}