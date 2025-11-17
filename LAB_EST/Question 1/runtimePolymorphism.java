/*
    It is called runtime polymorphism as which method is to be called is decided at runtime 
 */
// Parent class
class Animal 
{
    protected void sound() 
    {
        System.out.println("Animal makes a sound");
    }
}

// Child class
class Dog extends Animal 
{
    @Override
    public void sound() 
    {
        System.out.println("Dog barks");
    }
}  
// Main class
class runtimePolymorphism 
{
    public static void main(String[] args) 
    {
        Animal myAnimal = new Dog();  // Animal reference but Dog object
        
        // Method resolution happens here at runtime based on the object type (Dog)
        myAnimal.sound();  // Calls Dog's sound() method at runtime

        Dog obj = new Dog();
        obj.sound();
    }
}

