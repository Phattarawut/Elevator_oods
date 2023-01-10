public class Person
{
    int weight;
    int id;
    boolean isVip = false;
    Person(int id, int weight){
        this.id = id;
        this.weight = weight;
    }
    Person(int id, int weight, boolean isVip){
        this.id = id;
        this.weight = weight;
        this.isVip = isVip;
    }
}