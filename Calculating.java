import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Calculating {
    private List<String> marks =new ArrayList<>();
    private int sum, check = 0;
    private String marksString = "Отметки: ";
    public void calculate(List<Process> operationsList){
        operationsList.forEach(new Consumer<Process>() {
            @Override
            public void accept(Process process) {
                sum += process.getResourceAmount();
                int checkThis = sum/160;
                if(checkThis > check){
                    check = checkThis;
                    marks.add(Integer.toString(process.getId()));
                }
            }
        });
        System.out.println("Расход ресурса: "+sum);
        marks.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                marksString+= s+ ", ";
            }
        });
        System.out.println(marksString.substring(0,marksString.length()-2));
    }

    public void outPut(List<Process> proccessList){
        proccessList.forEach(new Consumer<Process>() {
            @Override
            public void accept(Process p) {
                System.out.println(p.getInfo());
            }
        });
    }
}
