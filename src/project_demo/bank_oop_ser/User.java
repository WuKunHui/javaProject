package week.project_demo.bank_oop_ser;


import java.io.Serializable;
import java.math.BigDecimal;

public class User implements Serializable {

    private static final long serialVersionUID = -7979782948670632520L;

    private String name;

    private String pwd;

    private BigDecimal money;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }
}