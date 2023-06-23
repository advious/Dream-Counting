# Dream-Counting

An introductory USACO Bronze-level problem about a mathematically gifted cow named Bessie who has insomnia.

## Description:

Bessie was daydreaming one day as she drifted between wakefulness and that delicious drowsiness that we all feel when we are tired. For a moment, she counted sheep as couldn't quite sleep. Bessie's mind is razor-sharp and visualizes the numbers as she counts. She started noticing the digits and wondered: how many instances of each digit appear in a counting sequence?

Given two integers M and N (1 <= M <= N <= 2,000,000,000 and N - M <= 500,000), how many occurrences of each digit appear?

### Example:

Consider the sequence 129...137: 129, 130, 131, 132, 133, 134, 135, 136, 137. Count the digits to find:

```
1x0      1x5
10x1      1x6
2x2      1x7
9x3      0x8
1x4      1x9
```

### Input Format:

* Line 1: Two space-separated integers: M and N

### Sample Input:

```
129 137
```

### Output Format:

* Line 1: Ten space-separated integers that are the counts of the number of each digit (0..9) that appears while counting through the sequence.

### Sample Output:

```
1 10 2 9 1 1 1 1 0 1
```

### Output Details:

One zero, ten ones, etc.
