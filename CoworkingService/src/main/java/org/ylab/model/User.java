package org.ylab.model;

public class User {
    private String firstName;
    private String lastName;
    private String password;
    private String phoneID;

    public User(String firstName, String lastName, String password, String phoneID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.phoneID = phoneID;
    }

    public String firstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String lastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String password() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String phoneID() {
        return phoneID;
    }

    public void setPhoneID(String phoneID) {
        this.phoneID = phoneID;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Уникальный номер пользователя");
        sb.append("\nФамилия: ").append(lastName);
        sb.append("\nИмя: ").append(firstName);
        sb.append("\nпароль: ").append(password);
        sb.append("\nтелефон: ").append(phoneID);
        return sb.toString();
    }
}
