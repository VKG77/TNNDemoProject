package com.bootcampblog.core.models;

import javax.inject.Inject;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class MultifieldModel {
	
	@Inject
	private String title;
	
	@Inject
	private String bannerImage;
	
	@Inject
	private String readMore;
	
	@Inject
	private String link;
	
	public String getTitle() {
		return title;
	}
	public String getBannerImage() {
		return bannerImage;
	}
	public String getReadMore() {
		return readMore;
	}
	public String getLink() {
		return link;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setBannerImage(String bannerImage) {
		this.bannerImage = bannerImage;
	}
	public void setReadMore(String readMore) {
		this.readMore = readMore;
	}
	public void setLink(String link) {
		this.link = link;
	}

}
