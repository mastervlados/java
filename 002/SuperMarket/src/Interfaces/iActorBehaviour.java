package Interfaces;

import Classes.Actor;

public interface iActorBehaviour {
    void setMakeOrder(boolean makeOrder);
    void setTakeOrder(boolean tookOrder);
    boolean isMakeOrder();
    boolean isTakeOrder();
    Actor getActor();
}