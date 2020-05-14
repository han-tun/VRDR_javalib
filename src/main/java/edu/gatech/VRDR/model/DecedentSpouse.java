package edu.gatech.VRDR.model;

import org.hl7.fhir.r4.model.RelatedPerson;

import ca.uhn.fhir.model.api.annotation.ResourceDef;
import edu.gatech.VRDR.model.util.CommonUtil;
import edu.gatech.VRDR.model.util.DecedentSpouseUtil;

@ResourceDef(name = "RelatedPerson", profile = "http://hl7.org/fhir/us/vrdr/VRDR-Decedent-Spouse")
public class DecedentSpouse extends RelatedPerson {
	public DecedentSpouse() {
		super();
		CommonUtil.initResource(this);
		addRelationship(DecedentSpouseUtil.code);
	}
}