package chapter8;

public class Q4 {
  public class Employee{
    public String name;
    public String grade;

    public Employee(String name) {
      this.name = name;
    }
  }

  public class Engineer extends Employee{
    private String skillset;

    public Engineer(String name) {
      super(name);
    }

    public String getSkillset() {
      return skillset;
    }

    public void setSkillset(String skillset) {
      this.skillset = skillset;
    }
  }
  public static void main(String[] args) {

  }

}
