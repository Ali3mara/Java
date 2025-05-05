class Shape {
    int width;
    int height;

    public Shape(int width, int height){
        this.width = width;
        this.height = height;
    }

    public void getArea() {
        System.out.println(width * height);
    }
}
