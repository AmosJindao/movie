package db.bean;

/**
 * @author amos
 * @date 2017-09-24
 */
public class Privilege{
    private final String action; //privilege
    private final String target;// Context
    private final String description;// comment

    public Privilege(String action, String target, String description){
        this.action = action;
        this.target = target;
        this.description = description;
    }

    public String getAction() {
        return action;
    }

    public String getTarget() {
        return target;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Privilege{" + "action='" + action + '\'' + ", target='" + target + '\'' + ", description='" + description + '\'' + '}';
    }
}
