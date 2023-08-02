[Back to index](./master/PrepPlan.md)


In Java, you can declare and initialize arrays using different approaches depending on whether you know the size of the array at compile-time or if you want to create a dynamic array with a variable size. Here are the different ways to declare and initialize arrays in Java:

1. **Static Array (Fixed Size):**
    - If you know the size of the array at compile-time and it won't change during runtime, you can declare and initialize a static array as follows:

```java
// Declaration and initialization in a single line
int[] staticArray = {1, 2, 3, 4, 5};

// Declaration and initialization in separate lines
int[] staticArray;
staticArray = new int[]{1, 2, 3, 4, 5};
```

2. **Dynamic Array (Variable Size):**
    - If you want to create a dynamic array with a variable size, you need to declare and initialize it using the `new` keyword:

```java
int size = 5; // The size of the array can be determined dynamically
int[] dynamicArray = new int[size];
```

3. **Initializing with Default Values:**
    - When you initialize an array without specifying values, Java assigns default values to the elements based on their data types. For example, `0` for numeric types, `false` for boolean, and `null` for object types:

```java
int[] defaultIntArray = new int[5]; // Elements will be set to 0
boolean[] defaultBooleanArray = new boolean[3]; // Elements will be set to false
String[] defaultStringArray = new String[4]; // Elements will be set to null
```

4. **Multi-dimensional Arrays:**
    - Java also supports multi-dimensional arrays (arrays of arrays). You can declare and initialize them as follows:

```java
int[][] multiDimensionalArray = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};

// Alternatively, you can also declare multi-dimensional arrays separately:
int[][] multiDimensionalArray;
multiDimensionalArray = new int[][] {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};
```

Keep in mind that arrays in Java are zero-indexed, meaning the first element is accessed using index `0`, the second with index `1`, and so on. To access or modify elements in an array, use square brackets with the index of the element. For example: `array[index]`.