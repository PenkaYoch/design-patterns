package defaultPackage;

public enum Animal {
	
	DOGS("DOGS"),
	CATS("CATS"),
	BIRDS("BIRDS");

	public final String categoryName;

    private Animal(String category) {
        this.categoryName = category;
    }
}
