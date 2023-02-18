package Batch3;


import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;

public class DemoFileReading {
    String XCELLPATH = "C:\\Users\\Rubal Ahmed\\Desktop\\screen shot picture\\New Microsoft Excel Worksheet.xlsx\\";
    String FILEREADING = "C:\\Users\\Rubal Ahmed\\Desktop\\screen shot picture\\New Text Document.txt\\";

       public void fileReader(){
           try {
               FileReader FR= new FileReader(FILEREADING);
               BufferedReader BR = new BufferedReader(FR);
               String line;
               while((line=BR.readLine())!=null)  {
                   System.out.println(line);

               }
               BR.close();
               FR.close();

           }catch (Exception e){
               e.printStackTrace();
           }
       }

public void  fileWriter(){
           //if i use append method then we have to use append true with filepath.
    //if we dont provide append true still it will write but it will override same statement.
    // Also we can use write method for file writer. append true write new line otherwise it will override.
    //
           try{
           FileWriter fw = new FileWriter(FILEREADING,true );
           BufferedWriter bw = new BufferedWriter(fw);
//           System.out.println(bw.append("i am append"));
//           bw.newLine();
           bw.write("i am available all the time");
           bw.newLine();

               bw.close();
               fw.close();

}catch (Exception e){
           e.printStackTrace();}

}



            public void xcelreader(){
           //line numbers 63 to 68 used just to see how many numbers of rows and see available and what they are.
            try {
                FileInputStream fis = new FileInputStream(XCELLPATH);
                XSSFWorkbook xss = new XSSFWorkbook(fis);
                XSSFSheet sheet =xss.getSheet("Sheet1");
                XSSFRow ro = sheet.getRow(0);
                System.out.println(ro);
                XSSFCell cel = ro.getCell(0);
                System.out.println(cel);
               int rowNum = sheet.getLastRowNum();
                System.out.println(rowNum);
               int cellNum =sheet.getRow(0).getLastCellNum();
                System.out.println(rowNum+""+cellNum);
               for (int r =0; r<=rowNum; r++){
                   for (int c=0;c<=cellNum;c++){
                       System.out.println(sheet.getRow(r) .getCell(c) );


                   }

               }
                xss.close();
                fis.close();
            }catch (Exception e){
                e.printStackTrace();
            }
            }
            public void xcellWriter(){
           //For right into xcell it is same as xcell read just need to
                // create FileOutputStream object.(two extra lines 76 and 77)
           try {
               FileInputStream fis1 = new FileInputStream(XCELLPATH);
               XSSFWorkbook WB = new XSSFWorkbook(fis1);
               XSSFSheet SHT = WB.getSheet("NewSheet");
               XSSFRow RO = SHT.createRow(0);//if i need new row i have to make new row
               XSSFCell CEL = RO.createCell(0);//whenever i need new cell i have to create one.
               CEL.setCellValue(" I DON'T REALLY CARE");
               System.out.println(CEL);
               FileOutputStream FOS = new FileOutputStream(XCELLPATH);
               WB.write(FOS);

               FOS.close();
               WB.close();
               fis1.close();

           }catch (Exception e){
               e.printStackTrace();
           }

           }




            public static void main (String[]args){
                DemoFileReading obj = new DemoFileReading();
               // obj.fileReader();
               // obj.fileWriter();

               obj.xcelreader();
              //  obj.xcellWriter();





            }

        }