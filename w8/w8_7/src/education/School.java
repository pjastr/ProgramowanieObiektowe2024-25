package education;

public class School {
    private String name;
    private String address;
    private int students;

    public School(String name, String address, int students) {
        if (address == null || address.equals("")){
            this.address = "ul. Słoneczna 54, 10-710 Olsztyn";
        }
        else {
            this.address = address;
        }
        this.name = name;
        this.students = students> 0 ? students : 100;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        if (address != null && !address.equals("")){
            this.address = address;
        }
    }

    public int getStudents() {
        return students;
    }

    public void setStudents(int students) {
        this.students = students >0 ? students : this.students;
    }

    @Override
    public String toString() {
        if (name != null){
            return  getClass() +": Name: "+name+". Address: "+address+
                    ". Number of students: "+students+".";
        }
        else {
            return  getClass() +": Address: "+address+
                    ". Number of students: "+students+".";
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        School school = (School) o;
        return address.equals(school.address);
    }

    @Override
    public int hashCode() {
        return address.hashCode();
    }
}
