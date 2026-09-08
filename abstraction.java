public class abstraction {
    public static void main(String[] args) {
        Payments obj = new upi();
        obj.MakePayment();
        Payments.display();

        Payments obj1 = new CreditCard();
        obj1.MakePayment();
        Payments.display();
        
    }
}


    interface Payments {
        int a =10;  // this is public, static and final by default
        void MakePayment();  // this method is abstract and public.
        static void display(){   //this is static method or can be default method also
            System.out.println("payment successfully done");
        }
    }

    class upi implements Payments {
        public void MakePayment() {
            System.out.println("Payment made using UPI");
        }
    }
        
    class CreditCard implements Payments {
        public void MakePayment() {
            System.out.println("Payment made using Credit Card");
        }
    }
    

