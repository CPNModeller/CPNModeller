package cpnmodeller.declarations;

/**
 * Should be xml notation?
 */

public class Fun {

    private String temporaryName;

    public Fun(String temporaryName){
        this.temporaryName = temporaryName;
    }

    @Override
    public String toString(){
        return temporaryName;
    }

}
