package logic;

import shape.Circle;
import shape.Shape;
import shape.Triangle;
import shape.Rectangle;

public class ShapeService {
	public String getShapeAnalysis(Shape shape) {
		/*
		 * if(shape instanceof Circle circle) return
		 * "Circle with radius %f".formatted(circle.radius()); if(shape instanceof
		 * Rectangle rectangle) return
		 * "Rectangle with width %d and length %d".formatted(rectangle.width(),
		 * rectangle.length()); if(shape instanceof Triangle triangle) return
		 * "Triangle with height %d".formatted(triangle.height()); return
		 * "Unexpected shape";
		 */
		return switch (shape) {
		case Circle circle -> "Circle with radius %f".formatted(circle.radius());
		case Rectangle rectangle ->
			"Rectangle with width %d and length %d".formatted(rectangle.width(), rectangle.length());
		case Triangle triangle -> "Triangle with height %d".formatted(triangle.height());
		default -> "Unexpected shape";
		};
	}

}
