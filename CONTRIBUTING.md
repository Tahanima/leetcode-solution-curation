# Contributing

## Step 0
If you are new to *how to contribute to GitHub projects*, don't forget to check our [HOWTO](./HOWTO.md) guide.

## Step 1
Open an [issue](https://github.com/Tahanima/leetcode-solution-curation/issues) describing the contribution you want to make. [Here](https://github.com/Tahanima/leetcode-solution-curation/issues/7)'s an example issue for your reference.

Examples of some contributions:
* Adding a solution to a LeetCode problem in a particular programming language.
* Adding a second solution with a different approach to a LeetCode problem in a particular programming language.
* Adding relevant resources such as youtube videos, articles, tutorials that are going to help someone solve the LeetCode problem.

and so on

## Step 2
The project is structured as follows:

```bash
.
├── [Category]
│   └── [Problem Difficulty]
│       └── [Problem]
│           └── [Solution and Resources]
├── ...
│
...
 ```

Here, the values for 
* **Category** are: `Algorithms`, `Database`, `Shell` and `Concurrency`
* **Problem Difficulty** are: `Easy`, `Medium` and `Hard`

If you need to create a folder for any **Category** or any **Problem Difficulty**, make sure to name it accordingly.

As for **Problem**, the naming convention we are following is
```markdown
[Problem Number]_[Problem Name]
Example: 1_TwoSum

Note: Problem Name should be in Pascal case
```

Now, in case of **Solution and Resources**

**Solution**
* Solution in a particular programming language should be in a file named `Solution` with appropriate file extension. For example, `Solution.java` for Java.

* You should utilize the solution template provided by LeetCode for a particular programming language and write your code in such a way that submitting your solution via pasting it in the LeetCode editor should provide an `Accepted` verdict.

* Suppose you want to add a second solution to a problem in a particular programming language. In that case, name the file as `SolutionOne` with appropriate file extension.

* You should be consistent regarding naming convention in your code.

* You should use 4 spaces for indentation.

* You should use meaningful variable names and function names where appropriate.

* You should add comments where appropriate. 

* You should use appropriate spaces to make your code more readable. For example:
```java
// Bad
int i=0;

// Good
int i = 0;

// Bad
if(i<10){
  ...
}else{
  ...
}

// Good
if (i < 10) {
  ...
} else {
  ...
}
```

**Resources**

Resources for each of the problems should be in a file `Resources.md`. If it is not already present, feel free to create one.

If you want to add a resource, make sure to:
* add it in a bulleted list
* provide an appropriate title and link it

Here's an example:

* [Editorial Series - LeetCode 268. Missing Number](https://tahanima.github.io/2021/06/02/editorial-series-leetcode-268-missing-number/)


Your help is greatly appreciated. Thank you so much!