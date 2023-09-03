package immutable;

public final class Student {
    private final String firstName;
    private final String lastName;

    public Student(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Student setFirstName(String firstName){
        return new Student(firstName, lastName);
    }

    public Student setLastName(String lastName){
        return new Student(firstName, lastName);
    }
}
