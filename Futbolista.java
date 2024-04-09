package sustentacion;

public class Futbolista {

    private String name;
     private String position; 
    private String dorsal;
    private String nacionality;

    public Futbolista(String name, String position, String dorsal, String nacionality) {
        this.name = name;
        this.position = position;
        this.dorsal = dorsal;
        this.nacionality = nacionality;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getDorsal() {
        return dorsal;
    }

    public void setDorsal(String dorsal) {
        this.dorsal = dorsal;
    }

    public String getNacionality() {
        return nacionality;
    }

    public void setNacionality(String nacionality) {
        this.nacionality = nacionality;
    }

    @Override
    public String toString() {
        return "Futbolista [name=" + name + ", position=" + position + ", dorsal=" + dorsal + ", nacionality="
                + nacionality + "]";
    }
    
    
    
}
