package Javaenumcode;

public enum TestEnum {
	MONDAY("Monday"),
	TUESDAY("tuesday"),
	WEDNESDAY("wednesday"),
	THURSDAY("thursday"),
	FRIDAY("friday"),
	SATURDAY("saturday"),
	SUNDAY("sunday");
	
	private String name;

	private TestEnum(String name) {
		this.name = name;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

}
