package sample;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        File fileIn = new File("D:\\Sorting\\Terminator.png");
        File fileOut = new File("D:\\Sorting\\" + fileIn.getName());
        File folderIn = new File("D:\\Sorting");
        File folderOut = new File("D:\\JavaFolder");

        String fileType = new String("png");

        try{
            System.out.println(FileCopyService.copyFile(fileIn, fileOut));
            System.out.println("Copied your file");
        }
        catch(IOException e){
            e.printStackTrace();
        }

        try {
            FileCopyService.AllFiles(folderIn, folderOut);
            System.out.println("Copied all files");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("File not copied");
        }
        try {
            FileCopyService.SelectFile(folderIn,folderOut, fileType);
            System.out.println("Copied all " + fileType + " files");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Files not copied");
        }

        /*File file = new File("utf8_sample.txt");
        byte[] startBytes = new byte[] { (byte) 0xEF, (byte) 0xBB, (byte) 0xBF };
        File file2 = new File("array storage.dat");
        int[] array1 = new int[] { 11, -5, 63 };
        try {
            saveIntArrayToFile(array1, file2);
        } catch (IOException e) {
            e.printStackTrace();
        }
        int[] array2 = null;
        try {
            array2 = loadArrayFromFIle(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(Arrays.toString(array2));
        try {
            System.out.println(hasStartByte(startBytes, file));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static boolean hasStartByte(byte[] startBytes, File file) throws IOException {
        try (BufferedInputStream in = new BufferedInputStream(new FileInputStream(file))) {
            for (int i = 0; i < startBytes.length; i++) {
                byte b = (byte) in.read();
                if (startBytes[i] != b) {
                    return false;
                }
            } return true;
        } catch (IOException e) {
            throw e;
        }
    }
    public static void saveIntArrayToFile(int[] array, File file2) throws IOException {
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(file2))) {
            for (int i = 0; i < array.length; i++) {
                dos.writeInt(array[i]);
            }
        } catch (IOException e) {
            throw e;
        }
    }
    public static int[] loadArrayFromFIle(File file2) throws IOException {
        try (DataInputStream dis = new DataInputStream(new FileInputStream(file2))) {
            int arraySize = (int) (file2.length() / 4);
            int[] result = new int[arraySize];
            for (int i = 0; i < result.length; i++) {
                result[i] = dis.readInt();
            } return result;
        } catch (IOException e) {
            throw e;
        }
    }*/
        /*File file = new File("hello world.txt");
        String text = "Hello world";


        try {
            String text2 = loadStringFromFile(file);
            System.out.println(text2);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            saveStringToFile(text, file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void saveStringToFile(String text, File file) throws IOException {
        try (Writer writer = new FileWriter(file)) {
            writer.write(text);
        } catch (IOException e) {
            throw e;
        }
    }
    public static String loadStringFromFile(File file) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String result = "";
            String temp = "";
            for (;;) {
                temp = br.readLine();
                if (temp == null) {
                    break;
                } result += temp +
                        System.lineSeparator();
            } return result.substring(0, result.length() -
                    1);
        } catch (IOException e) {
            throw e;
        }
    }*/
    }
}

