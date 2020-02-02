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
                        VehicleRent rent= new VehicleRent();
                        Float s=rent.getTotalFare();
                        PdfPTable table = new PdfPTable(1);
                        PdfPCell cell = new PdfPCell(new Paragraph("Vehicle Rent Details"));
                        cell.setColspan(6);
                        cell.setHorizontalAlignment(Element.ALIGN_CENTER);
                        cell.setPadding(20.0f);
                        cell.setSpaceCharRatio(3);
                        cell.setBackgroundColor(new BaseColor(240, 21, 82));
                        table.addCell(cell);
                        for (Customer v: VehicleSingelton.getInstance().getArray()) {
                                table.addCell(v.toString());
                        }
                        table.addCell("Total Bill "+s);
                        table.setSpacingBefore(50.0f);
                        table.setSpacingAfter(50.0f);
                        document.open();
                        document.add(Chunk.NEWLINE);
                        document.add(new Paragraph("Vehicle Rent"));
                        document.add(table);
                        document.add(Chunk.NEWLINE);
                        document.newPage();
                        document.close();
                        file.close();
                        System.out.println("Pdf created successfully..");

                } catch (Exception e) {
                        e.printStackTrace();
                }
        }
}


