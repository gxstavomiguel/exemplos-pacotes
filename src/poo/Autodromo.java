package poo;

public class Autodromo {
    public static void main(String[] args) {
        Carro jeep = new Carro();
        jeep.setChassi("123456");
       // jeep.ligar();

        Moto z400 = new Moto();
        z400.setChassi("6543121");
        //z400.ligar();

        Veiculo coringa = z400;

        coringa.ligar();
    }
}
