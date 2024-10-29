package enums;

public class SistemaIbge {
    public static void main(String[] args) {
        for(EstadoBrasileiro e: EstadoBrasileiro.values()) {
            //System.out.println(e.getSigla() + " - " + e.getNome());
        }
        EstadoBrasileiro sc = EstadoBrasileiro.MARANHAO;

        System.out.println(sc.getNome());
        System.out.println(sc.getSigla());
        System.out.println(sc.getNomeMaiusculo());
        System.out.println(sc.getIbge());

    }

}
