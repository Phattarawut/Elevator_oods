import java.util.ArrayList;
public class Elevator
{
    int floor = 1;
    int maxLoad;
    int nowWeight = 0;
    boolean statusDoor;
    int maxFloor = 10;
    ArrayList<Person> p = new ArrayList<Person>();
    void report(){
        System.out.println("number of people "+p.size());
        System.out.println("weight "+nowWeight);
        System.out.println("now floor is "+floor);
    }
    void getIn(Person newP){
        p.add(newP);
        nowWeight += newP.weight;
        if(nowWeight > maxLoad){
            System.out.println("Overload please getout the Elevator");
            getOut(newP);
            System.exit(0);
        }
        report();
    }
    void getOut(Person outP){
        p.remove(outP);
        nowWeight -= outP.weight;
        report();
    }
    void openDoor(){
        statusDoor = true;
        System.out.println("Door is open");
    }
    void closeDoor(){
        statusDoor = false;
        System.out.println("Door is close");
    }
    void selectFloor(int rqFloor){
        if(rqFloor <= maxFloor){
            floor = rqFloor;
            System.out.println("now floor is "+floor);
        }else System.out.println("");
    }
    void holdDoor(){
        statusDoor = true;
    }
    Elevator(int maxLoad){
        this.maxLoad = maxLoad;
    }
}