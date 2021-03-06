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
 * AddressTable generated by hbm2java
 */
@Entity
@Table(name="address_table"
    ,catalog="cit360_team_e_skills_db"
)
public class AddressTable  implements java.io.Serializable {


     private Integer addressId;
     private String streetAddress;
     private String city;
     private String homeState;
     private String zipCode;
     private Set<MemberTable> memberTables = new HashSet<MemberTable>(0);

    public AddressTable() {
    }

	
    public AddressTable(String streetAddress, String city, String homeState, String zipCode) {
        this.streetAddress = streetAddress;
        this.city = city;
        this.homeState = homeState;
        this.zipCode = zipCode;
    }
    public AddressTable(String streetAddress, String city, String homeState, String zipCode, Set<MemberTable> memberTables) {
       this.streetAddress = streetAddress;
       this.city = city;
       this.homeState = homeState;
       this.zipCode = zipCode;
       this.memberTables = memberTables;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="addressID", unique=true, nullable=false)
    public Integer getAddressId() {
        return this.addressId;
    }
    
    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    
    @Column(name="streetAddress", nullable=false, length=200)
    public String getStreetAddress() {
        return this.streetAddress;
    }
    
    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    
    @Column(name="city", nullable=false, length=80)
    public String getCity() {
        return this.city;
    }
    
    public void setCity(String city) {
        this.city = city;
    }

    
    @Column(name="homeState", nullable=false, length=2)
    public String getHomeState() {
        return this.homeState;
    }
    
    public void setHomeState(String homeState) {
        this.homeState = homeState;
    }

    
    @Column(name="zipCode", nullable=false, length=10)
    public String getZipCode() {
        return this.zipCode;
    }
    
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="addressTable")
    public Set<MemberTable> getMemberTables() {
        return this.memberTables;
    }
    
    public void setMemberTables(Set<MemberTable> memberTables) {
        this.memberTables = memberTables;
    }




}


