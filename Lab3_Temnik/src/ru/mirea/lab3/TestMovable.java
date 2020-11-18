package ru.mirea.lab3;

public class TestMovable {
    public static void main(String[] args) {

        MovablePoint m1 = new MovablePoint(3, 15, 30, 40);
        m1.moveUp();
        m1.moveDown();
        m1.moveLeft();
        m1.moveRight();
        System.out.println(m1);

        MovableCircle m2 = new MovableCircle(6, 12, 15, 30, 20);
        m2.moveUp();
        m2.moveDown();
        m2.moveLeft();
        m2.moveRight();
        System.out.println(m2);

        MovableRectangle m3 = new MovableRectangle(15, 15, 15, 15, 15, 15);
        m3.moveUp();
        m3.moveDown();
        m3.moveLeft();
        m3.moveRight();
        System.out.println(m3);
    }
}
