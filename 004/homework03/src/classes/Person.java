package classes;

public class Person {
    private String lastName;
    private String firstName;
    private String patronymic;
    private String birthday;
    private Integer phoneNumber;
    private char gender;

    public Person(String userTerm) {
        String[] data = this.getUserData(userTerm);
        this.setLastName(data[0]);
        this.setFirstName(data[1]);
        this.setPatronymic(data[2]);
        this.setBirthday(data[3]);
        this.setPhoneNumber(data[4]);
        this.setGender(data[5]);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.validateTerm(firstName);
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.validateTerm(lastName);
        this.lastName = lastName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.validateTerm(patronymic);
        this.patronymic = patronymic;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        if (!birthday.matches("^(0?[1-9]|[12][0-9]|3[01])\\.(0?[1-9]|1[012])\\.((19|20)\\d\\d)$")) {
            throw new RuntimeException("Incorrect the date format, expected dd.mm.yyyy!");
        } else {
            this.birthday = birthday;
        }
    }

    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        try {
            this.phoneNumber = Integer.valueOf(phoneNumber);
        } catch (Exception e) {
            throw new RuntimeException("Incorrect format of the phone number! " + e.getMessage());
        }
    }

    public char getGender() {
        return gender;
    }

    public void setGender(String gender) {
        if ((gender.equalsIgnoreCase("m") || 
        gender.equalsIgnoreCase("f")) && 
        gender.length() == 1) {
            this.gender = gender.toLowerCase().charAt(0);
        } else {
            throw new RuntimeException("To set the gender you have to type <f> or <m>!");
        }
    }
    
    private String[] getUserData(String userTerm) {
        String[] data = userTerm.split(" ");
        if (data.length != 6) {
            throw new RuntimeException("All parameters have to be!");
        }
        return data;
    }

    private void validateTerm(String term) {
        if (!term.matches("^[A-z\u0410-\u044F-']+$")) {
            throw new RuntimeException("Check entered FCs, you can use A-z, А-я and also ', - symbols.");
        }
    }
}
