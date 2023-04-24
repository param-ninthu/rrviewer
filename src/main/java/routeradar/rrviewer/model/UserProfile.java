package routeradar.rrviewer.model;

import org.bson.types.ObjectId;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserProfile {
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
}
