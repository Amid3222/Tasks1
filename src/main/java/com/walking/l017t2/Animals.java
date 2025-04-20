package com.walking.l017t2;

enum Animals {
    CAT{
        @Override
        public void makeSound(){
            System.out.println("MEOW YOPTA");
        }
    }, COW{
        @Override
        public void makeSound(){
            System.out.println("mooo ebatb");
        }
    }, DOG{
        @Override
        public void makeSound(){
            System.out.println("GAW");
        }
    };
    public void makeSound(){}
}
