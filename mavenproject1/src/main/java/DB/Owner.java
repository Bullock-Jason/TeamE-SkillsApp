package DB;
// Generated Nov 9, 2016 6:54:11 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Owner generated by hbm2java
 */
@Entity
@Table(name="owner"
    ,catalog="cit360_team_e_skills_db"
)
public class Owner  implements java.io.Serializable {


     private Integer id;
     private String firstName;
     private String lastName;
     private String gender;
     private Set<Car> cars = new HashSet<Car>(0);

    public Owner() {
    }

	
    public Owner(String firstName, String lastName, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
    }
    public Owner(String firstName, String lastName, String gender, Set<Car> cars) {
       this.firstName = firstName;
       this.lastName = lastName;
       this.gender = gender;
       this.cars = cars;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="id", unique=true, nullable=false)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    
    @Column(name="first_name", nullable=false, length=45)
    public String getFirstName() {
        return this.firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    
    @Column(name="last_name", nullable=false, length=45)
    public String getLastName() {
        return this.lastName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    
    @Column(name="gender", nullable=false, length=10)
    public String getGender() {
        return this.gender;
    }
    
    public void setGender(String gender) {
        this.gender = gender;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="owner")
    public Set<Car> getCars() {
        return this.cars;
    }
    
    public void setCars(Set<Car> cars) {
        this.cars = cars;
    }




}

