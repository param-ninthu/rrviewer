package routeradar.rrviewer.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Role")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Role {
    protected ObjectId id;
    protected String name;
    protected String metaCode;
    protected String description;
    protected boolean isActive;
    protected boolean status;
    protected int levelNo;
}
