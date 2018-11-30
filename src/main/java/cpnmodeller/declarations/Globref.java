package cpnmodeller.declarations;

public class Globref {

    private String name;
    private int value;

    public Globref(String name, int value){
        this.name = name;
        this.value = value;
    }

    @Override
    public String toString(){
        return name;
    }

}
