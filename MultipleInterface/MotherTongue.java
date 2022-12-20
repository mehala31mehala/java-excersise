package MultipleInterface;

interface Language1 {
    public void myMethod(String name,String Origin);

}interface Language2{
    public void myOtherMethod(String name,String Origin);
}
class MotherTongue implements Language1,Language2{
    @Override
    public void myMethod(String name,String Origin) {
        System.out.println("Language1 name:"+name);
        System.out.println("Origin:"+Origin);
        System.out.println("World's Oldest living language is Tamil\n");
    }

    @Override
    public void myOtherMethod(String name,String Origin) {
        System.out.println("Language2 name:"+name);
        System.out.println("Origin:"+Origin);

    }
}
