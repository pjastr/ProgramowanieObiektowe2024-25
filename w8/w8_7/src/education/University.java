package education;

public class University extends School{

    private String type;
    private int studies;

    public University(String name, String address, int students, String type, int studies) {
        super(name, address, students);
        this.type = type.isEmpty() ? "university of technology" : type;
        this.studies = studies >= 0 ? studies : 10;
    }

    public int getStudies() {
        return studies;
    }

    public void setStudies(int studies) {
        this.studies = studies;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "University{" +
                "type='" + type + '\'' +
                ", studies=" + studies +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;

        University that = (University) o;
        return studies == that.studies;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + studies;
        return result;
    }
}
