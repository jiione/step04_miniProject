
package model.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class Book {
	
	private String isbn;
	private String title;
	private String author;
	private boolean status; // true : 대여중, false : 대출가능
	
}

