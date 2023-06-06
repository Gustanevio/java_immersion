package dataaccess;

public interface IDataAccess {
    int MAX_REGISTER = 10;
    
    void insert();
    
    void list();
    
    void update();
    
    void delete();
}
