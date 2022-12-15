import java.util.Objects;

public class Student {
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
//        System.out.println("===================INSIDE Equals====================:"+getId());
//
//        if (this == o) return true;
//        if (!(o instanceof Student)) return false;
//        Student student = (Student) o;
//        return getId() == student.getId() && Objects.equals(getName(), student.getName());
        System.out.println("inside equals:");
        return false;
   }
    @Override
    public int hashCode() {

        System.out.println("inside hashcode:"+getId());
        return 1;
        // return Objects.hash(getId(), getName());
    }
    private int id;
    private String name;


}
