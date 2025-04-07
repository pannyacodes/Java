class Square{
    int sideLength;

    int getSideLength(){
        return sideLength;
    }

    void setSideLength(int s){
        sideLength = s;
    }

    int getArea(){
        int area = sideLength * sideLength;
        return area;
    }

    int getPerimeter(){
        int perimeter = 4 * sideLength;
        return perimeter;
    }
}

public class Q2 {
    public static void main(String[] args) {
        Square s1 = new Square();
        s1.setSideLength(12);
        System.out.println("the area of the square is " + s1.getArea());
        System.out.println("the perimeter of the square is " + s1.getPerimeter());
    }
}
