import javax.xml.transform.*;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import java.io.StringWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class main2 {

    private static final String CLOSE_TAG_REGEX = "</(.*?)>";
    private static final String OPEN_TAG_REGEX = "<([^/][^>]*)>";
    private static final String INTERNAL_TAG_REGEX = "<([^<>]+)>([^<>]+)</\\1>";


    public static void main(String[] args) {
        try {
            String xmlFilePath = "data/1.xml";
            String xmlString = convertXmlToString(xmlFilePath);
            Scanner in = new Scanner(System.in);
            System.out.println("1 - Открывающий тег\n2 - Закрывающий тег\n3 - Содержимое тега\n4 - Тег без тела\n");
            int number = in.nextInt();
                switch (number) {
                    case 1: {
                        open_close_find(xmlString, OPEN_TAG_REGEX);
                        break;
                    }
                    case 2: {
                        open_close_find(xmlString, CLOSE_TAG_REGEX);
                        break;
                    }
                    case 3: {
                        internal_find(xmlString, INTERNAL_TAG_REGEX);
                        break;
                    }
                    case 4: {
                        tag_find(xmlString, INTERNAL_TAG_REGEX);
                        break;
                    }
                    default:{
                        System.out.println("Некорректный ввод");
                        break;
                    }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static String convertXmlToString(String xmlFilePath) throws TransformerException {
        TransformerFactory tf = TransformerFactory.newInstance();
        Source xmlSource = new StreamSource(xmlFilePath);
        StringWriter writer = new StringWriter();
        Result result = new StreamResult(writer);
        Transformer transformer = tf.newTransformer();
        transformer.transform(xmlSource, result);
        return writer.getBuffer().toString();
    }

    public static void open_close_find(String str, String pattern){
        Pattern tag_pattern = Pattern.compile(pattern);
        Matcher matcher = tag_pattern.matcher(str);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }

    public static void internal_find(String str, String pattern){
        Pattern tag_pattern = Pattern.compile(pattern);
        Matcher matcher = tag_pattern.matcher(str);
        while (matcher.find()) {
            String content = matcher.group(2);
            System.out.println(content);
        }
    }

    public static void tag_find(String str, String pattern){
        Pattern tag_pattern = Pattern.compile(pattern);
        Matcher matcher = tag_pattern.matcher(str);
        while (matcher.find()) {
            String content = matcher.group(1);
            System.out.println(content);
        }
    }
    
}
