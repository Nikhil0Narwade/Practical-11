/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package textanalyzer;

/**
 *
 * @author nikhilnarwade
 */
public class TextAnalyzerHelper {

    /**
     * @param args the command line arguments
     * 
     */
    
    private String inputText;
    private int textLength;
    private int textLines;
    private int textTabs;
    private int textSpace;
    private int textWords;
    private String uniqueCharText;
    
        private int lineCount;
    private int spaceCount;
    private int tabCount;


    public TextAnalyzerHelper(String inputText) { //no needd for setter everytime create object gets initialized
        this.inputText = inputText;
        analyze();
                
                
    }

    public int getTextLength() {
        return textLength;
    }

    public int getTextLines() {
        return textLines;
    }

    public int getTextTabs() {
        return textTabs;
    }

    public int getTextSpace() {
        return textSpace;
    }

    public int getTextWords() {
        return textWords;
    }

    public String getUniqueCharText() {
        return uniqueCharText;
    }
    
    

    int getCharOrWorldCount(String text){
    
        
        
    return 0;
    }
        
    
//      private String inputText;
//    private int textLength;
//    private int textLines;
//    private int textTabs;
//    private int textSpace;
//    private int textWords;
//    private String uniqueCharText;
//      will make use of inputText  
    
    
    private void analyze()
    {
    
        textLength = inputText.length();
         textLines = textLength>0?inputText.split("\n",-1).length:0;       //linecoount
                  textSpace = inputText.split(" ",-1).length;       //spacecount
         textTabs = inputText.split("\t",-1).length;       // tabscount
         //lineCount = inputText.split("\n",-1).lenght;


        
        
        
        
        
    
    }

    @Override
    public String toString() {
        return "TextAnalyzerHelper{" + "inputText=" + inputText + ", textLength=" + textLength + ", textLines=" + textLines + ", textTabs=" + textTabs + ", textSpace=" + textSpace + ", textWords=" + textWords + ", uniqueCharText=" + uniqueCharText + '}';
    }

    
    
    
    
    public static void main(String[] args) {
        
        TextAnalyzerHelper textSample = new TextAnalyzerHelper(" a@adsa \t\n");
        System.out.println(textSample);
        
        
        
        // TODO code application logic here
    }
    
}
