package routeradar.rrviewer.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import routeradar.rrviewer.model.Authorization.UserChildLevelAuth;
import routeradar.rrviewer.model.Authorization.UserDeviceAuth;
import routeradar.rrviewer.model.Authorization.UserRegionAuth;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Document(collection = "User")
@Data
@AllArgsConstructor
public class UserProfile {
    @Id
    protected ObjectId id;
    protected String fullName;
    protected String nic;
    protected String company;
    protected String phoneNo;
    protected String secondaryContact;
    protected String residentialAddress;
    protected String officeAddress;
    protected String companyId;
    protected String email;
    protected List<String> contactNos = new ArrayList<>();
    protected Date registeredAt;
    protected Date updatedAt;
    protected boolean isActive;
    protected boolean status;
    private User createdBy;
    private User updatedBy;

    public UserProfile() {

    }
}
