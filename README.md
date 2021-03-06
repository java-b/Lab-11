# Lab 11

## NOTICE

Students who have downloaded the lab files before `16:30 2016/12/15` please update your **Evaluation.java**.

There is something wrong with the evaluation code for **task 3**, but **task 1/2** will work correctly.

Thanks for `Huang Lingqi`'s help and sorry for my mistake.


## Overview

In this lab, you are required to implement a collections framework similar to *java.util.ArrayList*.



## Guide

You may first download the **Lab11_Solution** from github, then you need to finish the following three tasks.

- Write your code in the *MyArrayList*.

- Run the *Evaluation* to check your code.

*MyArrayList* is an implementation of the interface *java.util.List*. Notice that although all methods should be implemented in the class, **not all methods need be implemented in this lab**. That is, you just need to write your code in the methods listed in following tasks, and don't need to pay attention to those unmentioned.

In the lab, the [Java documentation](http://docs.oracle.com/javase/8/docs/api/) will be the **best** instructor for you. However, maybe it is a little bit difficult for you, don't worry, **feel free to ask TA for help when needed.**

Students fininshing all tasks are encouraged to write some issues on github and share your idea.


## Tips

There is **no new knowledge** in the lab, the only thing you need to do is to **read the Java documentation thoroughly**.

If you cannot understand the Java documentation, read it again until you can solve the problem.

Best wishes. 


## Warnings

You are forbidden to use any class in the package *java.util*, for example, *java.util.ArrayList*, as internal implementation (interitance, internal class, etc.) in the *MyArrayList*, or you will get a score of 0 point.


## Task 1

You need to implement the following methods:

*For more information, refer to http://docs.oracle.com/javase/8/docs/api/java/util/List.html for help.*

```java
public boolean add(Object o);
public Object get(int index);
public int size();
public int isEmpty();
public Object remove(Object o);
public void clear();
```



## Task 2

You need to implement the following methods:

*For more information, refer to http://docs.oracle.com/javase/8/docs/api/java/util/List.html for help.*

```java
public boolean contains(Object o);
public int indexOf(Object o);
public int lastIndexOf(Object o);
```



## Task 3

You need to implement the following methods:

**Q: What does an iterator mean???**

**A: Wu Ke Feng Gao. See the Java doc. By the way, you just need to implement the `hasNext()` and `next()` method in an iterator :)**

*For more information refer to http://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html for help.*

```java
public Iterator iterator();
```

