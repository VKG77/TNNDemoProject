package com.bootcampblog.core.models.publishedblogs;

import javax.inject.Inject;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class PublishedItems {

	@Inject
	private String techtitle;
	
	@Inject
	private String feature;
	
	@Inject
	private String img;
	
	@Inject
	private String postdate;
	
	@Inject
	private String desc;
	
	@Inject
	private String link;
	
	public String getTechtitle() {
		return techtitle;
	}

	public String getFeature() {
		return feature;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getImg() {
		return img;
	}

	public String getPostdate() {
		return postdate;
	}

	public String getLink() {
		return link;
	}

	public void setTechtitle(String techtitle) {
		this.techtitle = techtitle;
	}

	public void setFeature(String feature) {
		this.feature = feature;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public void setPostdate(String postdate) {
		this.postdate = postdate;
	}

	public void setLink(String link) {
		this.link = link;
	}

}
