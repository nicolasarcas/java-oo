public class Administrador extends Funcionario implements Autenticavel{

    Autenticador autenticador;

    public Administrador(){
        autenticador = new Autenticador();
    }


    public boolean autentica(int senha) {
        return this.autenticador.autentica(senha);
    }


    public void setSenha(int senha) {
        this.autenticador.setSenha(senha);
    }

    public double getBonificacao(){
        System.out.println("Chamando o método de bonificacao do gerente");
        return 50;
    }

}
