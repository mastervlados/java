package Classes;

import java.util.ArrayList;
import java.util.List;

import Classes.Customers.PromoCustomer;
import Interfaces.iActorBehaviour;
import Interfaces.iLogger;
import Interfaces.iMarketBehaviour;
import Interfaces.iQueueBehaviour;
import Loggers.LoggerTxt;
import Loggers.LoggerXML;

public class Market implements iMarketBehaviour, iQueueBehaviour {
    private List<iActorBehaviour> queue;
    private static int numberOfCurrentCustomerInCurrentPromo;
    private static int maxNumberOfCustomersInCurrentPromo = 3;
    private static iLogger loggerTxt; 
    private static iLogger loggerXML; 

    public Market() {
        this.queue = new ArrayList<iActorBehaviour>();
        loggerTxt = new LoggerTxt("Marshal");
        loggerXML = new LoggerXML("JetSkinner");
    }

    private boolean registerCustomerInCurrentPromo() {
        ++numberOfCurrentCustomerInCurrentPromo;
        if (numberOfCurrentCustomerInCurrentPromo <= maxNumberOfCustomersInCurrentPromo) {
            return true;
        }
        return false;
    }

    public int getNumberOfCurrentCustomerInCurrentPromo() {
        return numberOfCurrentCustomerInCurrentPromo;
    }

    public void updateNumberOfCurrentCustomerInCurrentPromo() {
        --numberOfCurrentCustomerInCurrentPromo;
    }

    @Override
    public void acceptToMarket(iActorBehaviour actor) {
        String message = actor.getActor().getName() + " пришел в магазин";
        System.out.println(message);
        takeInQueue(actor);
        /**
         * Loggers
         */
        loggerTxt.writeLog(loggerTxt.getMainLogger(), message);
        loggerXML.writeLog(loggerXML.getMainLogger(), message);
    }

    @Override
    public void releaseFromMarket(List<Actor> actors) {
        for (Actor actor : actors) {
            String message = actor.getName() + " ушел из магазина";
            System.out.println(message);
            this.queue.remove(actor);
            /**
             * Loggers
             */
            loggerTxt.writeLog(loggerTxt.getMainLogger(), message);
            loggerXML.writeLog(loggerXML.getMainLogger(), message);
        }
    }

    @Override
    public void update() {
        makeOrder();
        takeOrder();
        releaseFromQueue();
    }

    @Override
    public void makeOrder() {
        for (iActorBehaviour actor : queue) {
            /*
             * If a customer doesn't get an order
             * He/She makes a new one
             */
            if(!actor.isTakeOrder()) {
                if (actor instanceof PromoCustomer 
                && !registerCustomerInCurrentPromo()) {
                    actor.setMakeOrder(false);
                    String message = actor.getActor().getName() + " было отказано в обслуживании из за превышения числа участников акции";
                    System.out.println(message);
                    /**
                     * Loggers
                     */
                    loggerTxt.writeLog(loggerTxt.getReturnLogger(), message);
                    loggerXML.writeLog(loggerXML.getReturnLogger(), message);
                } else {
                    if (Math.random() < 0.5) {
                        actor.getActor().setReturnOrder(true);
                        String message = actor.getActor().getName() + " оформил заявление на возврат товара";
                        System.out.println(message);

                        /*
                         * If it was PromoCustomer we can cancel 
                         * his/her registration number
                         */
                        if (actor instanceof PromoCustomer) {
                            updateNumberOfCurrentCustomerInCurrentPromo();
                        }

                        /**
                        * Loggers
                        */
                        loggerTxt.writeLog(loggerTxt.getReturnLogger(), message);
                        loggerXML.writeLog(loggerXML.getReturnLogger(), message);
                    } else {
                        actor.setMakeOrder(true);
                        String message = actor.getActor().getName() + " сделал заказ"; 
                        System.out.println(message);
                        /**
                         * Loggers
                         */
                        loggerTxt.writeLog(loggerTxt.getMainLogger(), message);
                        loggerXML.writeLog(loggerXML.getMainLogger(), message);
                    }
                }
                
            }
        }
        
    }

    @Override
    public void releaseFromQueue() {
        List<Actor> releaseActors = new ArrayList<>();

        for (iActorBehaviour actor : queue) {
            releaseActors.add(actor.getActor());
            String message = actor.getActor().getName() + " ушел из очереди";
            System.out.println(message);

            /**
             * Loggers
             */
            loggerTxt.writeLog(loggerTxt.getMainLogger(), message);
            loggerXML.writeLog(loggerXML.getMainLogger(), message);
        }
        releaseFromMarket(releaseActors);
    }

    @Override
    public void takeInQueue(iActorBehaviour actor) {
        this.queue.add(actor);
        String message = actor.getActor().getName() + " встал в очередь";
        System.out.println(message);

        /**
        * Loggers
        */
        loggerTxt.writeLog(loggerTxt.getMainLogger(), message);
        loggerXML.writeLog(loggerXML.getMainLogger(), message);
    }

    @Override
    public void takeOrder() {
        for (iActorBehaviour actor : queue) {
            /*
             * If customer made an order
             * He/She gets it!
             */
            String message = new String();
            if (actor.isMakeOrder()) {
                actor.setTakeOrder(true);
                message = actor.getActor().getName() + " получил свой заказ";
                System.out.println(message);
                /**
                 * Loggers
                 */
                loggerTxt.writeLog(loggerTxt.getMainLogger(), message);
                loggerXML.writeLog(loggerXML.getMainLogger(), message);
            } else if (actor.getActor().isReturnOrder()) {
                message = actor.getActor().getName() + " вернул товар и получил деньги обратно";
                System.out.println(message);
                /**
                 * Loggers
                 */
                loggerTxt.writeLog(loggerTxt.getReturnLogger(), message);
                loggerXML.writeLog(loggerXML.getReturnLogger(), message);
            }
        }
        
    }
}