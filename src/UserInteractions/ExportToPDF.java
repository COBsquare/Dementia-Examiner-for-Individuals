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

import App.User;
import UserInteractions.Interfaces.Results;

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

		Font font_boldTimes = new Font(Font.FontFamily.TIMES_ROMAN, 14, Font.BOLD, new BaseColor(/* Red */255,
				/* Green */255, 255/* Blue */));

		// First table column names
		table.addCell(new Paragraph("Name", font_boldTimes));
		table.addCell(new Paragraph("Age", font_boldTimes));
		table.addCell(new Paragraph("Gender", font_boldTimes));
		table.addCell(new Paragraph("Profession", font_boldTimes));
		table.addCell(new Paragraph("Educational Status", font_boldTimes));

		// Painting to first row as a header to gray
		table.setHeaderRows(1);
		PdfPCell[] cells = table.getRow(0).getCells();
		for (int j = 0; j < cells.length; j++) {
			cells[j].setBackgroundColor(new BaseColor(/* Red */127, /* Green */162, 211/* Blue */));
		}

		// Setting personal informations
		table.addCell(User.getNameSurname());
		table.addCell(User.getAge());
		table.addCell(User.getGender());
		table.addCell(User.getProfession());
		table.addCell(User.getEducation());
		document.add(table);
		table.setSpacingBefore(30);
		document.add(new Paragraph(" "));

		// Displays the examination results
		document.add(new Paragraph("EXAMINATION RESULTS"));
		table = new PdfPTable(3);
		table.getDefaultCell().setHorizontalAlignment(Element.ALIGN_CENTER);
		table.setSpacingBefore(10);
		table.setWidths(new int[] { 8, 8, 15 });
		table.setWidthPercentage(100);
		
		// Setting column informations
		table.getDefaultCell().setColspan(1);
		table.addCell(new Paragraph("MMSE Score", font_boldTimes));
		table.addCell(new Paragraph("Polygon Score", font_boldTimes));
		table.addCell(new Paragraph("Clock Score", font_boldTimes));

		// Painting to first row as a header to gray
		table.setHeaderRows(1);
		PdfPCell[] cellsresult = table.getRow(0).getCells();
		for (int j = 0; j < cellsresult.length; j++) {
			cellsresult[j].setBackgroundColor(new BaseColor(/* Red */127, /* Green */162, 211/* Blue */));
		}

		// Setting column informations
		table.addCell("");
		table.addCell("get(number)");
		table.addCell("get(number)");
		document.add(table);
		document.add(new Paragraph(" "));

		// Setting the second table size and information's position
		// Adding second paragraph
		document.add(new Paragraph("Global Deterioration Scale:"));
		table = new PdfPTable(2);
		table.setSpacingBefore(10);
		table.setWidths(new int[] { 10, 15 });
		table.setWidthPercentage(100);

		// Setting column informations
		table.getDefaultCell().setColspan(1);
		table.addCell(new Paragraph("MMSE POINT", font_boldTimes));
		table.addCell(new Paragraph("COGNITIVE IMPAIRMENT", font_boldTimes));

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

		// Adding Examination results
		document.add(new Paragraph("MMSE Results:"));
		table = new PdfPTable(3);

		// Setting the second table size and information's position
		// Adding second paragraph
		table.setSpacingBefore(10);
		table.setWidths(new int[] { 10, 10, 7 });
		table.setWidthPercentage(100);
		table.getDefaultCell().setColspan(1);
		table.addCell(new Paragraph("Question", font_boldTimes));
		table.addCell(new Paragraph("Your Answer", font_boldTimes));
		table.addCell(new Paragraph("Evaluation", font_boldTimes));

		// Painting to first row as a header to gray
		table.setHeaderRows(1);
		PdfPCell[] cells3 = table.getRow(0).getCells();
		for (int j = 0; j < cells3.length; j++) {
			cells3[j].setBackgroundColor(new BaseColor(/* Red */127, /* Green */162, 211/* Blue */));
		}

		// Getting answers
		for (int i = 0; i < Results.size; i++) {
			table.addCell((i+1)+". "+Results.questions[i]);
			table.addCell("answer");
			//table.addCell(Results.answers[i]);
			table.addCell("CORRECT");
		}
		
		document.add(table);
		document.add(new Paragraph(" "));

		// SECOND PAGE---------------------------------------------------------------------

		// Adding date and time
		SimpleDateFormat date2 = new SimpleDateFormat("dd / MM / Y");
		SimpleDateFormat time2 = new SimpleDateFormat("HH:mm");
		document.add(new Paragraph("DATE : " + date2.format(thisDate) + "     TIME : " + time2.format(thisDate)));

		// Adding first paragraph
		document.add(new Paragraph("Polygon Drawing:"));
		document.add(new Paragraph(" "));

		Image img3 = Image.getInstance("path will added");
		img3.scaleToFit(200f, 200f);
		img3.setAlignment(Image.MIDDLE);
		document.add(img3);

		// Setting the first table size and information's position
		table = new PdfPTable(2);
		table.setSpacingBefore(10);
		table.setWidths(new int[] { 10, 10, 5 });
		table.setWidthPercentage(100);

		// First table column names
		table.addCell(new Paragraph("Criteria", font_boldTimes));
		table.addCell(new Paragraph("Evaluation", font_boldTimes));

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
		table.addCell("Two points were intersected");
		table.addCell("SATISFIED / NOT SATISFIED");
		table.addCell("Polygon drawing is correct");
		table.addCell("SATISFIED / NOT SATISFIED");
		document.add(table);
		table.setSpacingBefore(5);
		// TODO Polygon function needed for the satisfaction return

		// Setting the second table size and information's position
		// Adding second paragraph
		document.add(new Paragraph(" "));
		document.add(new Paragraph(" "));
		document.add(new Paragraph("Clock Drawing:"));

		Image img2 = Image.getInstance("Path will added");
		img2.scaleToFit(200f, 200f);
		img2.setAlignment(Image.MIDDLE);
		document.add(img2);

		table = new PdfPTable(2);
		table.setSpacingBefore(10);
		table.setWidths(new int[] { 10, 10, 5 });
		table.setWidthPercentage(100);

		// Setting column informations
		table.getDefaultCell().setColspan(1);
		table.addCell(new Paragraph("Criteria", font_boldTimes));
		table.addCell(new Paragraph("Evaluation", font_boldTimes));

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
		table.addCell("Numbers and hands are presented");
		table.addCell("SATISFIED / NOT SATISFIED");
		table.addCell("Hour hand is in the correct place");
		table.addCell("SATISFIED / NOT SATISFIED");
		table.addCell("Minute hand is in the correct place");
		table.addCell("SATISFIED / NOT SATISFIED");
		table.addCell("Minute hand is longer than hour hand");
		table.addCell("SATISFIED / NOT SATISFIED");
		table.addCell("They are in the correct form");
		table.addCell("SATISFIED / NOT SATISFIED");
		document.add(table);
		table.setSpacingBefore(5);
		// TODO Clock function needed for the satisfaction return

		document.close();

	}

}