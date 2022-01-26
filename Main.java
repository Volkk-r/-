import java.util.List;

public class Main {
    public static void main(String[] args) {
        Input input = new Input();
        input.setDefaultInputList();
        List<Process> inputList = input.getDefaultList();
        Calculating calculating = new Calculating();
        calculating.calculate(inputList);
        calculating.outPut(inputList);
        try {
            DataProcessor<Operation> dataProcessor = new DataProcessor<>(80, 20, 4);
            dataProcessor.sorting(input.getOperations());
            dataProcessor.find(input.getOperations(), 40);
        } catch (NewException e){
            System.out.println(e.getExceptionMessage());
        }
    }
}
