[Back to index](./master/PrepPlan.md)

In Java, you can access elements in an array using indexing. Arrays are zero-indexed, which means the first element is at index 0, the second element at index 1, and so on. Here's how you can access elements in an array:

Suppose you have an array `arr`:

```java
int[] arr = {10, 20, 30, 40, 50};
```

To access individual elements in the array, use the square brackets (`[]`) along with the index of the element you want to access:

```java
int firstElement = arr[0]; // Access the first element (index 0)
int secondElement = arr[1]; // Access the second element (index 1)
int thirdElement = arr[2]; // Access the third element (index 2)
// and so on...
```

You can also use variables or expressions as array indices:

```java
int index = 3;
int element = arr[index]; // Access the element at index 3 (fourth element)

int sumOfIndices = 1 + 2;
int elementAtSum = arr[sumOfIndices]; // Access the element at index 3 (second + third element)
```

Keep in mind the following points while accessing elements in an array:

1. The index must be a non-negative integer.
2. Trying to access an element with an index that is out of the array's bounds will result in an `ArrayIndexOutOfBoundsException`.
3. The maximum valid index for an array of size `n` is `n - 1`.
4. Elements can be accessed for both one-dimensional arrays and multi-dimensional arrays by specifying the appropriate indices for each dimension. For multi-dimensional arrays, you need to provide an index for each dimension separated by commas.

For example, for a 2D array:

```java
int[][] matrix = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};

int value = matrix[1][2]; // Access the element at row 1 (index 1) and column 2 (index 2) - value: 6
```

Remember to ensure that the index is within the valid range to avoid runtime errors in your code.