package cpnmodeller.declarations;

public class Var {

    private int var;

    public Var(int var){
        this.var = var;
    }

    @Override
    public String toString(){
        return var + "";
    }
}
