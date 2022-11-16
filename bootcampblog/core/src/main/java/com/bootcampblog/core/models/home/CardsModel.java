package com.bootcampblog.core.models.home;

import javax.inject.Inject;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class CardsModel {

	@Inject
	private String title;
	
	@Inject
	private String bannerImage;
	
	@Inject
	private String readMore;
	

	@Inject
	private String link;
	
	@Inject
	private String techtitle;
	
	public String getTechtitle() {
		return techtitle;
	}
	public void setTechtitle(String techtitle) {
		this.techtitle = techtitle;
	}
	
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
