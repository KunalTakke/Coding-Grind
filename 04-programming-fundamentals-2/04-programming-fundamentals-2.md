### A. Data Types in Java

##### 1. Primitive 
##### 2. Non-Primitive
JVM divides Memory into two parts
1. Stack => primitive data types are allocated memory in stack.
2. Heap => Non-Primitive data types are allocated memory in heap.

###### Primitive Data types (8 types)
1. Integer -> 4 bytes -> 32 bits
2. Byte -> 1 byte -> 8 bits
3. Short -> 2 bytes -> 16 bits
4. Long -> 8 bytes -> 64 bits 
###### NOTE: By default integer literlas will have default int
eg: int a = 20; // integer
eg: byte b = 108; // integer 
eg: long c = 10^5; // integer

5. Float -> 4 bytes -> 32 bits
6. Double -> 8 bytes ->
###### NOTE: BY default all decimal numbers will have their literal as double
eg: float f = 10.8; // cannot store 8 bytes number into 4 byte variable
**To solve this***
float f = 10.8f; // type casting

7. Boolean // true or false
8. Char -> 2 bytes // 16 bits

