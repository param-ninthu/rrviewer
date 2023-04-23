package routeradar.rrviewer.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "User")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    protected ObjectId id;
    protected String username;
    protected  String password;
    protected boolean status;
    protected boolean isActive;
    protected String salt;
}
