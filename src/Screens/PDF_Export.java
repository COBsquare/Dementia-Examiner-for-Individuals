package Screens;

/*import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
 
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class TableSamples {
    public static final String DEST = "results/tables/simple_table2.pdf";
 
    public static void main(String[] args) throws IOException,
            DocumentException {
        File file = new File(DEST);
        file.getParentFile().mkdirs();
        new TableSamples().createPdf(DEST);
    }
    public void createPdf(String dest) throws IOException, DocumentException {
        Document document = new Document();
        PdfWriter.getInstance(document, new FileOutputStream(dest));
        document.open();
        PdfPTable table = new PdfPTable(8);
        PdfPCell cell = new PdfPCell(new Phrase("hi"));
        cell.setRowspan(2);
        table.addCell(cell);
        for(int aw = 0; aw < 14; aw++){
            table.addCell("hi");
        }
        document.add(table);
        document.close();
    }
 
}*/

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;

public class PDF_Export {
	public static final String DEST = "Resources/SamplePDF.pdf";

	public static void main(String[] args) throws IOException, DocumentException {
		File file = new File(DEST);
		file.getParentFile().mkdirs();
		new PDF_Export().createPdf(DEST);
	}

	public void createPdf(String dest) throws IOException, DocumentException, MalformedURLException, IOException {
		// Creating new document
		Document document = new Document();
		PdfWriter.getInstance(document, new FileOutputStream(dest));
		document.open();

		// Adding image and image setting
		Image img = Image.getInstance("Resources/Images/Defi Logo.png");
		img.scaleToFit(300f, 225f);
		img.setAlignment(Image.MIDDLE);
		document.add(img);
		System.out.println("Image loaded...");
		
		// TODO Date:

		// Adding first paragraph
		document.add(new Paragraph("Personal Informations:"));

		// Setting the first table size and information's position
		PdfPTable table = new PdfPTable(5);
		table.getDefaultCell().setHorizontalAlignment(Element.ALIGN_CENTER);
		table.setSpacingBefore(10);
		table.setWidths(new int[] { 4, 4, 4, 4, 5 });
		table.setWidthPercentage(100);

		Font a=new Font(Font.FontFamily.TIMES_ROMAN,14,Font.BOLD, new BaseColor(/*Red*/255,/*Green*/255,255/*Blue*/));

		// First table column names
		table.addCell(new Paragraph("Name",a));
		table.addCell(new Paragraph("Age",a));
		table.addCell(new Paragraph("Gender",a));
		table.addCell(new Paragraph("Profession",a));
		table.addCell(new Paragraph("Educational Status",a));

		// Painting to first row as a header to gray
		table.setHeaderRows(1);
		PdfPCell[] cells = table.getRow(0).getCells();
		for (int j = 0; j < cells.length; j++) {
			cells[j].setBackgroundColor(BaseColor.BLUE);
		}

		// Setting personal informations
		table.addCell("get(Name)");
		table.addCell("get(Age)");
		table.addCell("get(Gender)");
		table.addCell("get(Profession)");
		table.addCell("get(Educational Status)");
		document.add(table);
		table.setSpacingBefore(30);

		// Setting the second table size and information's position
		// Adding second paragraph
		document.add(new Paragraph("Information Table:"));
		table = new PdfPTable(2);
		table.setSpacingBefore(10);
		table.setWidths(new int[] { 10, 15 });
		table.setWidthPercentage(100);

		// Setting column informations
		table.getDefaultCell().setColspan(1);
		table.addCell("MMSE POINT");
		table.addCell("COGNITIVE IMPAIRMENT");

		// Painting to first row as a header to gray
		table.setHeaderRows(1);
		PdfPCell[] cells2 = table.getRow(0).getCells();
		for (int j = 0; j < cells2.length; j++) {
			cells2[j].setBackgroundColor(BaseColor.GRAY);
		}

		// Setting column informations
		table.addCell("27 - 30");
		table.addCell("Normal");
		table.addCell("21 - 26");
		table.addCell("Mild Cognitive Impairment");
		table.addCell("11 - 20");
		table.addCell("Moderate Cognitive Impairment");
		table.addCell("0 - 10");
		table.addCell("Severe Cognitive Impairment");
		document.add(table);
		table.setSpacingBefore(30);

		// Adding third paragraph
		document.add(new Paragraph("Results:"));
		table = new PdfPTable(2);

		// Setting the second table size and information's position
		// Adding second paragraph
		table.setSpacingBefore(10);
		table.setWidths(new int[] { 10, 15 });
		table.setWidthPercentage(100);
		table.getDefaultCell().setColspan(1);
		table.addCell("QUESTION NUMBER");
		table.addCell("ANSWER");

		// Painting to first row as a header to gray
		table.setHeaderRows(1);
		PdfPCell[] cells3 = table.getRow(0).getCells();
		for (int j = 0; j < cells3.length; j++) {
			cells3[j].setBackgroundColor(BaseColor.GRAY);
		}

		// Getting answers
		for (int i = 1; i < 21; i++) {
			table.addCell("Question Number:" + i);
			table.addCell("Answer:" + i);
			// -----------------
		}
		document.add(table);
		document.close();
		System.out.println("It's Done!..Please Refresh..");
		
		// TODO Clock rouleu scale
		
		// TODO Polygon

	}

}