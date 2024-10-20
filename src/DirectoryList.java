import java.io.File;

public class DirectoryList {
    public static void main(String[] args) {

        String path = ".";

        if (args.length > 0) {
            path = args[0];
        }

        File file = new File(path);

        if (!file.exists()) {
            System.out.println("File does not exist");
        } else {
            if (file.isFile()) {
                System.out.println(file + " is a file");
            } else if (file.isDirectory()) {
                System.out.println(file + " is a directory. Contents: ");
                File[] files = file.listFiles();
                for (File f : files) {
                    //String description = f.isDirectory()? "/" : f.isFile() ? "_": "?";
                    String description = f.isDirectory() ? "/" : f.getName().startsWith(".") ? "*" : "_";

                    System.out.println("(" + description + ")" + f.getName());
                }
            }
        }


    }
}
