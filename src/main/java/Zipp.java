import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class Zipp {
	
	public static void main(String[] args) {
	
		Zipp.zip("E:/vikram/Test");
	}
	
	 public static void zip(String filepath){
		   try
		   {
		    File inputFolder=new File(filepath);
		    File outputFolder=new File("E:/vikram/Test.zip");
		    ZipOutputStream out = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(outputFolder)));
		    BufferedInputStream in = null;
		    byte[] data  = new byte[1000];
		    String files[] = inputFolder.list();
		    for (int j=0; j<files.length; j++)
		    {
		     in = new BufferedInputStream(new FileInputStream
		     (inputFolder.getPath() + "/" + files[j]), 1000); 
		     out.putNextEntry(new ZipEntry(files[j]));
		     int totalcount;
		     while((totalcount= in.read(data,0,1000)) != -1)
		     {
		      out.write(data, 0, totalcount);
		     }
		     out.closeEntry();
		  }
		  out.flush();
		  out.close();  
		}
		  catch(Exception e)
		  {
		   e.printStackTrace();
		          // return "Fail - " + e.getMessage();
		   
		  }
		 }
}