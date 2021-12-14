package oop.encapsulation;

public class Role extends BaseClass{

    private String description;


    public Role(Long id, String description) {
        super(id);
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
