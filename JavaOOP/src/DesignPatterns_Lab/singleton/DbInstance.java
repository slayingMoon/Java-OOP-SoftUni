package DesignPatterns_Lab.singleton;


//this is Singleton object
public class DbInstance {

    private static DbInstance instance;

    private DbInstance() {
        //simulate DB connection (heavy work)
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static DbInstance getInstance() {
        if (instance == null) {
            instance = new DbInstance();
        }
        return instance;
    }

    public int createTable() {
        System.out.println("Table users created");
        return 1;
    }
}
