package assignment.entity;

import javax.persistence.*;

@Entity
@Table(name = "user_donation")
public class UserDonation {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "create")
    private String create;
    @Basic
    @Column(name = "money")
    private Integer money;
    @Basic
    @Column(name = "name")
    private String name;
    @Basic
    @Column(name = "status")
    private Integer status;
    @Basic
    @Column(name = "text")
    private String text;
    @Basic
    @Column(name = "donation_id")
    private Integer donationId;
    @Basic
    @Column(name = "user_id")
    private Integer userId;
    @ManyToOne(optional = false)
    @JoinColumn(name = "donation_id", referencedColumnName = "id", insertable = false, updatable = false)
    private Donation donationByDonationId;
    @ManyToOne(optional = false)
    @JoinColumn(name = "user_id", referencedColumnName = "id", insertable = false, updatable = false)
    private Users usersByUserId;
    public Users getUsersByUserId() {
        return usersByUserId;
    }

    public void setUsersByUserId(Users usersByUserId) {
        this.usersByUserId = usersByUserId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCreate() {
        return create;
    }

    public void setCreate(String create) {
        this.create = create;
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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Integer getDonationId() {
        return donationId;
    }

    public void setDonationId(Integer donationId) {
        this.donationId = donationId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Donation getDonationByDonationId() {
        return donationByDonationId;
    }

    public void setDonationByDonationId(Donation donationByDonationId) {
        this.donationByDonationId = donationByDonationId;
    }

    public UserDonation() {
    }

    @Override
    public String toString() {
        return "UserDonation{" +
                "id=" + id +
                ", create='" + create + '\'' +
                ", money=" + money +
                ", name='" + name + '\'' +
                ", status=" + status +
                ", text='" + text + '\'' +
                ", donationId=" + donationId +
                ", userId=" + userId +
                ", donationByDonationId=" + donationByDonationId +
                '}';
    }
}
