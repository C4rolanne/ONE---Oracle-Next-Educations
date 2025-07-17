/* package ConstruindoCatalogoFilme.exercicio02;

public class DesafioTemperatura {
    public static void main(String[] args) {
        int c = 10;
        int f = (int)(c * 1.8 + 32);
        System.out.println( f);
    }
} */


 public class DesafioTemperatura {

    public static void main(String[] args) {
        double temperaturaEmCelsius = 30.4;
        double temperaturaEmFahrenheit = (temperaturaEmCelsius * 1.8) + 32;

        String mensagem = String.format("A temperatura de %f Celsius é equivalente a %f Fahrenheit", temperaturaEmCelsius, temperaturaEmFahrenheit);

        System.out.println(mensagem);

        int temperaturaEmFahrenheitInteira = (int) temperaturaEmFahrenheit;
        System.out.println("A temperatura em Fahrenheit inteira é: " + temperaturaEmFahrenheitInteira);

    }

}