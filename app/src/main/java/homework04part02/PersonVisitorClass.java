package homework04part02;

import com.google.common.graph.MutableGraph;

public class PersonVisitorClass implements PersonVisitor
{
    /** Visits person and prints their name and relationship status.
     * @param person  Person to visit. */
    public void visit(Person person)
    {
        Relationship rel = person.getRelationship();
        if (rel == null)
            System.out.println(person.getFullName() + " is not related to anybody.");
        else
            System.out.println(person.getFullName()
                    + " -- " + rel.getRelationshipType().toString() + " -- "
                    + rel.getB().getFullName());
    }

    /** Counts all relationships of each type.
     * @param person  Person to visit. */
    public void countRelationships(Person person, int marriages, int siblings, int children, int parents)
    {
        Relationship rel = person.getRelationship();
        if (rel != null)
        {
            System.out.println("Relationship isn't null.");
            switch (rel.getRelationshipType())
            {
                case MARRIAGE -> marriages++;
                case SIBLING -> siblings++;
                case CHILD -> children++;
                case PARENT -> parents++;
            }
        }
    }

    /** Visits person and adds their information to the output graph.
     * @param person  Person to visit.
     * @param output  Graph to output results to.*/
    public void graph(Person person, MutableGraph<Person> output)
    {
        Relationship rel = person.getRelationship();

        if (rel != null)
        {
            Person a = rel.getA();
            Person b = rel.getB();

            output.putEdge(a, b);
        }
    }
}
