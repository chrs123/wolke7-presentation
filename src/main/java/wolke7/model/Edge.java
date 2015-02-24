package wolke7.model;

/**
 * 
 * @author Thomas Schoenfeld
 * @date 2015-02-08
 *
 *       Die Klasse Edge beschreibt eine Kante.
 */
public class Edge {

	private String edgeId;
	private Node fromNode;
	private Node toNode;

	/**
	 * Standard-Konstruktor der Klasse Edge.
	 */
	public Edge() {
	}

	/**
	 * Konstruktor der Klasse Edge.
	 * 
	 * @param edgeId
	 * @param fromNode
	 * @param toNode
	 */
	public Edge(String edgeId, Node fromNode, Node toNode) {
		super();
		this.edgeId = edgeId;
		this.fromNode = fromNode;
		this.toNode = toNode;
	}

	/**
	 * @return the edgeId
	 */
	public String getEdgeId() {
		return edgeId;
	}

	/**
	 * @param edgeId
	 *            the edgeId to set
	 */
	public void setEdgeId(String edgeId) {
		this.edgeId = edgeId;
	}

	/**
	 * @return the fromNode
	 */
	public Node getFromNode() {
		return fromNode;
	}

	/**
	 * @param fromNode
	 *            the fromNode to set
	 */
	public void setFromNode(Node fromNode) {
		this.fromNode = fromNode;
	}

	/**
	 * @return the toNode
	 */
	public Node getToNode() {
		return toNode;
	}

	/**
	 * @param toNode
	 *            the toNode to set
	 */
	public void setToNode(Node toNode) {
		this.toNode = toNode;
	}

}
