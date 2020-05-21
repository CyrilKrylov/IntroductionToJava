package by.epam.module04.simple_class.task7;

/*Описать класс, представляющий треугольник. Предусмотреть методы для создания объектов, вычисления
площади, периметра и точки пересечения медиан*/

public class Triangle {
	
	private CoordinatePoint topA;
	private CoordinatePoint topB;
	private CoordinatePoint topC;
	private double triangleSideAB;
	private double triangleSideBC;
	private double triangleSideCA;
	
	public Triangle() {
		super();
		setDefaults();
	}
	
	
	public Triangle(CoordinatePoint topA, CoordinatePoint topB, CoordinatePoint topC) {
		super();
		
		double triangleSideAB;
		double triangleSideBC;
		double triangleSideCA;
		
		triangleSideAB = getDistanceBetweenPoints(topA, topB);
		triangleSideBC = getDistanceBetweenPoints(topB, topC);
		triangleSideCA = getDistanceBetweenPoints(topC, topA);
		
		if(isTriangle(triangleSideAB, triangleSideBC, triangleSideCA)) {
			System.out.println("Треугольник успешно создан");
			this.topA = topA;
			this.topB = topB;
			this.topC = topC;
			this.triangleSideAB = triangleSideAB;
			this.triangleSideBC = triangleSideBC;
			this.triangleSideCA = triangleSideCA;
		}else {
			System.out.println("Треугольника с заданными координатами не существует,"
					+ " сформирован треугольник по умолчанию");
			setDefaults();
		}
		
	}
	
	public double getPerimeter() {
		return this.triangleSideAB + this.triangleSideBC + this.triangleSideCA;
	}
	
	public double getAreaOfTriangle() {
		double halfmeter;
		
		halfmeter = getPerimeter()/2.0;
		
		return 	Math.sqrt(halfmeter 
				* (halfmeter - this.triangleSideAB)
				* (halfmeter - this.triangleSideBC)
				* (halfmeter - this.triangleSideCA));
	}
	
	public CoordinatePoint getMediansPointIntersection() {
		
	}
	
	private boolean isTriangle(double triangleSideAB, double triangleSideBC, double triangleSideCA) {				
		return (triangleSideAB + triangleSideBC) > triangleSideCA
			&& (triangleSideAB + triangleSideCA) > triangleSideBC
			&& (triangleSideBC + triangleSideCA) > triangleSideAB;		
	}
	
	private double getDistanceBetweenPoints(CoordinatePoint firstPoint, CoordinatePoint secondPoint) {
		return Math.sqrt(Math.pow(secondPoint.getX()-firstPoint.getX(), 2)
				+ Math.pow(secondPoint.getY()-firstPoint.getY(), 2));
	}
	
	private void setDefaults() {
		this.topA = new CoordinatePoint(1.0,0);
		this.topB = new CoordinatePoint(0,0);
		this.topC = new CoordinatePoint(0,1.0);
		this.triangleSideAB = 1;
		this.triangleSideBC = 1;
		this.triangleSideCA = Math.sqrt(2.0);
	}
	
	
}
