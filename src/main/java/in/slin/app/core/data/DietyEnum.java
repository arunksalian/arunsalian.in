package in.slin.app.core.data;

public enum DietyEnum  {

	DIETY_YAMA("yama"),
	DIETY_ASHVINS("ashvins"),
	DIETY_AGNI ("agni"),
	DIETY_BRAHMA ("brahma"),
	DIETY_SOMA ("soma", PlanetEnum.PLANET_MOON),
	DIETY_RUDRA ("rudra"),
	DIETY_ADITI ("aditi"),
	DIETY_GURU ("guru", PlanetEnum.PLANET_JUPITER),
	DIETY_NAGAS ("nagas"),
	DIETY_BHAGA ("bhaga"),
	DIETY_ARYMAN ("aryaman"),
	DIETY_RAVI ("ravi", PlanetEnum.PLANET_SUN);
	
	private String name;
	private PlanetEnum planetEnum;
	
	private DietyEnum (String name) {
		this.name = name;
	}
	
	private DietyEnum (String name, PlanetEnum planetEnum) {
		this.name = name;
		this.planetEnum = planetEnum;
	}
}
