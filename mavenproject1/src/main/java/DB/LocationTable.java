package DB;
// Generated Nov 9, 2016 6:54:11 PM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * LocationTable generated by hbm2java
 */
@Entity
@Table(name="location_table"
    ,catalog="cit360_team_e_skills_db"
)
public class LocationTable  implements java.io.Serializable {


     private Integer wardId;
     private String wardName;
     private String stakeName;

    public LocationTable() {
    }

    public LocationTable(String wardName, String stakeName) {
       this.wardName = wardName;
       this.stakeName = stakeName;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="wardID", unique=true, nullable=false)
    public Integer getWardId() {
        return this.wardId;
    }
    
    public void setWardId(Integer wardId) {
        this.wardId = wardId;
    }

    
    @Column(name="wardName", nullable=false, length=80)
    public String getWardName() {
        return this.wardName;
    }
    
    public void setWardName(String wardName) {
        this.wardName = wardName;
    }

    
    @Column(name="stakeName", nullable=false, length=80)
    public String getStakeName() {
        return this.stakeName;
    }
    
    public void setStakeName(String stakeName) {
        this.stakeName = stakeName;
    }




}

