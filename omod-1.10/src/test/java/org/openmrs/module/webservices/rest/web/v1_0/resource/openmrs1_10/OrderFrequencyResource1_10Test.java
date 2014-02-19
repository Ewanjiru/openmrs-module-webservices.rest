/**
 * The contents of this file are subject to the OpenMRS Public License
 * Version 1.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * http://license.openmrs.org
 *
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * License for the specific language governing rights and limitations
 * under the License.
 *
 * Copyright (C) OpenMRS, LLC.  All Rights Reserved.
 */
package org.openmrs.module.webservices.rest.web.v1_0.resource.openmrs1_10;

import org.openmrs.OrderFrequency;
import org.openmrs.api.context.Context;
import org.openmrs.module.webservices.rest.web.resource.impl.BaseDelegatingResourceTest;

public class OrderFrequencyResource1_10Test extends BaseDelegatingResourceTest<OrderFrequencyResource1_10, OrderFrequency> {
	
	@Override
	public OrderFrequency newObject() {
		return Context.getOrderService().getOrderFrequencyByUuid(getUuidProperty());
	}
	
	@Override
	public String getDisplayProperty() {
		return "1/day x 7 days/week";
	}
	
	@Override
	public String getUuidProperty() {
		return "28090760-7c38-11e3-baa7-0800200c9a66";
	}
	
}
