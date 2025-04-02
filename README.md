<div style="text-align:center;"><img src="src/main/resources/pemacs-logo.png"></div>
# Skill Builder 5 - Defining Classes and Methods

## Learning Outcomes

By the end of this activity, a student should be able to:

1. Implement a simple Java class
2. Include and use static fields.
3. Use other classes to accomplish more complex tasks
4. Implement accessor and mutator methods
5. Follow a test-driven design methodology.
6. Design objects that interact with each other.




## The Grok Coalition

Imagine you are writing a video game that has a character called a Grok. The Grok is a simple creature that can eat power pills and increase its power level by the amount of power available in the power pill. If the Grok takes a hit, then its power level is reduced by 5 points.

## The PowerPill Class

A power pill is an object that is available for the Grok to ingest.  Once taken, it transfers its power to the Grok.  A client can create different power pills with varying levels of power and names.  Provided below are template classes.

```java
public class PowerPill
{
    
}

```

## PowerPill Class - Required Activities

You are to implement the following in the `PowerPill` class.

1. Add a ***static*** integer field called `DEFAULT_POWER` and set it to 10. (**NOTE: static variables can be initialized outside of constructors, but NOT INSTANCE variables!**)
2. Add an integer **field** called `power`.
3. Add a String **field** called `name`.
4. Add a value constructor with a string parameter called `name`.  Add the javadoc comment below before the constructor name.
<pre>
	/**
     \* Initializes this power pill to a default power value
     \* and sets the name of the pill to name.
     \* @param name the name of this power pill.
     */
</pre>
5. Add a value constructor where the first parameter is a string called `name` and the second parameter is an integer called `power`.

	<pre>
		/**
	     * Initializes this power pill to the value of power
	     * and sets the name of the pill to name.
	     * @param name the name of this power pill
	     * @param power the power level of this power pill.
	     */
	</pre>

6. Add getter methods with an appropriate javadoc comment for each method.
7. Add setter methods with an appropriate javadoc comment for each method.
8. Add a `toString` method that returns a string formatted as,
   
   <pre>
   PowerPill &lt;name&gt; = &lt;power&gt;
   </pre>
   
   where `<name>` is replaced by the PowerPill object's name and <br>
         `<power>` is replaced with the PowerPill object's power

For example,

```
PowerPill p = new PowerPill("Pink", 20);
System.out.printn(p);
```

results in,

```
PowerPill Pink = 20
```

## Implementing and Tesing the PowerPill Class

You will notice that the `PowerPillTest` class is full of errors due to the fact that the `PowerPill` class is missing the methods that are tested by the `PowerPillTest` class.  It is recommended that you add empty methods first, run the test, and note that there are no syntax errors.  If a method returns a value, then return a default value that will make the test fail.  For example, if a method returns an integer, then implement one line, `return 0;`.  This will eliminate the syntax error in the test class, but will make the initial test fail. Empty methods or unimplemented methods  that return an incorrect values are called **skeleton methods**.

*Once the skeleton methods have been added and no syntax errors exist, you can begin implementing the methods one by one and make sure each implementation passes the test before moving on to the next method.*

In general, getting used to the idea of using the symbolic debugger to locate the source of an error is an excellent overall strategy.  So, use it on every method that fails the test!



## Grok Class

Groks are bad actors in a game. They can ingest a PowerPill to replenish their energy, making them a challenge to kill. When Groks take a power pill, they take the power level of the pill. When Groks get hit, they lose 5 points of power. You are provided the following class and will need to complete it based on the documentation provided.

```java
public class Grok
{
    // TODO - complete this class per instructions below.
}
```

## Required Activities

You are to implement the following in the `Grok` class.

1. Add a ***static*** integer field called `DEFAULT_POWER_LEVEL` and set it to 50. (**NOTE: static variables can be initialized outside of constructors, but NOT INSTANCE variables!**)
2. Add an integer field called `powerLevel`.
3. Add a default constructor.  Add the javadoc comment below before the constructor name.
<pre>
	/**
     \* Initializes a Grok object to the default power level of 50.
     */
</pre>
5. Add a value constructor with a single parameter that is an integer called `powerLevel`.  Add the javadoc comment below before the constructor.

	```
	  /**
	   *
       * Initializes a Grok object to power powerLevel
       */
	```
	
6. Add a getter method with the following javadoc comment

   ```
    /*
     * Returns the power level of this Grok.
     * @return returns the power level of this Grok
     */
   ```
   
7. Add a setter method with the following javadoc comment
   
   ```
    /*
     * Sets the power level of this Grok.
     * @param powerLevel the power value to set for this Grok.
     */

   ```

8. Add a mutator method called `takePowerPill` with the following javadoc comment.
   
   ```
    \*
     * Set the power level of this Grok to the power level of
     * the pill.
     * @param pill The PowerPill that the this Grok.  The power
     * of the pill is added to the power level of this Grok.
     */
   ```
   
9. Add a mutator method called `tookHit` with the following javadoc comment

   ```
     /*
     * Invoked when this Grok takes a hit.  The power level of
     * this Grok is reduced by 5.
     */
   ```

## How To Use the Classes

An example of how the Classes may be used is,

```java
PowerPill bluePill = new PowerPill("Blue");
PowerPill redPill = new PowerPill("Red",40);

Grok ghostlyGrok = new Grok();
ghostlyGrok.takePowerPill(bluePill);
ghostlyGrok.tookHit();
ghostlyGrok.tookHit();
ghostlyGrok.takePowerPill(redPill);
```

## Implementing and Testing the Classes

In this Skill Builder, you are being asked to implement the methods and cosnstructors as instructed in the section **Required Activities**.  It is recommended that you add empty methods first, run the test, and note that there are no syntax errors.  If a method returns a value, then return a default value that will make the test fail.  For example, if a method returns an integer, then implement one line, `return 0;`.  This will eliminate the syntax error in the test class, but will make the initial test fail. Empty methods or unimplemented methods  that return an incorrect values are called **skeleton methods**.

*Once the skeleton methods have been added and no syntax errors exist, you can begin implementing the methods one by one and make sure each implementation passes the test before moving on to the next method.*

In general, getting used to the idea of using the symbolic debugger to locate the source of an error is an excellent
overall strategy.  So, use it on every method that fails the test!


<span style="font-size:2em;color:green;">Happy Coding!</span>