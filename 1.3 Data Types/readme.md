Welcome to our video on Java Variables and Data Types

**What are Variables?**
A variable is a piece of memory that can contain a data value.
In addition, **variable identifiers** are used to "name" data. These are case sensitive, and must start with either a letter, `$`, or `_`. They can contain, numbers in addition to those characters. You also cannot name a varible something that already exists within the Java language like `int` or `for`.  

**Variable Types**
There are four main types of variables including:
+ Instance Variables or Non-Static Fields
+ Class Variables or Static Fields
+ Local variables
+ Parameters

For most variables the naming convention is all lowercase for singular words, and lowercase then upercase for `multipleWords`. However for static final, the naming convention is all caps with `_` for spaces. 

For this video we're going to focus on data types.
___
**What are Data Types?**
A data type is used to declare the "size and type of data" that can be stored in a variable. Since each variable is associated with a piece of memory, this allows us to organize our memory usage. In a strong typed language like Java, variables need to be defined before they can be used.

The standard format for declaring variables is `datatype1 variabletype1`
Say our variable `myVariable` was an interger of `20`, then we could declare this by writing `byte myVariable = "20"`. `byte` being the data type, `myVariable` being our identifier, and `20` representing our variable data.

There are two types of Data Types, primitive and reference/object. 
Within the primitive types we have:
+ Bytes

   Bytes are a form of numeric type that contains 8 bits. You can use any numeric value (-128,127) that is a whole number.

+ Shorts

   Shorts are a form of numeric type that contains 16 bits. You can use any numeric value (-32,768,32,767) that is a whole number.

+ Integers `int`

   Integers are a form of numeric type that contains 4 bytes. You can use any numeric value (-2^31, 2^31) that is a whole number. It is the most commonly used numeric type for whole numbers.

+ Longs 

   Longs are a form of numeric type that contains 8 bytes. You can use any numeric value (-2^63, 2^63) that is a whole number.
   
These numeric types will have 0, 0L for Longs, as their default value.

+ Floats 

   Floats are a form of floating point data that contains 4 bytes. You can use any numeric value and it can be fractional with decimals. The default value will be 0f.
   
   ``` speed = 14.0f;```

+ Doubles

   Doubles are a form of floating point data that contains 8 bytes. You can use any numberic value and it can be fractional with decimals. It has twice the percision of a float. The default value will be 0d.
   
   ``` maxHealth = 100.00;```

+ Character `char`

   Characters are a form of character data that contains 2 bytes. You can use any unicode character and it will be case sensitive. Therefore you have all 26 letters of the alphabet, lower and uppercase.    
   
   ``` firstLetterOfName = 'Z'; ```

+ Boolean

   Booleans are a form of true/false data that contains 1 byte. You can either set this value to true or false, with false being the default.

``` itsRaining = true; ```

Within the non-primitive, "reference" or "object" types we have:

+ Strings
+ Arrays

These are types defined by classes. We'll continue to cover these in the next video.
