package Interfaces;

import Classes.Actor;

public interface iQueueBehaviour {
    void takeInQueue(iActorBehaviour actor);
    void releaseFromQueue();
<<<<<<< HEAD
    void takeOrder();
    void giveOrder();
=======
    void makeOrder();
    void takeOrder();
>>>>>>> gb-002-homework
}