/**
 * This class is generated by jOOQ
 */
package io.cattle.platform.core.model;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.3.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
@javax.persistence.Entity
@javax.persistence.Table(name = "container_event", schema = "cattle")
public interface ContainerEvent extends java.io.Serializable {

	/**
	 * Setter for <code>cattle.container_event.id</code>.
	 */
	public void setId(java.lang.Long value);

	/**
	 * Getter for <code>cattle.container_event.id</code>.
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "id", unique = true, nullable = false, precision = 19)
	public java.lang.Long getId();

	/**
	 * Setter for <code>cattle.container_event.account_id</code>.
	 */
	public void setAccountId(java.lang.Long value);

	/**
	 * Getter for <code>cattle.container_event.account_id</code>.
	 */
	@javax.persistence.Column(name = "account_id", precision = 19)
	public java.lang.Long getAccountId();

	/**
	 * Setter for <code>cattle.container_event.kind</code>.
	 */
	public void setKind(java.lang.String value);

	/**
	 * Getter for <code>cattle.container_event.kind</code>.
	 */
	@javax.persistence.Column(name = "kind", nullable = false, length = 255)
	public java.lang.String getKind();

	/**
	 * Setter for <code>cattle.container_event.state</code>.
	 */
	public void setState(java.lang.String value);

	/**
	 * Getter for <code>cattle.container_event.state</code>.
	 */
	@javax.persistence.Column(name = "state", nullable = false, length = 128)
	public java.lang.String getState();

	/**
	 * Setter for <code>cattle.container_event.created</code>.
	 */
	public void setCreated(java.util.Date value);

	/**
	 * Getter for <code>cattle.container_event.created</code>.
	 */
	@javax.persistence.Column(name = "created")
	public java.util.Date getCreated();

	/**
	 * Setter for <code>cattle.container_event.data</code>.
	 */
	public void setData(java.util.Map<String,Object> value);

	/**
	 * Getter for <code>cattle.container_event.data</code>.
	 */
	@javax.persistence.Column(name = "data", length = 16777215)
	public java.util.Map<String,Object> getData();

	/**
	 * Setter for <code>cattle.container_event.external_id</code>.
	 */
	public void setExternalId(java.lang.String value);

	/**
	 * Getter for <code>cattle.container_event.external_id</code>.
	 */
	@javax.persistence.Column(name = "external_id", length = 255)
	public java.lang.String getExternalId();

	/**
	 * Setter for <code>cattle.container_event.external_status</code>.
	 */
	public void setExternalStatus(java.lang.String value);

	/**
	 * Getter for <code>cattle.container_event.external_status</code>.
	 */
	@javax.persistence.Column(name = "external_status", length = 255)
	public java.lang.String getExternalStatus();

	/**
	 * Setter for <code>cattle.container_event.external_from</code>.
	 */
	public void setExternalFrom(java.lang.String value);

	/**
	 * Getter for <code>cattle.container_event.external_from</code>.
	 */
	@javax.persistence.Column(name = "external_from", length = 255)
	public java.lang.String getExternalFrom();

	/**
	 * Setter for <code>cattle.container_event.external_timestamp</code>.
	 */
	public void setExternalTimestamp(java.lang.Long value);

	/**
	 * Getter for <code>cattle.container_event.external_timestamp</code>.
	 */
	@javax.persistence.Column(name = "external_timestamp", precision = 19)
	public java.lang.Long getExternalTimestamp();

	/**
	 * Setter for <code>cattle.container_event.reported_host_uuid</code>.
	 */
	public void setReportedHostUuid(java.lang.String value);

	/**
	 * Getter for <code>cattle.container_event.reported_host_uuid</code>.
	 */
	@javax.persistence.Column(name = "reported_host_uuid", length = 255)
	public java.lang.String getReportedHostUuid();

	/**
	 * Setter for <code>cattle.container_event.host_id</code>.
	 */
	public void setHostId(java.lang.Long value);

	/**
	 * Getter for <code>cattle.container_event.host_id</code>.
	 */
	@javax.persistence.Column(name = "host_id", precision = 19)
	public java.lang.Long getHostId();

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * Load data from another generated Record/POJO implementing the common interface ContainerEvent
	 */
	public void from(io.cattle.platform.core.model.ContainerEvent from);

	/**
	 * Copy data into another generated Record/POJO implementing the common interface ContainerEvent
	 */
	public <E extends io.cattle.platform.core.model.ContainerEvent> E into(E into);
}