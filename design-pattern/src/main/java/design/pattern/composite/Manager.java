package design.pattern.composite;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;

/**
 * @author amos
 * @date 2017-10-12
 */
public class Manager extends Staff{
    private List<Staff> staffs = new LinkedList<>();

    public Manager(String name, double salary) {
        super(name, salary);
    }

    public void addStaff(Staff staff){
        if(staff == null){
            throw new IllegalArgumentException("staff can not be null!");
        }
        staffs.add(staff);
    }

    @Override
    public double getBudget() {
        double budget = 0.0;

        for(Staff staff:staffs){
            budget += staff.getBudget();
        }

        budget += getSalary();

        return budget;
    }

    @Override
    public Iterator<Staff> iterator() {
        Staff staff = this;
        return new Iterator<Staff>(){
            private int pos = 0;
            @Override
            public boolean hasNext() {
                return pos <= staffs.size();
            }

            @Override
            public Staff next() {
                Staff lstaff = null;
                if(pos == 0){
                    lstaff = staff;
                }else{
                    lstaff = staffs.get(pos-1);
                }
                pos ++;

                return lstaff;
            }
        };
    }

    @Override
    public void forEach(Consumer<? super Staff> consumer) {
        for(Staff staff:staffs){
            staff.forEach(consumer);
        }

        consumer.accept(this);
    }
}
