package Entity;

import javax.persistence.*;
import java.util.Arrays;

/**
 * Created by panyunyi on 2017/5/7.
 */
@Entity
@Table(name = "h_users", schema = "aaa", catalog = "")
public class HUsersEntity {
    private String userName;
    private String majorName;
    private String departmentalName;
    private Integer userAge;
    private String currentLocation;
    private String emailAddress;
    private String password;
    private String nickname;
    private String telephoneNumber;
    private String id;
    private String userLabel;
    private String originSchool;
    private String haidaxueSn;
    private Integer level;
    private String userType;
    private byte[] userPic;
    private String highschoolName;
    private String collegeName;

    @Basic
    @Column(name = "user_name", nullable = true, length = 30)
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Basic
    @Column(name = "major_name", nullable = true, length = 30)
    public String getMajorName() {
        return majorName;
    }

    public void setMajorName(String majorName) {
        this.majorName = majorName;
    }

    @Basic
    @Column(name = "departmental_name", nullable = true, length = 30)
    public String getDepartmentalName() {
        return departmentalName;
    }

    public void setDepartmentalName(String departmentalName) {
        this.departmentalName = departmentalName;
    }

    @Basic
    @Column(name = "user_age", nullable = true)
    public Integer getUserAge() {
        return userAge;
    }

    public void setUserAge(Integer userAge) {
        this.userAge = userAge;
    }

    @Basic
    @Column(name = "current_location", nullable = true, length = 30)
    public String getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(String currentLocation) {
        this.currentLocation = currentLocation;
    }

    @Basic
    @Column(name = "email_address", nullable = true, length = 40)
    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Basic
    @Column(name = "password", nullable = true, length = 16)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "nickname", nullable = true, length = 16)
    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @Basic
    @Column(name = "telephone_number", nullable = true, length = 15)
    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    @Basic
    @Column(name = "ID", nullable = true, length = 10)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "user_label", nullable = true, length = 3)
    public String getUserLabel() {
        return userLabel;
    }

    public void setUserLabel(String userLabel) {
        this.userLabel = userLabel;
    }

    @Basic
    @Column(name = "origin_school", nullable = true, length = 30)
    public String getOriginSchool() {
        return originSchool;
    }

    public void setOriginSchool(String originSchool) {
        this.originSchool = originSchool;
    }

    @Id
    @Column(name = "haidaxue_sn", nullable = false, length = 15)
    public String getHaidaxueSn() {
        return haidaxueSn;
    }

    public void setHaidaxueSn(String haidaxueSn) {
        this.haidaxueSn = haidaxueSn;
    }

    @Basic
    @Column(name = "level", nullable = true)
    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    @Basic
    @Column(name = "user_type", nullable = true, length = 3)
    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    @Basic
    @Column(name = "user_pic", nullable = true)
    public byte[] getUserPic() {
        return userPic;
    }

    public void setUserPic(byte[] userPic) {
        this.userPic = userPic;
    }

    @Basic
    @Column(name = "highschool_name", nullable = true, length = 30)
    public String getHighschoolName() {
        return highschoolName;
    }

    public void setHighschoolName(String highschoolName) {
        this.highschoolName = highschoolName;
    }

    @Basic
    @Column(name = "college_name", nullable = true, length = 30)
    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HUsersEntity that = (HUsersEntity) o;

        if (userName != null ? !userName.equals(that.userName) : that.userName != null) return false;
        if (majorName != null ? !majorName.equals(that.majorName) : that.majorName != null) return false;
        if (departmentalName != null ? !departmentalName.equals(that.departmentalName) : that.departmentalName != null)
            return false;
        if (userAge != null ? !userAge.equals(that.userAge) : that.userAge != null) return false;
        if (currentLocation != null ? !currentLocation.equals(that.currentLocation) : that.currentLocation != null)
            return false;
        if (emailAddress != null ? !emailAddress.equals(that.emailAddress) : that.emailAddress != null) return false;
        if (password != null ? !password.equals(that.password) : that.password != null) return false;
        if (nickname != null ? !nickname.equals(that.nickname) : that.nickname != null) return false;
        if (telephoneNumber != null ? !telephoneNumber.equals(that.telephoneNumber) : that.telephoneNumber != null)
            return false;
        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (userLabel != null ? !userLabel.equals(that.userLabel) : that.userLabel != null) return false;
        if (originSchool != null ? !originSchool.equals(that.originSchool) : that.originSchool != null) return false;
        if (haidaxueSn != null ? !haidaxueSn.equals(that.haidaxueSn) : that.haidaxueSn != null) return false;
        if (level != null ? !level.equals(that.level) : that.level != null) return false;
        if (userType != null ? !userType.equals(that.userType) : that.userType != null) return false;
        if (!Arrays.equals(userPic, that.userPic)) return false;
        if (highschoolName != null ? !highschoolName.equals(that.highschoolName) : that.highschoolName != null)
            return false;
        if (collegeName != null ? !collegeName.equals(that.collegeName) : that.collegeName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = userName != null ? userName.hashCode() : 0;
        result = 31 * result + (majorName != null ? majorName.hashCode() : 0);
        result = 31 * result + (departmentalName != null ? departmentalName.hashCode() : 0);
        result = 31 * result + (userAge != null ? userAge.hashCode() : 0);
        result = 31 * result + (currentLocation != null ? currentLocation.hashCode() : 0);
        result = 31 * result + (emailAddress != null ? emailAddress.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (nickname != null ? nickname.hashCode() : 0);
        result = 31 * result + (telephoneNumber != null ? telephoneNumber.hashCode() : 0);
        result = 31 * result + (id != null ? id.hashCode() : 0);
        result = 31 * result + (userLabel != null ? userLabel.hashCode() : 0);
        result = 31 * result + (originSchool != null ? originSchool.hashCode() : 0);
        result = 31 * result + (haidaxueSn != null ? haidaxueSn.hashCode() : 0);
        result = 31 * result + (level != null ? level.hashCode() : 0);
        result = 31 * result + (userType != null ? userType.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(userPic);
        result = 31 * result + (highschoolName != null ? highschoolName.hashCode() : 0);
        result = 31 * result + (collegeName != null ? collegeName.hashCode() : 0);
        return result;
    }
}
