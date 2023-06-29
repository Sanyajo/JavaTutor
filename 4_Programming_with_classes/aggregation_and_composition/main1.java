import java.util.*;

public class main1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Text text = new Text("Пример текста");
        text.setText("Это первое предложение. Это второе предложение.");
        text.printText();

        String title = text.getTitle();
        System.out.println("заголовок: " + title);

    }
}

class Word{
    private String word;

    Word(String word){
        this.word = word;
    }
    public String getWord(){
        return this.word;
    }
}

class Sentence{
    private List<Word> words;

    Sentence(){
        words = new ArrayList<>();
    }

    public void setWords(Word word){
        this.words.add(word);
    }
    public String getSentence(){
        StringBuilder sb = new StringBuilder();
        for(Word word : words){
            sb.append(word.getWord()).append(" ");
        }
        sb.deleteCharAt(sb.length()-1);
        sb.append(".");
        return sb.toString();
    }
}

class Text{
    private String title;
    private List<Sentence> sentences;

    Text(String title){
        this.title = title;
        sentences = new ArrayList<>();
    }

    public void setSentences(Sentence sentence){
        sentences.add(sentence);
    }

    public String getTitle(){
        return this.title;
    }

    public void printText(){
        System.out.println(this.title);
        for(Sentence sentence: sentences){
            System.out.println(sentence.getSentence());
        }
    }

    public void setText(String text){
        String[] sentences = text.split("\\.");
        for(String sentence: sentences){
            Sentence sentence1 = new Sentence();
            String[] words = sentence.trim().split(" ");
            for(String word : words){
                Word newWord = new Word(word);
                sentence1.setWords(newWord);
            }
            setSentences(sentence1);
        }
    }
}