import java.io.File;

public class Main {
    public static void main(String[] args) {

        String path="C:\\Users\\HAMZA\\Desktop\\Voting System using blockchaine";

        File f1 = new File(path);

        if(f1.exists() && f1.isDirectory()){

            File a[]=f1.listFiles();
            ExtractStructer st= new ExtractStructer();
            st.getFiles(a,0,0);
        }










    }
}