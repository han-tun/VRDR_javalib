package edu.gatech.VRDR.model;

import org.hl7.fhir.dstu3.model.CodeableConcept;
import org.hl7.fhir.dstu3.model.HumanName;
import org.hl7.fhir.dstu3.model.Identifier;
import org.hl7.fhir.dstu3.model.Practitioner;

import ca.uhn.fhir.model.api.annotation.ResourceDef;

@ResourceDef(name = "Mortician", profile = "http://www.hl7.org/fhir/us/vrdr/StructureDefinition/VRDR-Mortician")
public class Mortician extends Practitioner {
	public Mortician(HumanName name, String qualificationIdentifier, CodeableConcept qualificationCode) {
		addName(name);
		PractitionerQualificationComponent component = new PractitionerQualificationComponent();
		component.addIdentifier(new Identifier().setValue(qualificationIdentifier));
		component.setCode(qualificationCode);
	}
}
