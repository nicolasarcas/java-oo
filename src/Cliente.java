public class Cliente implements Autenticavel {

    Autenticador autenticador;

    public Cliente(){
        autenticador = new Autenticador();
    }

    @Override
    public boolean autentica(int senha) {
        return this.autenticador.autentica(senha);
    }

    @Override
    public void setSenha(int senha) {
        this.autenticador.setSenha(senha);
    }
}
