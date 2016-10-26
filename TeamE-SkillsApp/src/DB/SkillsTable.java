package DB;
// Generated Oct 25, 2016 6:36:24 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * SkillsTable generated by hbm2java
 */
public class SkillsTable  implements java.io.Serializable {


     private Integer skillsId;
     private String skillCategory;
     private String skillName;
     private Set memberTables = new HashSet(0);

    public SkillsTable() {
    }

	
    public SkillsTable(String skillCategory, String skillName) {
        this.skillCategory = skillCategory;
        this.skillName = skillName;
    }
    public SkillsTable(String skillCategory, String skillName, Set memberTables) {
       this.skillCategory = skillCategory;
       this.skillName = skillName;
       this.memberTables = memberTables;
    }
   
    public Integer getSkillsId() {
        return this.skillsId;
    }
    
    public void setSkillsId(Integer skillsId) {
        this.skillsId = skillsId;
    }
    public String getSkillCategory() {
        return this.skillCategory;
    }
    
    public void setSkillCategory(String skillCategory) {
        this.skillCategory = skillCategory;
    }
    public String getSkillName() {
        return this.skillName;
    }
    
    public void setSkillName(String skillName) {
        this.skillName = skillName;
    }
    public Set getMemberTables() {
        return this.memberTables;
    }
    
    public void setMemberTables(Set memberTables) {
        this.memberTables = memberTables;
    }




}


