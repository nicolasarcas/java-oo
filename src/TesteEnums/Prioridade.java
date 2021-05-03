package TesteEnums;

public enum Prioridade {

    MIN(1),NORMAL(5),MAX(10);

    public int val;

    public static final int  a = 10;

    Prioridade(int i){
         this.val = i;
    }

    public int getVal() {
        return val;
    }
}
