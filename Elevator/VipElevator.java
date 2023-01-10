public class VipElevator extends Elevator
{
    VipElevator(int maxLoad){
        super(maxLoad);
    }
    boolean checkVip(Person newP){
        if (newP.isVip == true) return true;
        else return false;
    }
    void getIn(Person newP){
        boolean stead = checkVip(newP);
        if (stead == true) {
            super.getIn(newP);
        } else {
            System.out.println(newP.id+" not vip please use passenger elevator instead");
            System.exit(0);
        }
    }
}
