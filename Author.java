

public class Author
{
    private String name;
    private int age;
    public Author(String nm, int ag)
    {
        this.name = nm;
        this.age = ag;
    }
    public String toString() {
        return "The person's name is " + name + " and they are " + age + " years old.";
    }
}
