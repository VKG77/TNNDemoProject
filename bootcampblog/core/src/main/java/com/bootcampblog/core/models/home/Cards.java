package com.bootcampblog.core.models.home;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;


@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class Cards {
	
     @Inject
    @Named("multifield/.")
    private List<CardsModel> cardList;

	public List<CardsModel> getCardList() {
		return cardList;
	}

}