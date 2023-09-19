package clinic.programming.training;

import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.StringUtils;

public class Application {
    
    
    public int countWords(String words){
    	String[] separateWords = StringUtils.split(words, ' ');
    	return (separateWords == null)? 0 : separateWords.length;
    }
    
    
    public void greet(){
    	
    	List<String> greetings = new ArrayList<>();
    	
    	greetings.add("Olá");
    	greetings.add("Tudo bem?");
    	
    	for (String greeting : greetings) {
    		System.out.println("Greeting: " + greeting);
    	}	
    }    


    public Application() {
        System.out.println ("Inside Application");
    }


    public static void main (String[] args) {
    
    	System.out.println ("Starting Application");
    	
	Application app = new Application();
	app.greet();
	int count = app.countWords("frase com 4 palavras");
	System.out.println("Contador de palavras: " + count);
    }
}
