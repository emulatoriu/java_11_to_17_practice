package logic;

import shape.Circle;
import shape.Shape;

public class Application {
	public static void main(String[] args) {
		ShapeService shapeService = new ShapeService();
		Shape circle = new Circle(5);
		String result = shapeService.getShapeAnalysis(circle);
		System.out.println(result);		
	}
}
