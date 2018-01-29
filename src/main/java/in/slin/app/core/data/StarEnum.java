package in.slin.app.core.data;

public enum StarEnum {

	ASHVINI ("Ashvini", PlanetEnum.PLANET_KETHU, DietyEnum.DIETY_ASHVINS),
	BHARANI ("Bharani", PlanetEnum.PLANET_VENUS, DietyEnum.DIETY_YAMA),
	KRITTIKA ("Krittika", PlanetEnum.PLANET_SUN, DietyEnum.DIETY_AGNI),
	ROHINI ("Rohini", PlanetEnum.PLANET_MOON, DietyEnum.DIETY_BRAHMA),
	MRIGASHĪRSHA ("Mrigashīrsha", PlanetEnum.PLANET_MARS, DietyEnum.DIETY_SOMA),
	ARDRA ("Ardra", PlanetEnum.PLANET_RAHU, DietyEnum.DIETY_RUDRA),
	PUNARVASU ("Punarvasu", PlanetEnum.PLANET_JUPITER, DietyEnum.DIETY_ADITI),
	PUSHYA ("Pushya", PlanetEnum.PLANET_SATURN, DietyEnum.DIETY_GURU),
	ĀSHLESHĀ ("Āshleshā", PlanetEnum.PLANET_MERCURY, DietyEnum.DIETY_NAGAS),
	PŪRVA_PHALGUNĪ ("Pūrva Phalgunī", PlanetEnum.PLANET_VENUS, DietyEnum.DIETY_BHAGA),
	UTTARA_PHALGUNĪ ("Uttara Phalgunī", PlanetEnum.PLANET_SUN, DietyEnum.DIETY_ARYMAN),
	HASTA ("Hasta", PlanetEnum.PLANET_MOON, DietyEnum.DIETY_RAVI),
	;
	
	String name;
	PlanetEnum lord;
	DietyEnum dietyEnum;
	StarEnum (String name, PlanetEnum lord, DietyEnum dietyEnum) {
		this.name = name;
		this.lord = lord;
		this.dietyEnum = dietyEnum;
	}
}
