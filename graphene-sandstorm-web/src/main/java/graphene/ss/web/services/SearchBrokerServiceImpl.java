package graphene.ss.web.services;

import graphene.web.pages.CombinedEntitySearchPage;
import graphene.web.services.SearchBrokerService;

public class SearchBrokerServiceImpl implements SearchBrokerService {

	@Override
	public String getSearchPage(String searchValue) {
		return "graphene/"+CombinedEntitySearchPage.class.getSimpleName();
	}

}
