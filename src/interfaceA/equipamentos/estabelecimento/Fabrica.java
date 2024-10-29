package interfaceA.equipamentos.estabelecimento;

import interfaceA.equipamentos.copiadora.Copiadora;
import interfaceA.equipamentos.digitalizadora.Digitalizadora;
import interfaceA.equipamentos.digitalizadora.Scanner;
import interfaceA.equipamentos.impressora.Deskjet;
import interfaceA.equipamentos.impressora.Impressora;
import interfaceA.equipamentos.impressora.Laserjet;
import interfaceA.equipamentos.multifuncional.EquipamentoMultifuncional;

public class Fabrica {
    public static void main(String[] args) {
        EquipamentoMultifuncional em = new EquipamentoMultifuncional();

        Scanner scanner = new Scanner();

        Impressora impressora = em;
        Digitalizadora digitalizadora = em;
        Copiadora copiadora = em;

        impressora.imprimir();
        digitalizadora.digitalizar();
        copiadora.copiar();
    }
}
