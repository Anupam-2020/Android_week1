package file;


import java.io.File;

import java.io.FileOutputStream;
import java.io.FileInputStream;

public class Fl{  // Bad class name

    public static void write() { // there is huge scope for optimization, but that is not our concern now.
        System.out.println(".....Performing write operation.....");
        try {
            File file = new File("./my.txt"); // referred the file.
            FileOutputStream fos = new FileOutputStream(file); // open for writing
            String dt = "hello world";
            fos.write(dt.getBytes()); // releasing the resource actual write operation, can done lateron.
            fos.close(); // code is not optimised
        }

        catch (Exception e) {
            System.out.println("Got Some Error");
        }

        System.out.println(".....Successfully Written....");
    }

    public static void read() {
        System.out.println(".....Performing Read Operation.....");
        try {
            // code which might generate exception ( error in general)

            File file = new File("./my.txt");
            FileInputStream fis = new FileInputStream(file);
            byte[] dt = fis.readAllBytes();
            String txt = new String(dt);
            System.out.println(txt);
            fis.close();
            } 
            catch (Exception e) {
                System.out.println("Got Some Error");
            }
        }

    public static void main(String[] args) {
        write();

        read();
    }
}