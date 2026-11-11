class Person {
    private String name ;
    private int age ; 
    private String number ;
    
    Person(){
        this.name = "Unknown" ; 
        this.age = 0 ;
        this.number = "0" ;
    };

    Person(String name , int age , String number ){
        this.name = name ; 
        this.age = age ;
        this.number = number ;
    }
    //Getters 
    public String getName(){
        return name ;
    }
    public int getAge(){
        return age ; 
    }
    public String getNumber(){
        return number;
    }
    //Setters 
    public void setName(String name ){
        this.name = name ;
    }
    public void setAge(int age ){
        this.age = age ;
    }
    public void setNumber(String number ){
        this.number = number ;
    }
    //Method
    public void displayPersonDetails(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Number: "+number);
    }

}