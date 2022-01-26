public abstract class Process {
    protected int id;

    public abstract void setInfo(int id, int info);
    public abstract void setInfo(String reason, int info);
    public abstract String getInfo();

    public int getId() {
        return id;
    }

    public abstract int getResourceAmount();
}
