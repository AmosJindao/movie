package design.pattern.composite;

import java.util.Iterator;
import java.util.function.Consumer;

/**
 * @author amos
 * @date 2017-10-12
 */
public class Employee extends Staff{
    public Employee(String name, double salary) {
        super(name, salary);
    }

    @Override
    public double getBudget() {
        return getSalary();
    }

    @Override
    public Iterator<Staff> iterator() {
        Staff staff = this;
        return new Iterator<Staff>(){
            private int pos = 0;
            @Override
            public boolean hasNext() {
                return pos == 0;
            }

            @Override
            public Staff next() {
                if(pos == 0){
                    pos++;
                    return staff;
                }

                throw new NullPointerException("no more elements!");
            }
        };
    }

    @Override
    public void forEach(Consumer<? super Staff> consumer) {
        consumer.accept(this);
    }


}
