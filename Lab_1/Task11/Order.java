package com.company.Task11;

public class Order {
    Taxi taxi;

    final private double costkm = 50;
    private double price;
    private double way;

    public void price(){

        price = costkm * way;
    }

    public void order (final Taxi taxi ){

        if (taxi.driver.ready == true){
            System.out.println("Order started!\n" +"Price = " + price +"\n" + "Your driver is "  + taxi.driver.name +"." +
                    " Wait for " + taxi.colour +" "+ taxi.brand + " with numberplate: " + taxi.numberplate + ".\n");
            taxi.driver.ready = false;
        }
        else
            System.out.println("This driver is busy!\n" + "choose another or wait if all busy.\n");

    }
    public void finish (final Taxi taxi){

        if (taxi.driver.ready == false) {
            taxi.driver.ready = true;
            System.out.println("Order canseled!\n");
        }

    }


    public static void main(final String[] args) {

        final Taxi taxi1 = new Taxi("Kia", 1234 ,"black");
        final Taxi taxi2 = new Taxi("Ford",4321, "white");
        final Taxi taxi3 = new Taxi("Mitsubishi",1235,"silver");

        final Driver d1 = new Driver("Vitalik",true);
        final Driver d2 = new Driver("Ivan",true);
        final Driver d3 = new Driver("Sasha",true);

        taxi1.driver = d1;
        taxi2.driver = d3;
        taxi3.driver = d2;

        final Order o1 = new Order();
        final Order o2 = new Order();

        o1.way = 20;
        o1.price();
        o1.order(taxi1);
        o2.way = 30;
        o2.price();
        o2.order(taxi1);
        o1.finish(taxi1);
        o2.way = 15;
        o2.price();
        o2.order(taxi3);
        o1.way = 12;
        o1.price();
        o1.order(taxi2);


    }
}
