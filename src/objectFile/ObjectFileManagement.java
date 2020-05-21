package objectFile;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ObjectFileManagement {
    public void writeObjectFile(String path, List<Customer> customers){
        FileOutputStream fileOutputStream=null;
        ObjectOutputStream objectOutputStream=null;
        try {
            fileOutputStream=new FileOutputStream(path);
            objectOutputStream=new ObjectOutputStream(fileOutputStream);
            for (Customer customer : customers) {
                objectOutputStream.writeObject(customer);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public List<Customer> readObjectFile(String path){
        List<Customer> customers=new ArrayList<>();
        FileInputStream fileInputStream=null;
        ObjectInputStream objectInputStream=null;
        try {
            fileInputStream=new FileInputStream(path);
            objectInputStream=new ObjectInputStream(fileInputStream);
            Customer customer=null;
            while((customer=(Customer)objectInputStream.readObject())!=null){
                customers.add(customer);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch(EOFException e){
            System.out.println("Het file");
        }
        catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return customers;
    }
}
