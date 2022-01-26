import java.util.List;
import java.util.stream.Collectors;

public class DataProcessor<T extends Operation> {
private List<T> list;
private int max;
private int min;
private int amount;

public DataProcessor(int max, int min, int amount) throws NewException{
    if (max > 80 || min < 20 || amount != 4){
        throw new NewException("exception is here");
    }
    this.max = max;
    this.min = min;
    this.amount = amount;
}
public List<T> sorting(List<T> operations){
    return operations.stream()
            .filter(item ->(item.getResourceAmount() >= min && item.getResourceAmount() <= max))
            .limit(amount)
            .collect(Collectors.toList());
}

public List<T> find(List<T> operations, int target){
    return operations.stream()
            .filter(item -> (item.getResourceAmount() == target))
            .collect(Collectors.toList());
}
}
