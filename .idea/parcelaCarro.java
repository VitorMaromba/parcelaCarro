package parcelaCarro;

public class parcelaCarro {
    static void main(String[] args) {

        double valorMax = 30000;

        for (int parcela = 1; parcela <= valorMax; parcela++) {
            double valorParcela = valorMax / parcela ;
            if (valorParcela < 1000){
                break;
            }
            System.out.println("Parcelado em "+parcela+ " x de R$ "+valorParcela);

        }

    }
}
