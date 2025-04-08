package org.openmrs.module.basicexample.web.controller;

import org.openmrs.module.webservices.rest.web.RestConstants;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller(value = "basicexampleRestController")
@RequestMapping(value = "/rest/" + RestConstants.VERSION_1 + "/" + "")
public class BasicexampleRestController {


}
