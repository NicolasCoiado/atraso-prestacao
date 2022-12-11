import java.util.ArrayList;
import java.util.Scanner;
public class AtrasoPrestacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double prestacao;
        int atraso;
        ArrayList<Double> pagamento = new ArrayList();
        int quant = 0;
        Double total = 0.0;
        do{
            System.out.print("Digite o valor da prestação: R$ ");
            prestacao = sc.nextDouble();
            System.out.print("Digite a quantos dias ela está atrasada: ");
            atraso = sc.nextInt();
            if(prestacao == 0) {
                break;
            }
            quant++;
            pagamento.add(total(prestacao, atraso));
        }while(true);
        for(int i = 0; i < quant; i++) {
            total += pagamento.get(i);
        }
        System.out.println("Foram pagas " + quant + " prestações hoje, totalizando R$" + total);
        sc.close();
    }
    public static Double total(Double prestacao, int atraso) {
        Double valor = 0.0;

        if(atraso < 1) {
            valor += prestacao;
        }else {
            valor = (prestacao + prestacao * 0.03 + 0.01 * atraso);
        }
        System.out.printf("Valor com juros: "+ valor);
        return valor;
    }
}
