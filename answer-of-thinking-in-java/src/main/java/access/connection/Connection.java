package access.connection;

public class Connection {
    private static int counter = 0;
    private int id = counter++;

    public int getId() {
        return id;
    }

    Connection() {
    }

    public String toString() {
        return "Connection " + id;
    }

    public void doSomething() {
    }

    public void checkIn() {
        ConnectionManager.checkIn(this);
    }
}