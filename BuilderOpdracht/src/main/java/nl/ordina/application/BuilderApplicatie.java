package nl.tjonahen.application;

import nl.tjonahen.Engineer;
import nl.tjonahen.car.part.Car;
import nl.tjonahen.car.part.CarBuilder;
import nl.tjonahen.plane.part.Plane;
import nl.tjonahen.plane.part.PlaneBuilder;

public class BuilderApplicatie {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		if ("car".equals(args[0])) {
			CarBuilder carBuilder = new CarBuilder();
			
			Engineer engineer = new Engineer(carBuilder);
			engineer.construct();
			
			Car car = carBuilder.getCar();
			car.toString();
		}
		if ("plane".equals(args[0])) {
			PlaneBuilder planeBuilder = new PlaneBuilder();
			
			Engineer engineer = new Engineer(planeBuilder);
			engineer.construct();
			
			Plane plane = planeBuilder.getPlane();
			plane.toString();
		}

	}

}
