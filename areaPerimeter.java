class triangle
{
    int l,b,h;
    void triangle1()
    {
        float s=(l+b+h)/2;
        float area=(float)Math.sqrt(s*(s-l)*(s-b)*(s-h));
        float peri=l+b+h;
        
       System.out.println("area of Triangle="+this.area);
       System.out.println("perimeter of triangle="+this.peri);
    }
}
public class areaPerimeter {
public static void main(String[] args) {
    System.out.println(" print area And perimeter use of condtructor --------");
    triangle obj=new triangle();
    obj.l=2;
    obj.b=3;
    obj.h=4;
    obj.triangle1();
    //obj.display();
    
}
    
}
