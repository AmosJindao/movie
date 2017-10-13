package design.pattern.composite;

import java.util.function.Consumer;

/**
 * @author amos
 * @date 2017-10-12
 */
public abstract class Staff implements Iterable<Staff>{
    private String name;
    private double salary;

    public Staff(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public abstract double getBudget();

    public abstract void forEach(Consumer<? super Staff> consumer);

}
