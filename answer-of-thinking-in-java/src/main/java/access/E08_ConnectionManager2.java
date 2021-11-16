package access;

import access.connection.Connection;
import access.connection.ConnectionManager;

public class E08_ConnectionManager2 {
    public static void main(String args[]) {
        Connection[] ca = new Connection[10];
        for (int i = 0; i < 10; i++)
            ca[i] = ConnectionManager.getConnection();
        for (int i = 0; i < 9; i++) {
            System.out.println("=================================");
            ca[i].checkIn();
            Connection c = ConnectionManager.getConnection();
            c.doSomething();
            c.checkIn();
        }
        ConnectionManager.print();
    }
}