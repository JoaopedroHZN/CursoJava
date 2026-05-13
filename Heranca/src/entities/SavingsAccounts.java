package entities;

public class SavingsAccounts extends Account {
    private Double InterestRate;

    public SavingsAccounts(){

    }

    public SavingsAccounts(Integer number, String holder, Double balance, Double interestRate) {
        super(number, holder, balance);
        InterestRate = interestRate;
    }

    public Double getInterestRate() {
        return InterestRate;
    }

    public void setInterestRate(Double interestRate) {
        InterestRate = interestRate;
    }

    public void updateBalance(){
        balance += balance * InterestRate;
    }
}
