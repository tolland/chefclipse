package org.limepepper.chefclipse.remotepicker.api;

import java.util.Date;

/**
 * 
 * @author Guillermo Zunino
 *
 */
public class CookbookInfo {
	
	private String name;
	private String description;
	private String url;
	private String maintainer;
	
	private String category;
	private Date updatedAt;
	private Date createdAt;
	private String latestVersion;
	private String[] versions;
	private String externalUrl;
	private double rating;
	private boolean deprecated;
	private String replacement;
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}
	/**
	 * @param url the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
	}
	/**
	 * @return the maintainer
	 */
	public String getMaintainer() {
		return maintainer;
	}
	/**
	 * @param maintainer the maintainer to set
	 */
	public void setMaintainer(String maintainer) {
		this.maintainer = maintainer;
	}
	/**
	 * @return the category
	 */
	public String getCategory() {
		return category;
	}
	/**
	 * @param category the category to set
	 */
	public void setCategory(String category) {
		this.category = category;
	}
	/**
	 * @return the updatedAt
	 */
	public Date getUpdatedAt() {
		return updatedAt;
	}
	/**
	 * @param date the updatedAt to set
	 */
	public void setUpdatedAt(Date date) {
		this.updatedAt = date;
	}
	/**
	 * @return the createdAt
	 */
	public Date getCreatedAt() {
		return createdAt;
	}
	/**
	 * @param date the createdAt to set
	 */
	public void setCreatedAt(Date date) {
		this.createdAt = date;
	}
	/**
	 * @return the latestVersion
	 */
	public String getLatestVersion() {
		return latestVersion;
	}
	/**
	 * @param latestVersion the latestVersion to set
	 */
	public void setLatestVersion(String latestVersion) {
		this.latestVersion = latestVersion;
	}
	/**
	 * @return the versions
	 */
	public String[] getVersions() {
		return versions;
	}
	/**
	 * @param versions the versions to set
	 */
	public void setVersions(String[] versions) {
		this.versions = versions;
	}
	/**
	 * @return the externalUrl
	 */
	public String getExternalUrl() {
		return externalUrl;
	}
	/**
	 * @param externalUrl the externalUrl to set
	 */
	public void setExternalUrl(String externalUrl) {
		this.externalUrl = externalUrl;
	}
	/**
	 * @return the rating
	 */
	public double getRating() {
		return rating;
	}
	/**
	 * @param rating the rating to set
	 */
	public void setRating(double rating) {
		this.rating = rating;
	}
	/**
	 * @return the deprecated
	 */
	public boolean isDeprecated() {
		return deprecated;
	}
	/**
	 * @param deprecated the deprecated to set
	 */
	public void setDeprecated(boolean deprecated) {
		this.deprecated = deprecated;
	}
	/**
	 * @return the replacement
	 */
	public String getReplacement() {
		return replacement;
	}
	/**
	 * @param replacement the replacement to set
	 */
	public void setReplacement(String replacement) {
		this.replacement = replacement;
	}
	
}
