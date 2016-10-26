package DB;
// Generated Oct 25, 2016 6:36:24 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * AddressTable generated by hbm2java
 */
public class AddressTable  implements java.io.Serializable {


     private Integer addressId;
     private String streetAddress;
     private String city;
     private String homeState;
     private String zipCode;
     private Set memberTables = new HashSet(0);

    public AddressTable() {
    }

	
    public AddressTable(String streetAddress, String city, String homeState, String zipCode) {
        this.streetAddress = streetAddress;
        this.city = city;
        this.homeState = homeState;
        this.zipCode = zipCode;
    }
    public AddressTable(String streetAddress, String city, String homeState, String zipCode, Set memberTables) {
       this.streetAddress = streetAddress;
       this.city = city;
       this.homeState = homeState;
       this.zipCode = zipCode;
       this.memberTables = memberTables;
    }
   
    public Integer getAddressId() {
        return this.addressId;
    }
    
    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }
    public String getStreetAddress() {
        return this.streetAddress;
    }
    
    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }
    public String getCity() {
        return this.city;
    }
    
    public void setCity(String city) {
        this.city = city;
    }
    public String getHomeState() {
        return this.homeState;
    }
    
    public void setHomeState(String homeState) {
        this.homeState = homeState;
    }
    public String getZipCode() {
        return this.zipCode;
    }
    
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
    public Set getMemberTables() {
        return this.memberTables;
    }
    
    public void setMemberTables(Set memberTables) {
        this.memberTables = memberTables;
    }




}

