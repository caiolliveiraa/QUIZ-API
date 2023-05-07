package Quiz;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import com.example.demo.model.Cliente;

import jakarta.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity

public class Question {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String question;
	private Answer answer;
	private int point;
	
	@OneToOne(mappedBy = "questions")
	private Category category;
	
	
	

}
