package Entity;

/**
 * Created by panyunyi on 2017/5/2.
 */
public class HUser {

    private String userName;
    private String schoolName;
    private String majorName;
    private String departName;
    private int userAge;
    private String currentLocation;
    private String emailAddress;
    private String passWord;
    private String nickName;
    private String teleNumber;
    private String ID;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getUserLable() {
        return userLable;
    }

    public void setUserLable(String userLable) {
        this.userLable = userLable;
    }

    public String getOriginSchool() {
        return originSchool;
    }

    public void setOriginSchool(String originSchool) {
        this.originSchool = originSchool;
    }

    public String getHaidaxueSn() {
        return haidaxueSn;
    }

    public void setHaidaxueSn(String haidaxueSn) {
        this.haidaxueSn = haidaxueSn;
    }

    private String userLable;
    private String originSchool;
    private String haidaxueSn;//嗨大学专属码

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getMajorName() {
        return majorName;
    }

    public void setMajorName(String majorName) {
        this.majorName = majorName;
    }

    public String getDepartName() {
        return departName;
    }

    public void setDepartName(String departName) {
        this.departName = departName;
    }

    public int getUserAge() {
        return userAge;
    }

    public void setUserAge(int userAge) {
        this.userAge = userAge;
    }

    public String getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(String currentLocation) {
        this.currentLocation = currentLocation;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getTeleNumber() {
        return teleNumber;
    }

    public void setTeleNumber(String teleNumber) {
        this.teleNumber = teleNumber;
    }



}


