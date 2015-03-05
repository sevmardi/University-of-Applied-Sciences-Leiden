import java.awt.List;
import java.util.ArrayList;



public class Node
{
	private List<Edge> edges = new ArrayList<>();
	private String name; 
	
	public Node(String name) {
		
		this.name = name;		
	}
	public void add(Node endNode, int weight)
	{
		Edge edge = new Edge();
		edge.setWeight(weight);
		edge.setEndNode(endNode);	
	}

	
}
