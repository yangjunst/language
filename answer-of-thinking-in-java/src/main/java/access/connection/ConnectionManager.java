package access.connection;

import java.util.Arrays;

public class ConnectionManager {
    private static Connection[] pool = new Connection[10];

    public static void print() {
        Arrays.stream(pool).forEach(System.out::println);
    }

    static {
        for (int i = 0; i < pool.length; i++)
            pool[i] = new Connection();
    }

    public static Connection getConnection() {
        for (int i = 0; i < pool.length; i++)
            if (pool[i] != null) {
                Connection c = pool[i];
                pool[i] = null;
                return c;
            }
        return null;
    }

    public static void checkIn(Connection c) {
        for (int i = 0; i < pool.length; i++)
            if (pool[i] == null) {
                System.out.println("--------------------------------->"+i);
                pool[i] = c;
                return;
            }
    }
}