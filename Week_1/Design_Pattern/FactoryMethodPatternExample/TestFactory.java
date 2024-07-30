package FactoryMethodPatternExample;

public class TestFactory {

	public static void main(String[] args) {
		//creating factories for each doc type
		DocumentFactory word=new WordDocumentFactory();
		DocumentFactory pdf=new PdfDocumentFactory();
		DocumentFactory excel=new ExcelDocumentFactory();
		
		//creating doc using factory
		Document worddoc=word.createDocument();
		Document pdfdoc=pdf.createDocument();
		Document exceldoc=excel.createDocument();
		
		worddoc.open();
		worddoc.close();
		
		pdfdoc.open();
		pdfdoc.close();
		
		exceldoc.open();
		exceldoc.close();
	}

}
