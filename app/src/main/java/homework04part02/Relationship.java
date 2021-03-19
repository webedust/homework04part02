package homework04part02;

/** Forms relationship between two people. */
public class Relationship
{
    // Variables
    private Person a;
    private Person b;
    // Valid types of relationships.
    public enum relType { MARRIAGE, SIBLING, PARENT, CHILD }
    // Type of relationship.
    private relType relationship;


    // Constructors
    public Relationship(Person a, Person b, relType relationship)
    {
        // Set relationship variable on associated people
        a.setRelationship(this);
        b.setRelationship(this);

        this.a = a;
        this.b = b;

        this.relationship = relationship;
    }

    // Getters
    public Person getA() { return a; }
    public Person getB() { return b; }
    /** Gets type of relationship. */
    public relType getRelationshipType() { return relationship; }

    // Setters
    /** Set relationship between two people.
     * @param relation  Type of relation this person is in.
     * @param a  Person A in relation.
     * @param b  Person B in relation. */
    public void setRelationship(relType relation, Person a, Person b)
    {
        // Ensure both params are not null.
        if (relation == null || a == null || b == null)
            throw new IllegalArgumentException();

        // Set relationship
        relationship = relation;
        this.b = b;
    }
}
