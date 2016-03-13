import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

//Test class for checking output of reverse Traversal
public class BinaryTreeReverseTest 
	{
		private List <String>   reverseOrderList = new ArrayList<String>();
		private List <String> expectedReverseList=new ArrayList<String>();
	
		@Test
		public void testTreeResult() 
			{						
				  String[] months = {"Jan","Feb","Mar","Apr","May","Jun",
				            "Jul","Aug","Sep","Oct","Nov","Dec"};
				  				  
				  BinaryTree tree = new BinaryTree();
				 
				  // loop for inserting data into tree
				  for (int i = 0; i < months.length; i++)
				      tree.insert(months[i]);
			        
			      //adding reverse alphabetical ordered elements that 
				  //start with vowels which is desired output			       
	                expectedReverseList.add("Oct");	             
	                expectedReverseList.add("Aug");
	                expectedReverseList.add("Apr");                  
	               	              	 
	                // reverseOrderList will contain generated result	            	                
			        reverseOrderList = tree.getReverseListOfVowel();
			       
			        assertEquals(expectedReverseList,reverseOrderList);			 
			}

	}
