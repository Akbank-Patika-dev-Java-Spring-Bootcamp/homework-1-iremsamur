package hibernateproject.hibernateDemo.Entities;

import lombok.Data;
import lombok.ToString;
import org.mapstruct.Builder;

import javax.persistence.*;

@Entity
@Table(name="country")
public class Country {
    @Id
    @Column(name="ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)//otomatik artan
    private int id;
    @Column(name="name")
    private String name;
    @Column(name="president")
    private String president;

    public Country(int id, String name, String president) {
        this.id = id;
        this.name = name;
        this.president = president;
    }

    public Country() {

    }

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
