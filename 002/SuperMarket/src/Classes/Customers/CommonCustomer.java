package Classes.Customers;

import Classes.Actor;
import Interfaces.iReturnOrder;

public class CommonCustomer extends Actor implements iReturnOrder {

    public CommonCustomer(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return super.name;
    }

    @Override
    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }

    @Override
    public void setMakeOrder(boolean makeOrder) {
        super.isMakeOrder = makeOrder;
    }

    @Override
    public void setTakeOrder(boolean tookOrder) {
        super.isTakeOrder = tookOrder;
    }

    @Override
    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }

    @Override
    public Actor getActor() {
        return this;
    }

    @Override
    public boolean isReturnOrder() {
        return super.isReturnOrder;
    }

    @Override
    public void setReturnOrder(boolean returnOrder) {
        super.isReturnOrder = returnOrder;        
    }
    
}