package meet5.tugas;

import java.util.ArrayList;

public class Institute {
    private String name;
    private String address;
    private ArrayList<Research_Associate> assigned_associate = new ArrayList<>();

    public Institute(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void assign_associate(Research_Associate assigned_associate){
        this.assigned_associate.add(assigned_associate);
    }

    private String getAssigned_associateNames(){
        String result = "";
        for (Research_Associate ra : assigned_associate) {
            if(result.equals("")){
                result += ra.getName();
            }else{
                result = result + ", " + ra.getName();
            }
        }
        return result;
    }

    @Override
    public String toString() {
        return "Institute[" +
                "name=" + name +
                ",address=" + address +
                ",assigned_associate=" + getAssigned_associateNames() +
                ']';
    }
}
