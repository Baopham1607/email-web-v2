package murach.business;

import java.io.Serializable;

public class User implements Serializable {
    private String firstName;
    private String lastName;
    private String email;
    private String dateOfBirth;
    private String contactMethod;
    private String[] announcements;

    public User() {
        this.firstName = "";
        this.lastName = "";
        this.email = "";
        this.dateOfBirth = "";
        this.contactMethod = "";
        this.announcements = new String[0];
    }

    public User(String firstName, String lastName, String email, String dateOfBirth, String contactMethod, String[] announcements) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
        this.contactMethod = contactMethod;
        this.announcements = announcements;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getContactMethod() {
        return contactMethod;
    }

    public void setContactMethod(String contactMethod) {
        this.contactMethod = contactMethod;
    }

    public String[] getAnnouncements() {
        return announcements;
    }

    public void setAnnouncements(String[] announcements) {
        this.announcements = announcements;
    }
}