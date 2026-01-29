/*
	Author: 
	Date: 
	Collaborator(s):
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		Spiderman Tobey = new Spiderman("Tobey Maguire", 48, "Green Goblin");
		Tobey.SpidermanToString();
	
		Spiderman Andrew = new Spiderman("Andrew Garfield", 40, "Electro");
		Andrew.SpidermanToString();
		
		Spiderman Tom = new Spiderman("Tom Holland", 27, "The Vulture");
		Tom.SpidermanToString();
		
		Spiderman Ella = new Spiderman("Ella Soh", 18, "Val Shin");
		Ella.SpidermanToString();
	}
}
