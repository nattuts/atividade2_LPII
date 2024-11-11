public class Cylinder {
    private double height;
    private Circle circle;

    public Cylinder(double radius, double height, String color){
        this.circle = new Circle(radius, color);
        this.height = height;
    }

    public double getHeight(){
        return height;
    }
    public void setHeight(double height){
        this.height = height;
    }

    public double getRadius(){
        return circle.getRadius();
    }
    public void setRadius(double radius){
        circle.setRadius(radius);
    }

    public String getColor(){
        return circle.getColor();
    }
    public void setColor(String color){
        circle.setColor(color);
    }

    public double getVolume(){
        return circle.getArea() * height;
    }
}
