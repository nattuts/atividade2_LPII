class Dog extends Animal{
    public Dog(String name){
        super(name);
    }

    @Override
    public void greets(){
        System.out.println("" + getName() + ": Woof");
    }

    public void greets(Dog anotherDog){
        System.out.println("" +anotherDog.getName() + "Woooof");
    }
}
