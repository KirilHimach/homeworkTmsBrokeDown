package homeworkSevenShapes;

/*
1. �������� �������� ������� ��������.
������ -> ����������� -> ������������� -> ����.
����������� �-� �������� ������� ��� ������� ���� ������ � ������� ���������.
������� ������������ �� ������� ������.
������� ������ �� 5 �����.
������� �� ����� ����� ���������� � ����� �������� ���� ����� � �������.
 */

public class Shape {
    private int aria;
    private int perimeter;

    public Shape() {
    }

    public int getAria() {
        return 0;
    }

    public int getPerimeter() {
        return 0;
    }

    public static int sumAria(Shape[] shapes) {
        int sumShapes = 0;
        for (Shape shape : shapes) {
            sumShapes += shape.getAria();
        }
        return sumShapes;
    }

    public static int sumPerimeter(Shape[] shapes) {
        int sumPerimeter = 0;
        for (Shape shape : shapes) {
            sumPerimeter += shape.getPerimeter();
        }
        return sumPerimeter;
    }
}
