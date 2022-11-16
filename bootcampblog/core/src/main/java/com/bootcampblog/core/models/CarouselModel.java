package com.bootcampblog.core.models;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;


@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class CarouselModel {
	
     @Inject
    @Named("multifield/.")
    private List<MultifieldModel> fieldList;

	public List<MultifieldModel> getFieldList() {
		return fieldList;
	}


}
