package Interfaces;

import Classes.Actor;

public interface iActorBehaviour {
    void setMakeOrder(boolean makeOrder);
<<<<<<< HEAD
    void setTakeOrder(boolean pickUpOrder);
=======
    void setTakeOrder(boolean tookOrder);
>>>>>>> gb-002-homework
    boolean isMakeOrder();
    boolean isTakeOrder();
    Actor getActor();
}