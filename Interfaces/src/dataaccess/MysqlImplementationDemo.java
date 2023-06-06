package dataaccess;

public class MysqlImplementationDemo implements IDataAccess{

    @Override
    public void insert() {
        System.out.println("Insert MySql data");
    }

    @Override
    public void list() {
        System.out.println("List all data");
    }

    @Override
    public void update() {
        System.out.println("Update data");
    }

    @Override
    public void delete() {
        System.out.println("Delete data");
    }
    
}
