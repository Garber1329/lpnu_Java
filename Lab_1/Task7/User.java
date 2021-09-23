package com.company.Task7;

public class User {
    private final String firstName, lastName, email;
    private final Integer age;

    public User(final String firstName, final String lastName, final Integer age, final String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
    }
    public String getEmail() {
        return email;
    }
    @Override
    public boolean equals(final Object ob) {
        if (ob == null)
            return false;
        if (this == ob)
            return true;
        if (getClass() != ob.getClass())
            return false;
        final User e = (User) ob;
        return (this.getEmail() == e.getEmail());
    }

    @Override
    public int hashCode()
    {
        final int PRIME = 31;
        final int result = PRIME * getEmail().hashCode() + age ;
        return result;
    }

    public static void main(final String[] args) {
        final User Ob1 = new User ("Ivan","Ivanov",21,"p1pm@email");
        final User Ob2 = new User ("Sasha","Sashkov",31,"sgsgf@emal");
        System.out.println (Ob1.equals(Ob2));
        System.out.println (Ob2.hashCode());
        System.out.println (Ob1.hashCode());
    }
}
