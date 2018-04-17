package UserInteractions;

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
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExportToPDF {
	public static final String DEST = "Resources/SamplePDF.pdf";

	public static void main(String[] args) throws IOException, DocumentException {
		File file = new File(DEST);
		file.getParentFile().mkdirs();
		new ExportToPDF().createPdf(DEST);
	}

	public void createPdf(String dest) throws IOException, DocumentException, MalformedURLException, IOException {
		Date thisDate = new Date();
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

		// Adding date and time
		SimpleDateFormat date = new SimpleDateFormat("dd / MM / Y");
		SimpleDateFormat time = new SimpleDateFormat("HH:mm");
		document.add(new Paragraph("DATE : " + date.format(thisDate) + "     TIME : " + time.format(thisDate)));
		document.add(new Paragraph(" "));
		// Adding first paragraph
		document.add(new Paragraph("Personal Informations:"));

		// Setting the first table size and information's position
		PdfPTable table = new PdfPTable(5);
		table.getDefaultCell().setHorizontalAlignment(Element.ALIGN_CENTER);
		table.setSpacingBefore(10);
		table.setWidths(new int[] { 4, 4, 4, 4, 5 });
		table.setWidthPercentage(100);

		Font a = new Font(Font.FontFamily.TIMES_ROMAN, 14, Font.BOLD,
				new BaseColor(/* Red */255, /* Green */255, 255/* Blue */));

		// First table column names
		table.addCell(new Paragraph("Name", a));
		table.addCell(new Paragraph("Age", a));
		table.addCell(new Paragraph("Gender", a));
		table.addCell(new Paragraph("Profession", a));
		table.addCell(new Paragraph("Educational Status", a));

		// Painting to first row as a header to gray
		table.setHeaderRows(1);
		PdfPCell[] cells = table.getRow(0).getCells();
		for (int j = 0; j < cells.length; j++) {
			cells[j].setBackgroundColor(new BaseColor(/* Red */127, /* Green */162, 211/* Blue */));
		}

		// Setting personal informations
		table.addCell("get(Name)");
		table.addCell("get(Age)");
		table.addCell("get(Gender)");
		table.addCell("get(Profession)");
		table.addCell("get(Educational Status)");
		document.add(table);
		table.setSpacingBefore(30);
		document.add(new Paragraph(" "));

		// deneme----
		document.add(new Paragraph("GENERAL RESULTS"));
		table = new PdfPTable(3);
		table.getDefaultCell().setHorizontalAlignment(Element.ALIGN_CENTER);
		table.setSpacingBefore(10);
		table.setWidths(new int[] { 8, 8, 15 });
		table.setWidthPercentage(100);

		// Setting column informations
		table.getDefaultCell().setColspan(1);
		table.addCell(new Paragraph("POLYGON SCORE", a));
		table.addCell(new Paragraph("CLOCK SCORE", a));
		table.addCell(new Paragraph("MMSE SCORE", a));

		// Painting to first row as a header to gray
		table.setHeaderRows(1);
		PdfPCell[] cellsresult = table.getRow(0).getCells();
		for (int j = 0; j < cellsresult.length; j++) {
			cellsresult[j].setBackgroundColor(new BaseColor(/* Red */127, /* Green */162, 211/* Blue */));
		}

		// Setting column informations
		table.addCell("get(number)");
		table.addCell("get(number)");
		table.addCell("get(number)");
		document.add(table);
		document.add(new Paragraph(" "));
		// -----deneme son----

		// Setting the second table size and information's position
		// Adding second paragraph
		document.add(new Paragraph("Information Table:"));
		table = new PdfPTable(2);
		table.setSpacingBefore(10);
		table.setWidths(new int[] { 10, 15 });
		table.setWidthPercentage(100);

		// Setting column informations
		table.getDefaultCell().setColspan(1);
		table.addCell(new Paragraph("MMSE POINT", a));
		table.addCell(new Paragraph("COGNITIVE IMPAIRMENT", a));

		// Painting to first row as a header to gray
		table.setHeaderRows(1);
		PdfPCell[] cells2 = table.getRow(0).getCells();
		for (int j = 0; j < cells2.length; j++) {
			cells2[j].setBackgroundColor(new BaseColor(/* Red */127, /* Green */162, 211/* Blue */));
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
		document.add(new Paragraph(" "));

		// Adding third paragraph
		document.add(new Paragraph("Results:"));
		table = new PdfPTable(3);

		// Setting the second table size and information's position
		// Adding second paragraph
		table.setSpacingBefore(10);
		table.setWidths(new int[] { 10, 10, 7 });
		table.setWidthPercentage(100);
		table.getDefaultCell().setColspan(1);
		table.addCell(new Paragraph("QUESTION NUMBER", a));
		table.addCell(new Paragraph("ANSWER", a));
		table.addCell(new Paragraph("EVALUATION", a));

		// Painting to first row as a header to gray
		table.setHeaderRows(1);
		PdfPCell[] cells3 = table.getRow(0).getCells();
		for (int j = 0; j < cells3.length; j++) {
			cells3[j].setBackgroundColor(new BaseColor(/* Red */127, /* Green */162, 211/* Blue */));
		}

		// Getting answers
		for (int i = 1; i < 21; i++) {
			table.addCell("Question Number:" + i);
			table.addCell("Answer:" + i);
			table.addCell("CORRECT / FALSE");
			// -----------------
		}
		document.add(table);
		document.add(new Paragraph(" "));

		// --------------------------------------------------------------------------------
		// ----------------------SECOND
		// PAGE-----------------------------------------------
		// --------------------------------------------------------------------------------

		// Adding date and time
		SimpleDateFormat date2 = new SimpleDateFormat("dd / MM / Y");
		SimpleDateFormat time2 = new SimpleDateFormat("HH:mm");
		document.add(new Paragraph("DATE : " + date2.format(thisDate) + "     TIME : " + time2.format(thisDate)));

		// Adding first paragraph
		document.add(new Paragraph(" - POLYGON SHAPE - DRAWN BY USER"));
		document.add(new Paragraph(" "));

		Image img3 = Image.getInstance("C:\\Users\\Durukan\\Desktop\\Images\\2.png");
		img3.scaleToFit(200f, 200f);
		img3.setAlignment(Image.MIDDLE);
		document.add(img3);
		System.out.println("Image loaded...");

		// Setting the first table size and information's position
		table = new PdfPTable(3);
		table.setSpacingBefore(10);
		table.setWidths(new int[] { 10, 10, 5 });
		table.setWidthPercentage(100);

		// First table column names
		table.addCell(new Paragraph("Drawing Criteria", a));
		table.addCell(new Paragraph("Current Position", a));
		table.addCell(new Paragraph("Result", a));

		// Painting to first row as a header to gray
		table.setHeaderRows(1);
		PdfPCell[] cellspolygon = table.getRow(0).getCells();
		for (int j = 0; j < cellspolygon.length; j++) {
			cellspolygon[j].setBackgroundColor(new BaseColor(/* Red */127, /* Green */162, 211/* Blue */));
		}

		// Setting personal informations
		table.getDefaultCell().setHorizontalAlignment(Element.ALIGN_LEFT);
		table.addCell("All edges were drawn correctly");
		table.addCell("SATISFIED / NOT SATISFIED");
		table.addCell("True / False");
		table.addCell("Two points were intersected");
		table.addCell("SATISFIED / NOT SATISFIED");
		table.addCell("True / False");
		table.addCell("Polygon drawing is correct");
		table.addCell("SATISFIED / NOT SATISFIED");
		table.addCell("True / False");
		document.add(table);
		table.setSpacingBefore(5);

		// Setting the second table size and information's position
		// Adding second paragraph
		document.add(new Paragraph(" "));
		document.add(new Paragraph(" "));
		document.add(new Paragraph(" - CLOCK - DRAWN BY USER"));

		Image img2 = Image.getInstance("C:\\Users\\Durukan\\Desktop\\Images\\Clock.jpg");
		img2.scaleToFit(200f, 200f);
		img2.setAlignment(Image.MIDDLE);
		document.add(img2);
		System.out.println("Image 2 loaded...");

		table = new PdfPTable(3);
		table.setSpacingBefore(10);
		table.setWidths(new int[] { 10, 10, 5 });
		table.setWidthPercentage(100);

		// Setting column informations
		table.getDefaultCell().setColspan(1);
		table.addCell(new Paragraph("Drawing Criteria", a));
		table.addCell(new Paragraph("Current Position", a));
		table.addCell(new Paragraph("Result", a));

		// Painting to first row as a header to gray
		table.setHeaderRows(1);
		PdfPCell[] cellsclock = table.getRow(0).getCells();
		for (int j = 0; j < cellsclock.length; j++) {
			cellsclock[j].setBackgroundColor(new BaseColor(/* Red */127, /* Green */162, 211/* Blue */));
		}

		// Setting personal informations
		table.getDefaultCell().setHorizontalAlignment(Element.ALIGN_LEFT);
		table.addCell("Clock face is presented");
		table.addCell("SATISFIED / NOT SATISFIED");
		table.addCell("True / False");
		table.addCell("Numbers and hands are presented");
		table.addCell("SATISFIED / NOT SATISFIED");
		table.addCell("True / False");
		table.addCell("Hour hand is in the correct place");
		table.addCell("SATISFIED / NOT SATISFIED");
		table.addCell("True / False");
		table.addCell("Minute hand is in the correct place");
		table.addCell("SATISFIED / NOT SATISFIED");
		table.addCell("True / False");
		table.addCell("Minute hand is longer than hour hand");
		table.addCell("SATISFIED / NOT SATISFIED");
		table.addCell("True / False");
		table.addCell("They are in the correct form");
		table.addCell("SATISFIED / NOT SATISFIED");
		table.addCell("True / False");
		document.add(table);
		table.setSpacingBefore(5);

		document.close();
		System.out.println("It's Done!..Please Refresh..");

	}

}