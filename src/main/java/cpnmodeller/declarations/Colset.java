package cpnmodeller.declarations;

/**
 * We could represent colsets as colset x colset to define colsets that are composed of different colsets,
 * How we deal with the colsets consisting of basic components (e.g. only 1 colset) should be dicussed.
 */

public class Colset {

    private String colsetName;

    public Colset(String colsetName){
        colsetName = colsetName;
    }

    @Override
    public String toString(){
        return colsetName;
    }

}
