package Interfacepolygon;

interface Polygon {
    public abstract void  Volume(int l,int w,int h);
}
class Rectangle implements Polygon{
    public void  Volume(int l,int w,int h){
        System.out.println("volume of the rectangle is:"+l*w*h);
    }
}

