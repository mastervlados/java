package Classes;

import Interfaces.iActorBehaviour;
import Interfaces.iReturnOrder;

public abstract class Actor implements iActorBehaviour, iReturnOrder {
    protected String name;
    protected boolean isTakeOrder;
    protected boolean isMakeOrder;
    protected boolean isReturnOrder;

    public Actor(String name) {
        this.name = name;
    }

    public abstract String getName();

    public boolean isMakeOrder() {
        return isMakeOrder;
    }
}