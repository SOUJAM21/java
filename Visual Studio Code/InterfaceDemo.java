interface ICarDetails{
    public int getmotorSpeed();
}

interface ICar{
    public void start();
    public void stop();
}

class TeslaCar implements ICar,ICarDetails{
    public void start(){
        System.out.println("Starting Tesla");
    }

    public void stop(){
        System.out.println("Stopping Tesla");
    }

    public int getmotorSpeed(){
        return 50;
    }
}

class BMWCar implements ICar,ICarDetails{
    public void start(){
        System.out.println("Starting BMW");
    }

    public void stop(){
        System.out.println("Stopping BMW");
    }

     public int getmotorSpeed(){
        return 100;
    }
}


class carMaker{
    public ICar makeCar(int option){
        if(option==1){
            TeslaCar t1 = new TeslaCar();
            return t1;
        }
        else if(option == 2){
            BMWCar b1 = new BMWCar();
            return b1;
        }
        else{
            return null;
        }
    }
}


public class InterfaceDemo{
    public static void main(String args[]){
        carMaker c1 = new carMaker();

        ICar car = c1.makeCar(1);

        car.start();
        car.stop();

        ICarDetails t1 = new TeslaCar();
       int motorSpeed = t1.getmotorSpeed();

       System.out.println("Speed = " + motorSpeed);
    }
}