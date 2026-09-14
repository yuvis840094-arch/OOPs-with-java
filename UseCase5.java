public class UseCase5 {
    public static void main(String[] args) {
        TicketCounter counter = new TicketCounter();

        Thread t1 = new Thread(counter);
        Thread t2 = new Thread(counter);
        t1.setName("counter1");
        t2.setName("counter2");
        t2.setPriority(10);
        t1.start();
        t2.start();
    }
    
}

class TicketCounter implements Runnable{
    int availableTicket = 3;

    synchronized void bookTicket(){
        if(availableTicket > 0){
            availableTicket -= 1;
            System.out.println("Ticket booked by " + Thread.currentThread().getName());
            System.out.println("Left ticket are " + availableTicket);
        }
        else{
            System.out.println("Tickets are sold out");
        }

    }

    public void run(){
        try{
        Thread.sleep(1000);   // sleep method is used to pause the running code for a while.
        }
        catch(InterruptedException e){
            System.out.println(e);
        }
        while(availableTicket > 0){
            bookTicket();

        }

    }
}
