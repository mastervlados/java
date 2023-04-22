import Classes.Market;
import Classes.Customers.CommonCustomer;
import Classes.Customers.PromoCustomer;
import Classes.Customers.VIPCustomer;
import Interfaces.iActorBehaviour;

public class App {
    
    public static void main(String[] args) throws Exception {
        Market market = new Market();
        iActorBehaviour item1 = new CommonCustomer("Boris");
        iActorBehaviour item2 = new VIPCustomer("Vladislav", 3366);
        iActorBehaviour item3 = new CommonCustomer("Dasha");
        iActorBehaviour item4 = new PromoCustomer("Masha");
        iActorBehaviour item5 = new PromoCustomer("Vera");
        iActorBehaviour item6 = new PromoCustomer("Esenia");
        iActorBehaviour item7 = new PromoCustomer("Denis");

        market.acceptToMarket(item1);
        market.acceptToMarket(item2);
        market.acceptToMarket(item3);
        market.acceptToMarket(item4);
        market.acceptToMarket(item5);
        market.acceptToMarket(item6);
        market.acceptToMarket(item7);
    
        market.update();

    }
}