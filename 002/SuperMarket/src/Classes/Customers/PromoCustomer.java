package Classes.Customers;

import Classes.Actor;
import Interfaces.iReturnOrder;

public class PromoCustomer extends Actor implements iReturnOrder {
    private String promoLine;

    public PromoCustomer(String name) {
        super(name);
        this.promoLine = getCurrentPromoLine();
    }

    public String getCurrentPromoLine() {
        return "Summer Sale -50%";
    }

    @Override
    public String getName() {
        return super.name;
    }

    public String getPromoLine() {
        return this.promoLine;
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
