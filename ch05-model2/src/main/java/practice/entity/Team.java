package practice.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Team {
    @Id
    @Column(name = "team_id")
    private Long id;

    private String name;
   
    @OneToMany(mappedBy = "team")
    private List<Member> members = new ArrayList<Member>();

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
