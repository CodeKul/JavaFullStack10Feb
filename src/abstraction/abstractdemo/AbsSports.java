package abstraction.abstractdemo;

import abstraction.interfacedemo.Operation;

public abstract class AbsSports  {

    public abstract void play();//abstract method

    protected void exercise(){ //concrete method
        System.out.println("Exercise ");
    }

    public void show(){
        exercise();
    }
}

/**
 *         abstract class                                         interface
 *
 *  1. abstract class have both method,                 1. only abstract (default and static after java 8)
 *       abstract and non-abstract(concrete)
 *
 *  2. we have private,protected and public methods     2. only public(private methods after java 9)
 *
 *  3. abstract can extends another class or implements 3. only interfaces
 *     interface
 *
 *  4. partial abstraction                              4. 100 % abstraction
 *
 *
 */
