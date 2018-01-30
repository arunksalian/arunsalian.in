package in.slin.app.core.data;



public enum ZodiacEnum {
	
	ARIES ("Aries", "Maish", PlanetEnum.PLANET_MARS),
	TAURUS ("Taurus", "Vrish", PlanetEnum.PLANET_VENUS),
	GEMINI ("Gemini", "Mithun", PlanetEnum.PLANET_MERCURY),
	CANCER ("Cancer", "Kark", PlanetEnum.PLANET_MOON),
	LEO ("Leo", "Singh", PlanetEnum.PLANET_SUN),
	VIRGO ("Virgo", "Kanya", PlanetEnum.PLANET_MERCURY),
	LIBRA ("Libra", "Tula", PlanetEnum.PLANET_VENUS),
	SCORPIO("Scorpio", "Vrishchik", PlanetEnum.PLANET_MARS),
	SAGITTARIUS("Sagittarius", "Dhanu", PlanetEnum.PLANET_JUPITER),
	CAPRICORN("Capricorn", "Makar", PlanetEnum.PLANET_SATURN),
	AQUARIUS ("Aquarius", "Kumbh", PlanetEnum.PLANET_SATURN),
	PISCES ("Pisces", "Meen", PlanetEnum.PLANET_JUPITER);
	
	
	String name;
	String otherName;
	PlanetEnum lord;
	ZodiacEnum (String name, String otherName, PlanetEnum lord) {
		this.lord = lord;
		this.name = name;
		this.otherName = otherName;
	}
}
