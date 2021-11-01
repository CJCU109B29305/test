class A{

    void Cal_area(int r){
        double area ;
        double pi = 3.14159;
        area = r * r * r * pi * 4 / 3 ; 
        System.out.println("半徑 = "+ r);
        System.out.println("球體面積 = "+Math.round(area * 10.0) / 10.0);
    }
    void Cal_area(int x, int y,int z){
        int area;
        area = ((x * y)+(x * z)+(y * z))*2;
        System.out.println("長 = "+x+" , 寬 = "+y+" , 高 = "+z);
        System.out.println("立方體表面積 = "+area);
    }
}
public class Class01{
    public static void main(String[]argv){
        A B = new A();
        B.Cal_area(10);
        B.Cal_area(4,5,6);
    }
}