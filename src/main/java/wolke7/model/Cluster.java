package wolke7.model;

import java.util.List;

/**
 * 
 * @author Thomas Schoenfeld
 * @date 2015-02-08
 * 
 *       Ein Cluster setzt sich aus Knoten und Kanten zusammen.
 *
 */
public class Cluster {

	private List<Node> nodes;
	private List<Edge> edges;

	/**
	 * Standard-Konstruktor der Klasse Cluster
	 */
	public Cluster() {
	}

	/**
	 * Konstruktor der Klasse Cluster
	 * 
	 * @param nodes
	 * @param edges
	 */
	public Cluster(List<Node> nodes, List<Edge> edges) {
		super();
		this.nodes = nodes;
		this.edges = edges;
	}

	/**
	 * @return the nodes
	 */
	public List<Node> getNodes() {
		return nodes;
	}

	/**
	 * @param nodes
	 *            the nodes to set
	 */
	public void setNodes(List<Node> nodes) {
		this.nodes = nodes;
	}

	/**
	 * @return the edges
	 */
	public List<Edge> getEdges() {
		return edges;
	}

	/**
	 * @param edges
	 *            the edges to set
	 */
	public void setEdges(List<Edge> edges) {
		this.edges = edges;
	}

}
