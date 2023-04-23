package routeradar.rrviewer.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Role")
@Data
@AllArgsConstructor
public class Role {
    protected ObjectId id;
    protected String name;
    protected String metaCode;
    protected String description;
    protected boolean isActive;
    protected boolean status;
    protected int levelNo;

    public Role(){
        this.isActive = true;
        this.status = true;
    }

    public ObjectId getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getMetaCode() {
        return metaCode;
    }

    public String getDescription() {
        return description;
    }

    public int getLevelNo() {
        return levelNo;
    }

    public boolean isActive() {
        return isActive;
    }

    public boolean isStatus() {
        return status;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public void setLevelNo(int levelNo) {
        this.levelNo = levelNo;
    }

    public void setMetaCode(String metaCode) {
        this.metaCode = metaCode;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
