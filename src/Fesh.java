public class Fesh {
    private String whereDoesHeLive;

    public Fesh() {
    }

    public Fesh(String whereDoesHeLive) {
        this.whereDoesHeLive = whereDoesHeLive;
    }

    public String getWhereDoesHeLive() {
        return whereDoesHeLive;
    }

    public void setWhereDoesHeLive(String whereDoesHeLive) {
        this.whereDoesHeLive = whereDoesHeLive;
    }

    @Override
    public String toString() {
        return "fesh:  " + "\n"+
                "whereDoesHeLive:  " + whereDoesHeLive + "\n";
    }
}
