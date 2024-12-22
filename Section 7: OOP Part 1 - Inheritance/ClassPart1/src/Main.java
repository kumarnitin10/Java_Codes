public class Main {
    public static void main(String[] args) {
        Car car = new Car();

/* 1st and 2nd
        car.describeCar();
*/


        /* 3rd - Below statements will show error
        car.make("Porsche");
        car.model("Carrera");
        car.color("Red");
        System.out.println("make = " + car.make);
        System.out.println("model = " + car.model);
         */

        car.describeCar();

        car.setMake("Porsche");
        car.setModel("Carrera");
        car.setColor("black");
        car.setDoors(2);
        car.setConvertible(true);
        System.out.println("make = " + car.getMake());
        System.out.println("model = " + car.getModel());

        car.describeCar();

        Car targa = new Car();
        targa.setMake("Porsche");
        targa.setModel("Targa");
        targa.setDoors(2);
        targa.setConvertible(false);
        targa.setColor("red");
        targa.describeCar();



    }

}
