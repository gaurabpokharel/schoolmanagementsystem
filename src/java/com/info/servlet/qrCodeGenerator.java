
package com.info.servlet;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import net.glxn.qrgen.QRCode;
import net.glxn.qrgen.image.ImageType;
public class qrCodeGenerator {

  public qrCodeGenerator(String studentname,String fathername,String mothername,String address,String grade,String dob,String gender,String bloodgroup,
          String contactnumber,String nationality,String religion,String email,String ethnicity) throws IOException 
  {
        String details="Student Name:"+studentname+
                "Father name:"+fathername
                +"Mother name:"+mothername
                +"Address:"+address
                +"Grade:"+grade
                +"Date of Birth:"+dob
                +"Gender:"+gender
                +"Blood Group:"+bloodgroup
                +"Contact number:"+contactnumber
                +"Nationality:"+nationality+
                "Religion:"+religion
                +"Email:"+email
                +"Ethnicity:"+ethnicity;
      
        
        ByteArrayOutputStream out=QRCode.from(details).to(ImageType.JPG).stream();
        
        File f=new File("C:\\Users\\gaura\\OneDrive\\Documents\\NetBeansProjects\\Qr code\\qrcode.jpg");
        FileOutputStream fos=new FileOutputStream(f);
        fos.write(out.toByteArray());
        fos.flush();
        
    }
    public static void main(String[] args) throws IOException {
    qrCodeGenerator blah = new qrCodeGenerator();
}

    private qrCodeGenerator() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
