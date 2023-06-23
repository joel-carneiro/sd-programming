package ifce;

public class Student {
	private String fullName;
	private String code;
	private String courseName;

	// Constructor

	public Student(String fullName, String code, String courseName) {
		super();
		this.fullName = fullName;
		this.code = code;
		this.courseName = courseName;
	}
	
	
	// Methods
	
	@Override
	public String toString() {
		return this.fullName;
	}

	// Getters and Setters

	public void setCode(String code) {
		this.code = code;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getCode() {
		return code;
	}

	public String getCourseName() {
		return courseName;
	}

	public String getFullName() {
		return fullName;
	}
}
