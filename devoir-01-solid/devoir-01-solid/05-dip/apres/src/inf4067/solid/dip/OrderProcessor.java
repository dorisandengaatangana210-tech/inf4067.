package inf4067.solid.dip;

interface Database {
    public void save(String data);
}

class MySQLDatabase implements Database {

    @Override
    public void save(String data) {
        System.out.println("Saving to MySQL: " + data);
    }
}

class MongoDBDatabase implements Database {

    @Override
    public void save(String data) {
        System.out.println("Saving to MongoDB: " + data);
    }
}

public class OrderProcessor {
    private Database database;

    public OrderProcessor(Database database) {
        this.database = database;
    }

    public void processOrder(String order) {
        database.save(order);
    }
}
