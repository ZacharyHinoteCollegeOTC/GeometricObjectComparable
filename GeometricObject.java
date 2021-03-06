public abstract class GeometricObject implements Comparable<GeometricObject>{
    private String color = "white";
    private boolean filled;
    private java.util.Date dateCreated;

    /** Construct a default geometric object */
    protected GeometricObject() {
        dateCreated = new java.util.Date();
    }

    /** Construct a geometric object with color and filled value */
    protected GeometricObject(String color, boolean filled) {
        dateCreated = new java.util.Date();
        this.color = color;
        this.filled = filled;
    }

    /** Return color */
    public String getColor() {
        return color;
    }

    /** Set a new color */
    public void setColor(String color) {
        this.color = color;
    }

    /** Return filled. Since filled is boolean,
    *  the get method is named isFilled */
    public boolean isFilled() {
        return filled;
    }

    /** Set a new filled */
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    /** Get dateCreated */
    public java.util.Date getDateCreated() {
        return dateCreated;
    }

    @Override
    public String toString() {
        return "created on " + dateCreated + "\ncolor: " + color +
        " and filled: " + filled;
    }

    /** Abstract method getArea */
    public abstract double getArea();

    /** Abstract method getPerimeter */
    public abstract double getPerimeter();
    
    @Override
    public int compareTo (GeometricObject o) {
        if (getArea() > o.getArea())
            return 1;
        else if (getArea() < o.getArea())
            return -1;
        else
            return 0;
    }
    
    public String max(GeometricObject object2) {
        int compared = this.compareTo(object2);
        
        if (compared == 1) {
            return("The first object's area is greater than the second.");
        }
        else if (compared == 0) {
            return("The objects' area are equal.");
        }
        else {
            return("The second object's area is greater than the first.");
        }
        
        /*switch(object1.compareTo(object2)) {
            case 1:
                return("The first object's area is greater than the second.");
            case 0: 
                return("The objects' area are equal.");
            case -1:
                return("The second object's area is greater than the first.");
                break;
            
        }*/
        
    }
    
    
}
