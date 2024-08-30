import com.theokanning.openai.OpenAiService;
import com.theokanning.openai.completion.CompletionRequest;
import com.theokanning.openai.completion.CompletionResult;
import com.theokanning.openai.completion.CompletionRequest;

public class ChatGpt {
	
	String apikey = "";
	private static final String API_KEY = apikey;
	
	public static void main(String[] args) {
		
		OpenAiService service = new OpenAiService(API_KEY);
		
		// Criar uma requisição de completude (Completion)
        CompletionRequest request = CompletionRequest.builder()
                .model("text-davinci-003")  // Modelo a ser usado, você pode escolher outros como gpt-3.5-turbo
                .prompt("Escreva uma mensagem de saudação em português.")
                .maxTokens(50)
                .build();
        
        CompletionResult result = service.create.Completion(request);
        
        

        System.out.println(service.createCompletion(request).getChoices());
	}
}
