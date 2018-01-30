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
	MAGHĀ ("Maghā", PlanetEnum.PLANET_KETHU, DietyEnum.DIETY_PITRS),
	PŪRVA_PHALGUNĪ ("Pūrva Phalgunī", PlanetEnum.PLANET_VENUS, DietyEnum.DIETY_BHAGA),
	UTTARA_PHALGUNĪ ("Uttara Phalgunī", PlanetEnum.PLANET_SUN, DietyEnum.DIETY_ARYMAN),
	HASTA ("Hasta", PlanetEnum.PLANET_MOON, DietyEnum.DIETY_RAVI),
	CHITRA ("Chitra", PlanetEnum.PLANET_MARS, DietyEnum.DIETY_RAVI),
	SWATI ("Swati", PlanetEnum.PLANET_RAHU, DietyEnum.DIETY_VAYU),
	VISAKHA ("Visakha", PlanetEnum.PLANET_JUPITER, DietyEnum.DIETY_INDRA),
	ANURADHA ("Anuradha", PlanetEnum.PLANET_SATURN, DietyEnum.DIETY_MITRA),
	JYESHTHA ("Jyeshtha", PlanetEnum.PLANET_MERCURY, DietyEnum.DIETY_INDRA),
	MULA ("Mula", PlanetEnum.PLANET_KETHU, DietyEnum.DIETY_NIRRTI),
	PURVA_ASHADHA ("Purva Ashadha", PlanetEnum.PLANET_VENUS, DietyEnum.DIETY_APAH),
	UTTARA_ASHADHA ("Uttara Ashadha", PlanetEnum.PLANET_SUN, DietyEnum.DIETY_VISVEDEVAS),
	ABHIJIT ("Abhijit", null, DietyEnum.DIETY_BRAHMA),
	SHRAVANA ("Shravana", PlanetEnum.PLANET_MOON, DietyEnum.DIETY_VISHNU),
	DHANISHTA ("Dhanishta", PlanetEnum.PLANET_MARS, DietyEnum.DIETY_VASUS),
	SHATABHISHA ("Shatabhisha", PlanetEnum.PLANET_RAHU, DietyEnum.DIETY_VARUNA),
	PURVA_BHADRAPADA ("Purva Bhadrapada", PlanetEnum.PLANET_JUPITER, DietyEnum.DIETY_AJAIKAPADA),
	UTTARA_BHADRAPADA ("Uttara Bhadrapada", PlanetEnum.PLANET_SATURN, DietyEnum.DIETY_AHIR_BUDHYANA),
	REVATI ("Revati", PlanetEnum.PLANET_MERCURY, DietyEnum.DIETY_PUSHAN);
	
	String name;
	PlanetEnum lord;
	DietyEnum dietyEnum;
	StarEnum (String name, PlanetEnum lord, DietyEnum dietyEnum) {
		this.name = name;
		this.lord = lord;
		this.dietyEnum = dietyEnum;
	}
}
