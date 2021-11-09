package com.company.Task1;


public class User {
    private String firstName;
    private String lastName;
    private int age;
    private String mobileNumber;
    private Address address;

    public void validate() throws FieldsAreIncorrect{
        String regex = "\\+?\\d*(\\(\\d{3}\\))?\\d*(-\\d+){0,2}";
        int numberСheck = 0;

        if (firstName == null | !firstName.matches("[a-zA-Z]+\\.?")){
            System.out.println("Введіть вірно ім'я");
            //firstName = String.valueOf(in.next());
        } else { numberСheck++; }

        if (lastName == null | !lastName.matches("[a-zA-Z]+\\.?")){
            System.out.println("Введіть вірно прізвище");
            //lastName = String.valueOf(in.next());
        } else { numberСheck++; }

        if (age == 0 | age <= 0) {
            System.out.println("Введіть вірно вік");
            //age = in.nextInt();
        } else { numberСheck++; }

        if (mobileNumber == null | !mobileNumber.matches(regex) | mobileNumber.length() < 9 | mobileNumber.length() > 13){
            System.out.println("Введіть вірно мобільний");
            //mobileNumber = String.valueOf(in.next());
        } else { numberСheck++; }

        if (address.validAddress() == false) {
            System.out.println("Введіть вірно адрес");
            //Address adr = new Address(String.valueOf(in.next()));
            //address = adr;
        } else { numberСheck++; }

        if (numberСheck == 5) {
            System.out.println("Відправлено " + httpCode.HTTP_CODE_200);
        } else {
            throw new FieldsAreIncorrect("Помилка при введені полів " + httpCode.HTTP_CODE_400);
        }
    }

    public User(String firstName, String lastName, int age, String mobileNumber, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.mobileNumber = mobileNumber;
        this.address = address;

    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", mobileNumber='" + mobileNumber + '\'' +
                ", address=" + address +
                '}';
    }

}
