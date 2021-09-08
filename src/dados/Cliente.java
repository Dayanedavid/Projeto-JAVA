package dados;

public class Cliente {
    //private: acessível somente dentro desta classe
    //alterando o ESTADO da classe
    private String nome;
    private String sobrenome;

    public Cliente(){
        this.setNome("");
        this.setSobrenome("");
    }

    public Cliente(String nome,String sobrenome){
        this.setNome(nome);
        this.setSobrenome(sobrenome);
    }


    public String getNome() {

        return this.nome;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }

    public String getSobrenome() {
        return this.sobrenome;
    }

    public void setSobrenome(String sobrenome){
        this.sobrenome = sobrenome;
    }
}
