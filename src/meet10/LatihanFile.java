package meet10;

import java.io.File;
public class LatihanFile {
    public static void main(String[] args) {
    // TODO code application logic here
        File f = new File("D:\\user\\Documents\\GitHub\\Praktikum-PBO\\src\\meet10\\textfile.txt");
        System.out.println(f.getName());
        System.out.println(f.getParent());
        System.out.println(f.canWrite());
    }
}
