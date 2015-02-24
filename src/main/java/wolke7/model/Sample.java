package wolke7.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 
 * @author Thomas Schoenfeld
 * @date 2015-02-08
 * 
 *       Die Klasse Sample beschreibt eine einzelne Berechnung.
 */
// @Document(collection = "samples")
@Document(collection = "experiments")
public class Sample {

	@Id
	private String id;
	private String sampleName;
	private String algorithmName;
	private int numNodes;
	private List<Node> startNodes;
	private int desiredClusterCount;
	private int clusterCount;
	private boolean validity;
	private String invalidityReason;
	private int maxClusterSize;
	private int minClusterSize;
	private List<Integer> clusterSize;
	private double clusterSpread;
	private List<Double> spreadCurve;
	private List<Cluster> clusters;
	private String uri;

	/**
	 * Standard-Konstruktor der Klasse Sample.
	 */
	public Sample() {
	}

	/**
	 * Konstruktor der Klasse Sample.
	 * 
	 * @param id
	 * @param sampleName
	 * @param uri
	 */
	public Sample(String id, String sampleName, String uri) {

		this.id = id;
		this.sampleName = sampleName;
		this.uri = uri;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the sampleName
	 */
	public String getSampleName() {
		return sampleName;
	}

	/**
	 * @param sampleName
	 *            the sampleName to set
	 */
	public void setSampleName(String sampleName) {
		this.sampleName = sampleName;
	}

	/**
	 * @return the algorithmName
	 */
	public String getAlgorithmName() {
		return algorithmName;
	}

	/**
	 * @param algorithmName
	 *            the algorithmName to set
	 */
	public void setAlgorithmName(String algorithmName) {
		this.algorithmName = algorithmName;
	}

	/**
	 * @return the numNodes
	 */
	public int getNumNodes() {
		return numNodes;
	}

	/**
	 * @param numNodes
	 *            the numNodes to set
	 */
	public void setNumNodes(int numNodes) {
		this.numNodes = numNodes;
	}

	/**
	 * @return the startNodes
	 */
	public List<Node> getStartNodes() {
		return startNodes;
	}

	/**
	 * @param startNodes
	 *            the startNodes to set
	 */
	public void setStartNodes(List<Node> startNodes) {
		this.startNodes = startNodes;
	}

	/**
	 * @return the desiredClusterCount
	 */
	public int getDesiredClusterCount() {
		return desiredClusterCount;
	}

	/**
	 * @param desiredClusterCount
	 *            the desiredClusterCount to set
	 */
	public void setDesiredClusterCount(int desiredClusterCount) {
		this.desiredClusterCount = desiredClusterCount;
	}

	/**
	 * @return the clusterCount
	 */
	public int getClusterCount() {
		return clusterCount;
	}

	/**
	 * @param clusterCount
	 *            the clusterCount to set
	 */
	public void setClusterCount(int clusterCount) {
		this.clusterCount = clusterCount;
	}

	/**
	 * @return the validity
	 */
	public boolean isValidity() {
		return validity;
	}

	/**
	 * @param validity
	 *            the validity to set
	 */
	public void setValidity(boolean validity) {
		this.validity = validity;
	}

	/**
	 * @return the invalidityReason
	 */
	public String getInvalidityReason() {
		return invalidityReason;
	}

	/**
	 * @param invalidityReason
	 *            the invalidityReason to set
	 */
	public void setInvalidityReason(String invalidityReason) {
		this.invalidityReason = invalidityReason;
	}

	/**
	 * @return the maxClusterSize
	 */
	public int getMaxClusterSize() {
		return maxClusterSize;
	}

	/**
	 * @param maxClusterSize
	 *            the maxClusterSize to set
	 */
	public void setMaxClusterSize(int maxClusterSize) {
		this.maxClusterSize = maxClusterSize;
	}

	/**
	 * @return the minClusterSize
	 */
	public int getMinClusterSize() {
		return minClusterSize;
	}

	/**
	 * @param minClusterSize
	 *            the minClusterSize to set
	 */
	public void setMinClusterSize(int minClusterSize) {
		this.minClusterSize = minClusterSize;
	}

	/**
	 * @return the clusterSize
	 */
	public List<Integer> getClusterSize() {
		return clusterSize;
	}

	/**
	 * @param clusterSize
	 *            the clusterSize to set
	 */
	public void setClusterSize(List<Integer> clusterSize) {
		this.clusterSize = clusterSize;
	}

	/**
	 * @return the clusterSpread
	 */
	public double getClusterSpread() {
		return clusterSpread;
	}

	/**
	 * @param clusterSpread
	 *            the clusterSpread to set
	 */
	public void setClusterSpread(double clusterSpread) {
		this.clusterSpread = clusterSpread;
	}

	/**
	 * @return the spreadCurve
	 */
	public List<Double> getSpreadCurve() {
		return spreadCurve;
	}

	/**
	 * @param spreadCurve
	 *            the spreadCurve to set
	 */
	public void setSpreadCurve(List<Double> spreadCurve) {
		this.spreadCurve = spreadCurve;
	}

	/**
	 * @return the clusters
	 */
	public List<Cluster> getClusters() {
		return clusters;
	}

	/**
	 * @param clusters
	 *            the clusters to set
	 */
	public void setClusters(List<Cluster> clusters) {
		this.clusters = clusters;
	}

	/**
	 * @return the uri
	 */
	public String getUri() {
		return uri;
	}

	/**
	 * @param uri
	 *            the uri to set
	 */
	public void setUri(String uri) {
		this.uri = uri;
	}

}
