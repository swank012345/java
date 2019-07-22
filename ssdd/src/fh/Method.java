package fh;

public class Method {
	Vehicle v;
	public static void main(String[] args) {
		
	Vehicle h = new Car();
		
         h.move();
         
	}
	public void setV(Vehicle v)
    {
      this.v = v;
    }      

}
class Vehicle{
	 void move() {
		int a=2;
		System.out.println("interface");
	}
}


class Car  extends Vehicle{
public	void move() {
		System.out.println("Car");
	}
	
}

class Vv  extends Vehicle{
	public	void move() {
		System.out.println("Vv");
	}
}