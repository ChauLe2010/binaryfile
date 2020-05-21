package objectFile;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static List<Customer> customers=null;
    static {
        customers=new ArrayList<>();
        customers.add(new Customer(1,"Chau","Ha Noi"));
        customers.add(new Customer(2,"Thanh","HCM"));
        customers.add(new Customer(3,"Bao","Hai Phong"));
    }
    public static void main(String[] args) {
        List<Customer> customerList=new ArrayList<>();
        ObjectFileManagement objectFileManagement=new ObjectFileManagement();
        String path="test.data";
        objectFileManagement.writeObjectFile(path,customers);
        customerList=objectFileManagement.readObjectFile(path);
        for(Customer customer:customerList)
            System.out.println(customer.toString());
    }
}
