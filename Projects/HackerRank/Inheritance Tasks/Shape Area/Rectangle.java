class Rectangle extends Shape {
    public Rectangle(int width, int height){
        super(width, height);
    }

    @Override
    public void getArea() {
        System.out.println(width * height);
    }
    
}
