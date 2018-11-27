package cpnmodeller.petrinet;

public class Arc {
    private final Node start;
    private final Node end;

    private String inscription = "";

    public Arc(Place start, Transition end) {
        this.start = start;
        this.end = end;
    }

    public Arc(Transition start, Place end) {
        this.start = start;
        this.end = end;
    }

    public String getInscription() {
        return inscription;
    }

    public void setInscription(String inscription) {
        this.inscription = inscription;
    }

    public Node getStart() {
        return start;
    }

    public Node getEnd() {
        return end;
    }
}
