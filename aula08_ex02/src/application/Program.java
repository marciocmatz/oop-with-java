package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import entities.Comment;
import entities.Post;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

		Comment c1 = new Comment("Have a nice trip!");
		Comment c2 = new Comment("How! Thas's awesome!");
		
		Post p1 = new Post(
				sdf.parse("13/10/2022 20:26:27"), 
				"Traveling to New Zealand",
				"A bla bla bla...",
				12);
		
		p1.addComment(c1);
		p1.addComment(c2);
		
		System.out.println(p1);
				
	}

}
