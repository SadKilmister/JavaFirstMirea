package ru.mirea.task2;

public class TestBall {
    public static void main(String[] args) {
        Ball b = new Ball(1.0,3.6);
        Ball q = new Ball();

        System.out.println(b.getX());
        System.out.println(b.getY());

        b.setX(2.45);
        b.setY(4.45);

        System.out.println(b.getX());
        System.out.println(b.getY());

        q.setXY(3.4, 5.8);
        q.move(2.3,5.6);
        System.out.println(q);
    }
}
