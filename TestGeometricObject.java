

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Zachary Hinote
 */
public class TestGeometricObject {
    public static void main(String[] args) {
        GeometricObject geoObject1 = new Circle(5);
        GeometricObject geoObject2 = new Rectangle (10, 7);
    
        System.out.println("The two objects have the same area? " + equalArea(geoObject1, geoObject2));
        
        //Display circle
        displayGeometricObject(geoObject1);
        
        //Display rectangle
        displayGeometricObject(geoObject2);
        
        System.out.println(geoObject1.max(geoObject2));
        
    }
    
    public static boolean equalArea(GeometricObject object1, GeometricObject object2) {
        return object1.getArea() == object2.getArea();
    }
    
    public static void displayGeometricObject(GeometricObject object) {
        System.out.println();
        System.out.println("The area is " + object.getArea());
        System.out.println("The perimeter is " + object.getPerimeter());
    }
    
}
