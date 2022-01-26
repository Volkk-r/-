public class DownTime extends Process {
    private String reason;
    private int downtime;

    @Override
    public void setInfo(int id, int info) {

    }

    public void setInfo(String reason, int info) {
        this.reason = reason;
        this.downtime = info;
    }

    @Override
    public String getInfo() {
        return ("Простой по причине: "+reason+" время простоя: "+ downtime + "c");
    }

    @Override
    public int getResourceAmount() {
        return 0;
    }
}
