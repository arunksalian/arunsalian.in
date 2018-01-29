package in.slin.app.core.data;

public enum ZodiacEnum {
	
	ARIES ("Aries", "Maish", PlanetEnum.PLANET_MARS),
	TAURUS ("Taurus", "Vrish", PlanetEnum.PLANET_VENUS),
	GEMINI ("Gemini", "Mithun", PlanetEnum.PLANET_MERCURY),
	CANCER ("Cancer", "Kark", PlanetEnum.PLANET_MOON),
	LEO ("Leo", "Singh", PlanetEnum.PLANET_SUN),
	VIRGO ("Virgo", "Kanya", PlanetEnum.PLANET_MERCURY)
	;
	
	String name;
	String otherName;
	PlanetEnum lord;
	ZodiacEnum (String name, String otherName, PlanetEnum lord) {
		this.lord = lord;
		this.name = name;
		this.otherName = otherName;
	}
}
