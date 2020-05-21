package binary;

public class Main {
    public static void main(String[] args) {
        BinaryFileManagement binaryFileManagement=new BinaryFileManagement();
        String path="test.data";
        int[] array={1,2,3,4,5};
        binaryFileManagement.writeBinaryFile(path,array);
        binaryFileManagement.readBinaryFile(path);
    }
}
