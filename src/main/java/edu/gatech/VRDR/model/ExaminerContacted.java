package edu.gatech.VRDR.model;

import org.hl7.fhir.dstu3.model.BooleanType;
import org.hl7.fhir.dstu3.model.Observation;

import ca.uhn.fhir.model.api.annotation.ResourceDef;
import edu.gatech.VRDR.model.util.CommonUtil;
import edu.gatech.VRDR.model.util.ExaminerContactedUtil;

@ResourceDef(name = "Observation", profile = "http://hl7.org/fhir/us/StructureDefinition/VRDR-Examiner-Contacted")
public class ExaminerContacted extends Observation {
	public ExaminerContacted() {
		super();
		setStatus(ExaminerContactedUtil.status);
		setCode(ExaminerContactedUtil.code);
		CommonUtil.initResource(this);
	}
	public ExaminerContacted(boolean value) {
		this();
		setValue(new BooleanType(value));
	}
}
