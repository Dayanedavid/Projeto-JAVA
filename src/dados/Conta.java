package dados;

public class Conta {
    //private: esconde (encapsula) os atributos da classe
    private String numero;
    private double saldo;
    private Cliente titular;

    //construtor sem paramentos
    //Inicializa os atributos com vazio ou zero
    public Conta() {
        this.setNumero("");
        this.setSaldo(0);
        this.setTitular(null);
    }

    //construtor com parametros
    //
    public Conta(String numero, Cliente titular) {
        this.numero = numero;
        this.saldo = 0;
        this.titular = titular;

    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    private double getSaldo() {
        return this.saldo;
    }

    private void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public void depositar(double valor) {
        //**REGRA DE NEGOCIO**
        //valor <0: não depositar
        //getSaldo(): saldo 100.00
        //valor:100
        //setSaldo(100+100)
        //novo valor do saldo:200
        //this.setSaldo(getSaldo()+valor);

        if (valor > 0) {
            System.out.println("Saldo atual:...... " + getSaldo());
            System.out.println("Valor a depositar: " + valor);
            this.setSaldo(getSaldo() + valor);
            System.out.println("Novo saldo........." + getSaldo());
        } else {
            System.out.println("Valor  inválido! Digite um valor positivo!");
        }

    }

    public void sacar(double valor) {
        //somente efetuar o saque se o saldo disponivel for suficiente
        if (getSaldo() >= valor) {
            System.out.println("Saldo atual:..." + getSaldo());
            System.out.println("Valor a sacar: " + valor);
            this.setSaldo(getSaldo() - valor);
            System.out.println("Novo saldo....." + getSaldo());
        } else {
            System.out.println("Saldo insuficiente. Operação cancelada!");
        }
    }
}
