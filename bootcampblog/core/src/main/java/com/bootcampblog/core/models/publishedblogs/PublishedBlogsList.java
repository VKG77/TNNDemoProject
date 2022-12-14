package com.bootcampblog.core.models.publishedblogs;

import java.util.List;

import javax.inject.Inject;


import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Default;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class PublishedBlogsList {

	@Inject
	@Default(values="multifield")
    private List<PublishedItems> multifield;

	public List<PublishedItems> getMultifield() {
		return multifield;
	}

	
    
    
}
