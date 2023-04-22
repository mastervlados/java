package Classes;

import Interfaces.iActorBehaviour;
<<<<<<< HEAD

public abstract class Actor implements iActorBehaviour {
    protected String name;
    protected boolean isTakeOrder;
    protected boolean isMakeOrder;
    
=======
import Interfaces.iReturnOrder;

public abstract class Actor implements iActorBehaviour, iReturnOrder {
    protected String name;
    protected boolean isTakeOrder;
    protected boolean isMakeOrder;
    protected boolean isReturnOrder;

>>>>>>> gb-002-homework
    public Actor(String name) {
        this.name = name;
    }

<<<<<<< HEAD
    public abstract String getName(); 

=======
    public abstract String getName();

    public boolean isMakeOrder() {
        return isMakeOrder;
    }
>>>>>>> gb-002-homework
}