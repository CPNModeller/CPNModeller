package cpnmodeller.declarations;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class Declarations {

    private Set<Globref> parameters = new TreeSet<>();
    private Set<Colset> types = new TreeSet<>();
    private Set<Var> variables = new TreeSet<>();
    private Set<Fun> functions = new TreeSet<>();

    public Declarations(){

    }


    public Set<Globref> getParameters() { return this.parameters; }

    public void addParameter(Globref parameter){
        this.parameters.add(parameter);
    }

    public Set<Colset> getTypes(){
        return this.types;
    }

    public void addType(Colset colset){
        this.types.add(colset);
    }

    public Set<Var> getVariables() {
        return this.variables;
    }

    public void addVariable(Var v) {
        this.variables.add(v);
    }

    public Set<Fun> getFunctions() {
        return this.functions;
    }

    public void addFunction(Fun function) {
        this.functions.add(function);
    }


}
