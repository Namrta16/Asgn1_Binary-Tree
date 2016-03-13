import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

//Test class for checking output of inorder Traversal
public class BinaryTreeInorderTest 
	{	
		private List <String> inorderList = new ArrayList<String>();
		private List <String> expectedInorderList=new ArrayList<String>();

		@Test
		public void testTreeResult() 
			{
		
				  String[] months = {"Jan","Feb","Mar","Apr","May","Jun",
				            "Jul","Aug","Sep","Oct","Nov","Dec"};
				  BinaryTree tree = new BinaryTree();
				  
				  // loop for inserting data into tree
				  for (int i = 0; i < months.length; i++)
				       tree.insert(months[i]);
				  				
			    	//adding alphabetical ordered elements in expectedInorderList which is desired output	
			        expectedInorderList.add("Apr");
			        expectedInorderList.add("Aug");
			        expectedInorderList.add("Dec");
			        expectedInorderList.add("Feb");			    
			        expectedInorderList.add("Jan");
			        expectedInorderList.add("Jul");
			        expectedInorderList.add("Jun");
			        expectedInorderList.add("Mar");
			        expectedInorderList.add("May");
			        expectedInorderList.add("Nov");
			        expectedInorderList.add("Oct");
			        expectedInorderList.add("Sep");
	             
			        //inorderList will contain generated result
			        inorderList = tree.getOrderedList();
			        System.out.println(inorderList);
			        
			        assertEquals(expectedInorderList,inorderList);			    			 
			}
	}

