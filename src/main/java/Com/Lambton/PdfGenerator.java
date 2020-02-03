package Com.Lambton;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Date;

public class PdfGenerator {

        public void PdfGenrator() {
                try {
                        OutputStream file = new FileOutputStream(new File("VehicleRent_Details.pdf"));
                        Document document = new Document();
                        PdfWriter.getInstance(document, file);
                        

                } catch (Exception e) {
                        e.printStackTrace();
                }
        }
}


