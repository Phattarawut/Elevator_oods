public class Demo
{
    public static void test(){
        /*
        Passenger pe = new Passenger(800);
        Person p = new Person(1, 65);
        pe.openDoor();
        pe.getIn(p);
        pe.closeDoor();
        pe.selectFloor(3);
        pe.openDoor();
        pe.getOut(p);
        */
        VipElevator ve = new VipElevator(1200);
        Person p = new Person(1, 13000, true);
        Person p1 = new Person(1, 74, false);
        ve.openDoor();
        ve.getIn(p);
        //ve.getIn(p1);
        ve.closeDoor();
        ve.selectFloor(3);
        ve.openDoor();
        ve.getOut(p);
    }
}
