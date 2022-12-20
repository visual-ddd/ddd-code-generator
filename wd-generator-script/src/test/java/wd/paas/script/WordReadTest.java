package wd.paas.script;

import com.spire.doc.Document;
import com.spire.doc.DocumentObject;
import com.spire.doc.Section;
import com.spire.doc.Table;
import com.spire.doc.TableRow;
import com.spire.doc.documents.DocumentObjectType;
import com.spire.doc.documents.Paragraph;

public class WordReadTest {

    public static void main(String[] args) {
        String path="/Users/shimmer/Downloads/【1018165】渠道带看单方案20220816_ V5.0.docx";

        StringBuilder stringBuilder = new StringBuilder();
        spireParaghDoc(path, stringBuilder);
//        spireForTableOfDoc(path);
    }

    //读取段落
    public static StringBuilder spireParaghDoc(String path, StringBuilder stringBuilder) {
        Document doc = new Document(path);
        for (int i = 0; i < doc.getSections().getCount(); i++) {
            Section p = doc.getSections().get(i);
            for (int j = 0; j < p.getParagraphs().getCount(); j++) {
                Paragraph paragraph = p.getParagraphs().get(j);
                stringBuilder.append(paragraph.getText());
            }
        }
        return stringBuilder;
    }

    //读取表格
    public static void spireForTableOfDoc(String path) {
        Document doc = new Document(path);
        for (int i = 0; i < doc.getSections().getCount(); i++) {
            Section section = doc.getSections().get(i);
            for (int j = 0; j < section.getBody().getChildObjects().getCount(); j++) {
                DocumentObject obj = section.getBody().getChildObjects().get(j);
                if (obj.getDocumentObjectType() == DocumentObjectType.Table) {
                    Table table = (Table) obj;
                    for (int k = 0; k < table.getRows().getCount(); k++) {
                        TableRow rows = table.getRows().get(k);
                        for (int p = 0; p < rows.getCells().getCount(); p++) {
                            for (int h = 0; h < rows.getCells().get(p).getParagraphs().getCount(); h++) {
                                Paragraph f = rows.getCells().get(p).getParagraphs().get(h);
                                System.out.println(f.getText());
                            }
                        }
                    }
                }
            }
        }
    }

}
