package ControlandoFluxoDaApliação;

public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 2022;
        boolean incluindoNoPlano = false;
        double notaDoFilme = 8.1;
        String tipoPlano = "normal";

        if (anoDeLancamento >= 2022) {
            System.out.println("Lançamento que os clientes estão curtindo!");
        } else {
            System.out.println("Filme retrô que vale a pena assistir!");
        }

        if (incluindoNoPlano == true || tipoPlano.equals("plus")) {
            System.out.println("filme liberado");
        } else {
            System.out.println("Deve pagar a locação");
        }
    }
}
