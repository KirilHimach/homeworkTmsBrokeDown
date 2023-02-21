package homeworkSevenShapes;

/*
S=?bh
P=a+b+�  - ������� ������
 */
public class Triangle extends Shape{
    private int sideA;
    private int sideB;
    private int sideC;
    private int sideH;

    public Triangle(int sideA, int sideB, int sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public Triangle(int sideB, int sideH) {
        this.sideB = sideB;
        this.sideH = sideH;
    }

    @Override
    public int getAria() {
        return (this.sideB * this.sideH) / 2;
    }

    @Override
    public int getPerimeter() {
        return this.sideA + this.sideB + this.sideC;
    }
}
