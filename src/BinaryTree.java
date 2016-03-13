import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

// Creating Binary Search Tree
public class BinaryTree
    {
	
	// root node is hidden   
    private BinaryTreeNode root; 
    
    // insert method to insert new entry in the tree  
    public void insert(String newNodeData)
        {
    	    // checking case of empty tree 
            if (root == null)
                { 
            	    //Initializing the root
                    root = new BinaryTreeNode(newNodeData);
                    return;
                }
            
            BinaryTreeNode nodeLocation = root;// start the search with root node
            while (true)
                {
                    if (newNodeData.compareTo(nodeLocation.nodeData) < 0)
                        { 
                    	    // search leftNode
                            if (nodeLocation.leftNode != null) 
                            	nodeLocation = nodeLocation.leftNode;
                            else
                                {
                            	   // add the new node in the left subtree
                                   nodeLocation.leftNode = new BinaryTreeNode(newNodeData);
                                   break;
                                }
                        }
                    else if (newNodeData.compareTo(nodeLocation.nodeData) > 0)
                        { 
                    	    // search rightNode
                            if (nodeLocation.rightNode != null) 
                            	nodeLocation = nodeLocation.rightNode;
                            else
                                {
                            	  // add the new node in the right subtree
                                  nodeLocation.rightNode = new BinaryTreeNode(newNodeData);
                                  break;
                                }
                        }
                    else break; // if element is found, then break
                }
        }
    
    // getOrderedList will generate alphabetical ordered elements
    public List<String> getOrderedList()
        {
            ArrayList<String> orderedList=  (ArrayList<String>) inorderTraversal();
			return orderedList;
        }
    
    // inorderTraversal is the function that does the work of getting ordered elements
    private List<String> inorderTraversal()
    {
    	
        Stack<BinaryTreeNode> stack = new Stack<BinaryTreeNode>();
        ArrayList<String> inorderList = new ArrayList<String>();
               
        if (root == null) // checking empty tree
        {
            return null; 
        }
        
        BinaryTreeNode treeNode = root; // start the search with root node
      /*  while (!stack.empty() || treeNode != null)
        {
            if (treeNode != null) 
            {
                stack.push(treeNode);//pushing elements into stack
                treeNode = treeNode.leftNode;
                continue;
            }
            treeNode = (BinaryTreeNode)stack.pop(); //popping up elements from stack.
            inorderList.add(treeNode.nodeData);           
            treeNode = treeNode.rightNode;
        }
        return inorderList;    
    }
        while (!stack.empty() || treeNode != null)
    {
    	 treeNode = (BinaryTreeNode)stack.pop(); //popping up elements from stack.
         
        if (treeNode.rightNode != null) 
              stack.push(treeNode.rightNode);//pushing elements into stack

        if (treeNode.leftNode != null) 
              stack.push(treeNode.leftNode);//pushing elements into stack
          // treeNode = treeNode.leftNode; */
        while (true)
        {
            // check if we have to pop a value of the stack WITHOUT LOOPING:
            // It is guaranteed that there never is a null node on the stack.
            if (treeNode == null) {
              if (!stack.empty()) 
            	  treeNode = stack.pop();
            }
//http://codereview.stackexchange.com/questions/29568/preorder-traversal-using-stack
            System.out.print(treeNode.nodeData + ":");
            inorderList.add(treeNode.nodeData);  
            // store the right node to continue there later
            if (treeNode.rightNode != null) stack.push(treeNode.rightNode);

            treeNode = treeNode.leftNode;
        }     
    }
    
    // getReverseListOfVowel will generate reverse alphabetical ordered elements that starts with vowel
    public List<String> getReverseListOfVowel()
        {   	
           ArrayList<String> reverseList=  (ArrayList<String>) reverseTraversal();
		   return reverseList;
        }
    
    // reverseTraversal is the function that does the work  generating
    //reverse alphabetical ordered elements that starts with vowel
    private  List<String>  reverseTraversal(){
        Stack<BinaryTreeNode> stack = new Stack<BinaryTreeNode>();
        ArrayList<String> reversedList = new ArrayList<String>();
        if (root == null) // checking empty tree
        {
            return null;
        }
        BinaryTreeNode treeNode = root; // start the search with root node
        while (!stack.empty() || treeNode != null) 
        {
            if (treeNode != null) 
            {
                stack.push(treeNode);//pushing elements into stack
                treeNode = treeNode.rightNode;
                continue;
            }
            treeNode = (BinaryTreeNode)stack.pop(); //popping up elements from stack.
           
            String element = treeNode.nodeData;
            char firstLetter = (Character.toUpperCase(element.charAt(0)));// making it case sensitive
            if(firstLetter=='A' || firstLetter=='E' || firstLetter=='I' || firstLetter=='O' || firstLetter=='U')
            {
            	reversedList.add(treeNode.nodeData);
            }
            treeNode = treeNode.leftNode;
        }
        return reversedList;
    }
}
