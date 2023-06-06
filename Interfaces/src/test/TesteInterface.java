package test;

import dataaccess.*;

public class TesteInterface {
    public static void main(String[] args) {
        IDataAccess data = new MysqlImplementationDemo();
        print(data);
    }
    
    public static void print(IDataAccess data){
        data.list();
    }
}
