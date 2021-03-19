package homework04part02;

public class Creator
{
    public Person[] create()
    {
        // People
        Person a = new Person("Alpha", "1");
        Person b = new Person("Bravo", "2");
        Person c = new Person("Charlie", "3");
        Person d = new Person("Delta", "4");

        // Relationships
        Relationship r1 = new Relationship(a, b, Relationship.relType.MARRIAGE);
        Relationship cd = new Relationship(c, d, Relationship.relType.SIBLING);

        return new Person[] { a, b, c, d };
    }
}
