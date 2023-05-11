package hibernateproject.hibernateDemo.DTO;

import org.mapstruct.Builder;

import javax.persistence.Column;

public class CountryDTO {
    private int id;
    private String name;
    private String president;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPresident() {
        return president;
    }

    public void setPresident(String president) {
        this.president = president;
    }



}
