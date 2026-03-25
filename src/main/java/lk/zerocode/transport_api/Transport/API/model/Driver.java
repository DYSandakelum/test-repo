package lk.zerocode.transport_api.Transport.API.model;

public class Driver {

    private Long DriveId;
    private String Name;
    private int Age;
    private String Mobile;
    private String Email;

    public Long getDriveId() {
        return DriveId;
    }

    public void setDriveId(Long driveId) {
        DriveId = driveId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getMobile() {
        return Mobile;
    }

    public void setMobile(String mobile) {
        Mobile = mobile;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }
}
