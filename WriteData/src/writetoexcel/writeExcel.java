package writetoexcel;

import java.io.FileOutputStream;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

import org.testng.annotations.Test;

public class writeExcel {
  @Test
  public void f() {
	  try
      {
     FileOutputStream f = new FileOutputStream("C:\\Users\\Raviteja\\Desktop\\output.xls",true);
     WritableWorkbook book = Workbook.createWorkbook(f); 
     WritableSheet sheet = book.createSheet("output", 0);
     Label l = new Label(0, 0,"text");
     sheet.addCell(l);
     book.write(); 
     book.close(); 
      }
      catch (Exception e)
      {
       e.printStackTrace();
      }
      }
  }

