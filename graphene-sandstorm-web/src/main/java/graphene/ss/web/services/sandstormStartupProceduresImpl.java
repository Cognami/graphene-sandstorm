package graphene.ss.web.services;

import graphene.dao.StartupProcedures;

public class sandstormStartupProceduresImpl implements StartupProcedures {

	@Override
	public boolean initialize() {
		return true;
	}
}