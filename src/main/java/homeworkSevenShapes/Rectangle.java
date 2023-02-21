package homeworkSevenShapes;

/*
S = ab - ��� ���������������
P = a+b+c+d - ��� ���������������
 */
public class Rectangle extends Shape {
    private int sideA;
    private int sideB;

    public Rectangle(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public int getAria() {
        return this.sideA * this.sideB;
    }

    @Override
    public int getPerimeter() {
        return (sideA + sideB) * 2;
    }
}
