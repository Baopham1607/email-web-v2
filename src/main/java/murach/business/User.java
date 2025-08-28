package murach.business;

import java.io.Serializable;

public class User implements Serializable {
    private String firstName;
    private String lastName;
    private String email;
    private String dateOfBirth;
    private String contactMethod;
    private String[] announcements;
    private String hearUs; // Thêm trường mới

    // Constructor mặc định (không có tham số)
    public User() {
        this.firstName = "";
        this.lastName = "";
        this.email = "";
        this.dateOfBirth = "";
        this.contactMethod = "";
        this.announcements = new String[0];
        this.hearUs = ""; // Khởi tạo giá trị mặc định
    }

    // Constructor có tham số
    public User(String firstName, String lastName, String email, String dateOfBirth, String contactMethod, String[] announcements, String hearUs) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
        this.contactMethod = contactMethod;
        this.announcements = announcements;
        this.hearUs = hearUs; // Gán giá trị
    }

    // Thêm getter và setter cho hearUs
    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    
    public String getDateOfBirth() { return dateOfBirth; }
    public void setDateOfBirth(String dateOfBirth) { this.dateOfBirth = dateOfBirth; }

    public String getContactMethod() { return contactMethod; }
    public void setContactMethod(String contactMethod) { this.contactMethod = contactMethod; }

    public String[] getAnnouncements() { return announcements; }
    public void setAnnouncements(String[] announcements) { this.announcements = announcements; }
    
    public String getHearUs() { return hearUs; }
    public void setHearUs(String hearUs) { this.hearUs = hearUs; }
}