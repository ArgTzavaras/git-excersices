package gr.aueb.ch12;

public class Order {
    private int id ;
    private String vvid;
    private double amount;

    private String description;
    private int state;
    private LocalDateTime timestamp;

    private String formated;

    public Order() {


    }

    public Order(int id, String vvid, double amount, String description, int state, LocalDateTime timestamp, String formated) {
        this.id = id;
        this.vvid = vvid;
        this.amount = amount;
        this.description = description;
        this.state = state;
        this.timestamp = timestamp;
        this.formated = formated;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVvid() {
        return vvid;
    }

    public void setVvid(String vvid) {
        this.vvid = vvid;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public String getFormated() {
        return formated;
    }

    public void setFormated(String formated) {
        this.formated = formated;
    }
}
