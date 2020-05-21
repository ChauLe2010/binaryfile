package binary;

import java.io.*;

public class BinaryFileManagement {
    public void writeBinaryFile(String path,int[] array){
            FileOutputStream fileOutputStream=null;
            DataOutputStream dataOutputStream=null;
            try {
                fileOutputStream=new FileOutputStream(path);
                dataOutputStream=new DataOutputStream(fileOutputStream);
                for(int i=0;i<array.length;i++)
                    dataOutputStream.writeInt(array[i]);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
    }
    public void readBinaryFile(String path){
        FileInputStream fileInputStream=null;
        DataInputStream dataInputStream=null;
        try {
            fileInputStream=new FileInputStream(path);
            dataInputStream=new DataInputStream(fileInputStream);
            int data;
            while((data=dataInputStream.readInt())!=-1){
                System.out.println(data);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch(EOFException e){
            System.out.println("Het file");
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
