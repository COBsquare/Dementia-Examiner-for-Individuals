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
import UserInteractions.Examination.Results_MMSE;

public class ExportToPDF {
	public static final String DEST = System.getProperty("user.home") + "/Desktop" + "/DEfI-Report.pdf";

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
		if(User.getEducation().equals("Literate")){
			table = new PdfPTable(3);
			table.setWidths(new int[] { 8, 8, 15 });

		}else{
			table = new PdfPTable(2);
			table.setWidths(new int[] { 8, 8 });

		}
		table.getDefaultCell().setHorizontalAlignment(Element.ALIGN_CENTER);
		table.setSpacingBefore(10);
		table.setWidthPercentage(100);

		// Setting column informations
		table.getDefaultCell().setColspan(1);
		table.addCell(new Paragraph("MMSE Score", font_boldTimes));
		table.addCell(new Paragraph("Polygon Score", font_boldTimes));
		if(User.getEducation().equals("Literate")){
			table.addCell(new Paragraph("Clock Score", font_boldTimes));
		}

		// Painting to first row as a header to gray
		table.setHeaderRows(1);
		PdfPCell[] cellsresult = table.getRow(0).getCells();
		for (int j = 0; j < cellsresult.length; j++) {
			cellsresult[j].setBackgroundColor(new BaseColor(/* Red */127, /* Green */162, 211/* Blue */));
		}

		// Setting column informations
		table.addCell(Integer.toString(User.getScore_mmse()));
		table.addCell(Double.toString(User.getScore_polygon()));
		if(User.getEducation().equals("Literate")){
			table.addCell(Double.toString(User.getScore_clock()));
		}
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

		// Setting the second table size and information's position
		// Adding second paragraph
		table = new PdfPTable(3);
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
		for (int i = 0; i < Results_MMSE.size; i++) {
			table.addCell((i+1)+". "+Results_MMSE.questions[i]);
			table.addCell(Results_MMSE.answers[i]);
			table.addCell(User.evaluation_mmse.get(i));
		}

		document.add(table);
		document.add(new Paragraph(" "));

		// SECOND PAGE------------------------------------------------------------------------
		// Adding first paragraph
		document.add(new Paragraph("Polygon Drawing:"));
		document.add(new Paragraph(" "));

		Image img3 = Image.getInstance(System.getProperty("user.home") + "/DEfI/user_poly.jpg");
		img3.scaleToFit(200f, 200f);
		img3.setAlignment(Image.MIDDLE);
		document.add(img3);

		// Setting the first table size and information's position
		table = new PdfPTable(2);
		table.setSpacingBefore(10);
		table.setWidths(new int[] { 10, 10 });
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
		table.addCell(User.evaluation_mmse.get(User.evaluation_mmse.size()-1));
		table.addCell("Polygon drawing is correct");
		table.addCell(User.evaluation_mmse.get(User.evaluation_mmse.size()-1));
		document.add(table);
		table.setSpacingBefore(5);

		// CLOCK --------------------------------------------------------------------------
		if (User.getEducation().equals("Literate")) {
			// Setting the second table size and information's position
			// Adding second paragraph
			document.add(new Paragraph(" "));
			document.add(new Paragraph(" "));
			document.add(new Paragraph("Clock Drawing:"));

			Image img2 = Image.getInstance(System.getProperty("user.home") + "/DEfI/user_clock.jpg");
			img2.scaleToFit(200f, 200f);
			img2.setAlignment(Image.MIDDLE);
			document.add(img2);

			table = new PdfPTable(2);
			table.setSpacingBefore(10);
			table.setWidths(new int[] { 10, 10 });
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
			table.addCell(User.answers_clock.get(0));
			table.addCell("Numbers and hands are presented");
			table.addCell(User.answers_clock.get(1));

			table.addCell("All numbers are presented");
			table.addCell(User.answers_clock.get(2));
			table.addCell("Numbers are in correct spatial arrangements");
			table.addCell(User.answers_clock.get(3));

			table.addCell("Hour hand is in the correct place");
			table.addCell(User.answers_clock.get(4));
			table.addCell("Minute hand is in the correct place");
			table.addCell(User.answers_clock.get(5));
			table.addCell("Minute hand is longer than hour hand");
			table.addCell(User.answers_clock.get(6));
			table.addCell("They are in the correct form");
			table.addCell(User.answers_clock.get(7));
			document.add(table);
			table.setSpacingBefore(5);

		}

		document.close();

	}

}