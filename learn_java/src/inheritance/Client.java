package inheritance;

import java.util.Date;


public class Client extends Person {

    private int idClient;
    private Date createdAt;
    private boolean vip;
    private static int clientCounter;

    public Client(Date createdAt, boolean vip, String name, char gender, int age, String address) {
        super(name, gender, age, address);
        this.idClient = ++Client.clientCounter;
        this.createdAt = createdAt;
        this.vip = vip;
    }

    
//    public Client(String name, LocalDate createdAt, boolean vip) {
//        super(name);
//        this.createdAt = createdAt;
//        this.vip = vip;
//        this.idClient = ++Client.clientCounter;
//    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Client{");
        sb.append("idClient=").append(idClient);
        sb.append(", createdAt=").append(createdAt);
        sb.append(", vip=").append(vip);
        sb.append(",").append(super.toString());
        sb.append('}');
        return sb.toString();
    }

}
