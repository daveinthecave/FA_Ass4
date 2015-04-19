package wordCount.visitors;
import wordCount.visitors.Visitor;
import wordCount.treeForStrings.WordSizeNode;

public class WordCountVisitor implements Visitor{
	private int uniqueWords;
	private int wordCount;
	private int characterCount;
		
	public WordCountVisitor(){
		uniqueWords = 0;
		wordCount = 0;
		characterCount = 0;
	}
	public void visit(WordSizeNode o){
		uniqueWords++;
		wordCount += o.getWordCount();
		characterCount += (o.getWordCount() * o.getWordSize());
	}
	
	public int getUniqueWords(){
		return uniqueWords;
	}
	public int getWordCount(){
		return wordCount;
	}
	public int getCharacterCount(){
		return characterCount;
	}
}
