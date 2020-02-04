//https://hyperskill.org/learn/step/2984

class Account{
    public long balance;
    public String ownerName;
    public boolean locked;

    public Account(long balance, String ownerName, boolean locked){
        this.balance = balance;
        this.ownerName = ownerName;
        this.locked = locked;
    }
}