abstract class Money {

    protected int amount;

    public boolean equals(Object object){
        Money money = (Money) object;

        return amount == money.amount && getClass().equals(money.getClass());

    }

    static Money dollar(int amount){ //팩토리 메서드
        return new Dollar(amount);
    }

    static Franc franc(int amount){ //팩토리 메서드
        return new Franc(amount);
    }

    abstract Money times(int multiplier);

}
