package in.slin.app.core.data;

public enum PlanetEnum {

	PLANET_SUN ("sun", "ravi"),
	PLANET_MOON ("moon", "soma"),
	PLANET_MERCURY ("mercury", "bhdh"),
	PLANET_VENUS ("venus", "shukra"),
	PLANET_MARS ("mars", "mangal"),
	PLANET_JUPITER ("jupiter", "guru"),
	PLANET_SATURN ("saturn", "shani"),
	PLANET_RAHU ("rahu", "rahu"),
	PLANET_KETHU ("kethu", "kethu");
	
	String name;
	String secondName;
	PlanetEnum (String name, String secondName) {
		this.name = name;
		this.secondName = secondName;
	}
}
