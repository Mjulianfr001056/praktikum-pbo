package meet5.tugas;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Faculty {
    private Employee dean;
    private String name;
    private HashMap<String, Institute> institutes_list = new HashMap<>();


    public Faculty(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setDean(Employee dean) {
        this.dean = dean;
    }

    public void addInstitute(String name, String address){
        institutes_list.put(name, new Institute(name, address));
    }

    public Collection<Institute> getInstitutes_list() {
        return institutes_list.values();
    }

    public Institute findInstitute(String name){
        return institutes_list.get(name);
    }

    private String getInstituteNames(){
        String result = "";
        for (Map.Entry<String, Institute> mapElement : institutes_list.entrySet()) {
            if(result.equals("")){
                result += mapElement.getValue().getName();
            }else{
                result = result + ", " + mapElement.getValue().getName();
            }
        }
        return result;
    }
    
    @Override
    public String toString() {
        return "Faculty[" +
                "dean=" + dean.getName() +
                ",name=" + name +
                ",institutes_list=" + getInstituteNames() +
                ']';
    }
}
