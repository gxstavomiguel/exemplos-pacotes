package construtores;

import java.sql.SQLOutput;

public class SistemaCadastro {

    public static void main(String[] args){

        Pessoa marcos = new Pessoa("123", "MARCOS");

        marcos.setEndereco("Rua das Marias");

        System.out.println(marcos.getNome() + "-" + marcos.getCpf());
    }
}
