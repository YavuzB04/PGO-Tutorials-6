public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car("Toyota", "Camry", 2020, 500, 20);
        System.out.println("Efektywność paliwowa samochodu: " + car.calculateFuelEfficiency() + " miles per gallon");

        Vehicle truck = new Truck("Mercedes-Benz", "Actros L", 2019, 800, 40, 5);
        System.out.println("Efektywność paliwowa ciężarówki: " + truck.calculateFuelEfficiency() + " miles per gallon");
    }
}
