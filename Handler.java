public class Handler extends Process {
    private String name;

    public Handler(String name){
        this.name = name;
    }

    @Override
    public void setInfo(int id, int info) {
    }

    @Override
    public void setInfo(String reason, int info) {
    }

    @Override
    public String getInfo() {
        return ("Обработчик с именем: " + name);

    }

    @Override
    public int getResourceAmount() {
        return 0;
    }
}
