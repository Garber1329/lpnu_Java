package com.company.Task1;

class Client extends Person{

    private int sum; // Переменная для хранения суммы на счете
    private String bank;

    public Client(String name, String bank, int sum) {
        super(name);
        this.bank=bank;
        this.sum=sum;
    }

    public void display(){
        System.out.printf("Client %s has account in %s \n", super.getName(), bank);
    }

    public String getBank(){ return bank; }
    public int getSum(){ return sum; }

    static{
        System.out.println("static class Client");
    }
}
