class BigDog extends Animal{
    public BigDog(String name){
        super(name);
    }

    @Override
    public void greets(){
        System.out.println( "" + getName() + ": Wooow");
    }

    public void greets(Dog anotherDog){
        System.out.println("" + anotherDog.getName() + ": Woooooow");
    }

    public void greets(BigDog anotherBigDog){
        System.out.println("" + anotherBigDog.getName() + ": Wooooooooow");
    }
}
