package uaslp.objetos.figuras;

public abstract class Figura implements DrawableItem{

    private String name = "Figura";
    private String description = "Figura Geometrica";

    Figura() {

    }

    Figura(String name) {
        this.name = name;
    }

    Figura(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
