import java.io.File;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        ListFilesRecur listFilesRecur=new ListFilesRecur();
        File file=new File("/Users/nikhilkumar/desktop/LLD/LRUCache");
        ListFilesRecur.listFilesRec(file);
    }
}
