public class Cube {

    private int side;

    // No-argument constructor
    public Cube() {
        this.side = 1; // Default side length is 1
    }

    // Single-argument constructor
    public Cube(int side) {
        if (side <= 0) {
            throw new IllegalArgumentException("Side length must be positive!");
        }
        this.side = side;
    }

    // Getter for side
    public int getSide() {
        return this.side;
    }

    // Setter for side
    public void setSide(int side) {
        if (side <= 0) {
            throw new IllegalArgumentException("Side length must be positive!");
        }
        this.side = side;
    }

    // Method to calculate the volume of the cube
    public int calculateVolume() {
        return this.side * this.side * this.side;
    }

    // Method to calculate the surface area of the cube
    public int calculateSurfaceArea() {
        return 6 * this.side * this.side;
    }
}
/* public class Cube {
    private int side;

    public Cube() {
        this.side = 1;
    }

    public Cube(int a) {
        if (a <= 0) {
            throw new IllegalArgumentException("Side must be a positive integer.");
        }
        this.side = a;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int a) {
        if (a <= 0) {
            throw new IllegalArgumentException("Side must be a positive integer.");
        }
        this.side = a;
    }

 */

/*
    public int getSide() {
        return this.side;
    }

    public int getSide(int a){
        return this.side = a;
    }

 */


