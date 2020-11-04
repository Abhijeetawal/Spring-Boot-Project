package ca.sheridancollege.awalab.beans;

import java.io.Serializable;
import lombok.Data;
@Data
public class Order implements Serializable {
	private static final long serialVersionUID = 1L;
	private int id;
    private String size;
	private final String [] sizes = {"Small", "Medium", "Large"};
	
	
	private String coffeeType;
	
	

	

}
