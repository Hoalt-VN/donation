package assignment.entity;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "donation")
public class Donation {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "code")
    private String code;
    @Basic
    @Column(name = "create")
    private String create;
    @Basic
    @Column(name = "description")
    private String description;
    @Basic
    @Column(name = "end_date")
    private String endDate;
    @Basic
    @Column(name = "money")
    private Integer money;
    @Basic
    @Column(name = "name")
    private String name;
    @Basic
    @Column(name = "organization_name")
    private String organizationName;
    @Basic
    @Column(name = "phone_number")
    private String phoneNumber;
    @Basic
    @Column(name = "start_date")
    private String startDate;
    @Basic
    @Column(name = "status")
    private Integer status;

    @OneToMany(mappedBy = "donationByDonationId")
    private Collection<UserDonation> userDonations;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCreate() {
        return create;
    }

    public void setCreate(String create) {
        this.create = create;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Collection<UserDonation> getUserDonations() {
        return userDonations;
    }

    public void setUserDonations(Collection<UserDonation> userDonations) {
        this.userDonations = userDonations;
    }

    public Donation() {
    }

    @Override
    public String toString() {
        return "Donation{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", create='" + create + '\'' +
                ", description='" + description + '\'' +
                ", endDate='" + endDate + '\'' +
                ", money=" + money +
                ", name='" + name + '\'' +
                ", organizationName='" + organizationName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", startDate='" + startDate + '\'' +
                ", status=" + status +
                '}';
    }
}
