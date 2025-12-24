package basic.array.arrayAdvance;

class CarEngineRunner{
	public static void main(String[] args) {
		//String name , int wheels, String color. String features, String fuelType

		Car car=new Car("toyato",4,"White","","Petrol");

		//int engineCC, String engnieType , String name
		Engine engine = new Engine(1999," twin turbo","toyato");
		car.setEngine(engine);

		System.out.println(" Car details--------------------");
		System.out.println(car.getName());
		System.out.println(car.getWheels());
		System.out.println(car.getColor());
		System.out.println(car.getFuelType());


		Engine engine1=engine;
		System.out.println("Engine Details-------------------------");
		System.out.println(engine.getEngineCC());
		System.out.println(engine.getEngineName());
		System.out.println(engine.getEngineType());
	}
}