import java.io.File;

public class ListFilesRecur {
    public static void listFilesRec(File directory){
        if(directory.exists() ){
           File[] files= directory.listFiles();
           System.out.println("absolute path for the dir "+directory.getAbsoluteFile());
           if(files!=null ){
               for(File file :files){
                   if( file.isDirectory())
                       listFilesRec(file);
                   else{
                       System.out.println("absolute path for the filename "+file.getAbsoluteFile());
                   }
               }
           }else{
               System.out.println("We have encountered null ");
           }
        }
    }
}
