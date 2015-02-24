package wolke7.model;

/**
 * 
 * @author Thomas Schoenfeld
 * @date 2015-02-08
 *
 *       Die Klasse Node beschreibt einen Knoten.
 */
public class Node {

	private String nodeId;

	/**
	 * Standard-Konstruktor der Klasse Node.
	 */
	public Node() {
	}

	/**
	 * Konstruktor der Klasse Node.
	 * 
	 * @param nodeId
	 */
	public Node(String nodeId) {
		super();
		this.nodeId = nodeId;
	}

	/**
	 * 
	 * @return nodeId
	 */
	public String getNodeId() {
		return nodeId;
	}

	/**
	 * 
	 * @param nodeId
	 */
	public void setNodeId(String nodeId) {
		this.nodeId = nodeId;
	}

}
