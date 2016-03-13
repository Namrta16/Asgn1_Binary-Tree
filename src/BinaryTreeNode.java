
// BinaryTreeNode is representing nodes(the smallest element of binary tree).
public class BinaryTreeNode<T>
    {
	    // nodeData is representing data at each node
        public String nodeData; 
        public BinaryTreeNode<T> leftNode, rightNode;
        public BinaryTreeNode(String data)
            { 
        	    // construct the leaf node
                nodeData = data;
                //initializing both left and right nodes with null
                leftNode = rightNode = null;
            }
    }
