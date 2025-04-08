/**
 * This Source Code Form is subject to the terms of the Mozilla Public License,
 * v. 2.0. If a copy of the MPL was not distributed with this file, You can
 * obtain one at http://mozilla.org/MPL/2.0/. OpenMRS is also distributed under
 * the terms of the Healthcare Disclaimer located at http://openmrs.org/license.
 *
 * Copyright (C) OpenMRS Inc. OpenMRS is a registered trademark and the OpenMRS
 * graphic logo is a trademark of OpenMRS Inc.
 */
package org.openmrs.module.basicexample.api.impl;

import org.openmrs.api.APIException;
import org.openmrs.api.UserService;
import org.openmrs.api.impl.BaseOpenmrsService;
import org.openmrs.module.basicexample.Department;
import org.openmrs.module.basicexample.Item;
import org.openmrs.module.basicexample.api.BasicexampleService;
import org.openmrs.module.basicexample.api.dao.BasicexampleDao;

public class BasicexampleServiceImpl extends BaseOpenmrsService implements BasicexampleService {
	
	BasicexampleDao dao;
	
	UserService userService;
	
	/**
	 * Injected in moduleApplicationContext.xml
	 */
	public void setDao(BasicexampleDao dao) {
		this.dao = dao;
	}
	
	/**
	 * Injected in moduleApplicationContext.xml
	 */
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	@Override
	public Item getItemByUuid(String uuid) throws APIException {
		return dao.getItemByUuid(uuid);
	}

	@Override
	public Department getDepartmentByDepartmentId(int department_id) throws APIException {
		return dao.getDepartmentByDepartmentId(department_id);
	}

	@Override
	public Item saveItem(Item item) throws APIException {
		if (item.getOwner() == null) {
			item.setOwner(userService.getUser(1));
		}
		
		return dao.saveItem(item);
	}

	@Override
	public Department saveDepartment(Department department) throws APIException {
		if(department.getCreator() == null){
			department.setCreator(userService.getUser(1));
		}
		return dao.saveDepartment(department);
	}
}
