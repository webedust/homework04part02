package homework04part02;

public class Person implements PersonAcceptor
{
    // Variables
    private final String firstName;
    private final String surname;
    // Relationship this person is in. Set from the Relationship object.
    private Relationship rel;


    // Constructors
    /** Default constructor. */
    public Person(String firstName, String surname)
    {
        this.firstName = firstName;
        this.surname = surname;
    }

    // Getters
    public String getFirstName() { return firstName; }
    public String getSurname() { return surname; }
    /** @return First name and surname of person with space between. */
    public String getFullName() { return firstName + " " + surname; }
    public Relationship getRelationship() { return rel; }

    // Setters
    public void setRelationship(Relationship rel) { this.rel = rel; }

    // Methods
    public void accept (PersonVisitor visitor)
    {
        visitor.visit(this);
    }
}
