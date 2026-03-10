

public class Wall {

    private double width;
    private double height;

    // Constructor
    public Wall(double width, double height) {
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }

        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    // getWidth
    public double getWidth(){
        return width;
    }

    // getHeight
    public double getHeight() {
        return height;
    }

    // setWidth
    public void setWidth(double width) {
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }
    }

    // setHeight
    public void setHeight(double height) {
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    // getArea
    public double getArea() {
        return width * height;
    }
}