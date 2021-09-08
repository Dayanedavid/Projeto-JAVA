package principal;

import dados.Conta;
import dados.Cliente;

public class Main {

    public static void main(String[] args) {
        Cliente novoCliente1 = new Cliente("Dayane","David");

	    // testando a classe conta()

        Conta novaConta1 = new Conta("123456",novoCliente1);
        novaConta1.depositar(100);
        novaConta1.sacar(95);

        Cliente novoCliente2 = new Cliente();
        novoCliente2.setNome("Denis");
        novoCliente2.setSobrenome("Soares");


        Conta contaPlus = new Conta("987654",novoCliente2);
        contaPlus.depositar(9000);
        contaPlus.sacar(500);

    }
}
