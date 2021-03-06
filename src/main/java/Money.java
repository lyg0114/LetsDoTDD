abstract class Money {

    protected int amount;
    protected String currency;


    public Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    String currency(){
        return currency;
    }

    public boolean equals(Object object){
        Money money = (Money) object;

        return amount == money.amount && getClass().equals(money.getClass());

    }

    static Money dollar(int amount){ //팩토리 메서드
        return new Dollar(amount,"USD");
    }

    static Money franc(int amount){ //팩토리 메서드
        return new Franc(amount,"CHF");
    }


    abstract Money times(int multiplier);



}
