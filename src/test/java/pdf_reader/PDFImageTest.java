//package pdf_reader;
//
//import java.io.BufferedInputStream;
//import java.io.File;
//import java.io.IOException;
//import java.io.InputStream;
//import java.net.URL;
//import java.net.URLConnection;
//
//import org.apache.pdfbox.pdmodel.PDDocument;
//
//public class PDFImageTest {
//
//	public void test_PDF_Image() throws IOException {
//		String url = "file://users/naveen/Desktop/Devop.pdf";
//
//		URL pdfURL = new URL(url);
//		URLConnection urlConnection = pdfURL.openConnection();
//		urlConnection.addRequestProperty("User-Agent", "Mozilla");
//
//		InputStream ip = urlConnection.getInputStream();
//		BufferedInputStream bf = new BufferedInputStream(ip);
//
//		PDDocument pdDocument = PDDocument.load(bf);
//
//		//calling another class
//		PDFReader reader = new PDFReader();
//		int imageCount = reader.getPDFImagesCount(pdDocument);
//		System.out.println("total images = "+imageCount);
//
//		//Compare the images
//		reader.PDFBoxExtractImages(pdDocument);
//
//		File fileA = new File("./newhdfc.png");
//		File fileB = new File("./actual_image_hdfc_logo-modified.png");
//
//		reader.imageCompare(fileA, fileB);
//
//	}
//
//}
