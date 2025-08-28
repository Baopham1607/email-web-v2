package murach.business;

import java.io.Serializable;

public class User implements Serializable {
    private String firstName;
    private String lastName;
    private String email;
    private String dateOfBirth;
    private String contactMethod;
    private String[] announcements;
    private String hearUs; // Dòng mới

    public User() {
        this.firstName = "";
        this.lastName = "";
        this.email = "";
        this.dateOfBirth = "";
        this.contactMethod = "";
        this.announcements = new String[0];
        this.hearUs = ""; // Dòng mới
    }

    public User(String firstName, String lastName, String email, String dateOfBirth, String contactMethod, String[] announcements, String hearUs) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
        this.contactMethod = contactMethod;
        this.announcements = announcements;
        this.hearUs = hearUs; // Dòng mới
    }
    
    // Các getters và setters khác
    public String getHearUs() {
        return hearUs;
    }

    public void setHearUs(String hearUs) {
        this.hearUs = hearUs;
    }
}