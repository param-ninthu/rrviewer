package routeradar.rrviewer.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "User")
@Data
@AllArgsConstructor
public class User {
    @Id
    protected ObjectId id;
    protected String username;
    protected  String password;
    protected boolean status;
    protected boolean isActive;
    protected String salt;
    protected UserProfile userProfile;


    public User() {
        this.userProfile = new UserProfile();

    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public ObjectId getId() {
        return id;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public boolean getStatus() {
        return status;
    }
}
