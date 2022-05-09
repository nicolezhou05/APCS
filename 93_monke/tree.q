Team: Non-Disclosure Agreement (Jing Feng, Corina Chen, Nicole Zhou)
APCS pd6
HW93 -- exploring tree properties, extracting actionable intel from traversals
2022-05-05
time spent: 0.7 hrs


DISCO
------------------------------------------------
* A perfect tree is a complete and balanced tree
* A complete tree is a balanced and sometimes perfect tree
* A balanced tree can sometimes be a complete and/or balanced tree
* Inorder: start with leftmost leaf of left subtree, go to parent, check for any other child, continue up to root, go to leftmost leaf of right subtree and repeat
* Post-order: leftmost leaf of left subtree, check if its parent have any more child, parent, continue up until at left subtree of root, and repeat for right subtree of leaf, finally root
* Pre-order: root, left subtree of root, left child, right child, continue down, repeat for right subtree of root
================================================


QCC
------------------------------------------------
* what does the question "Is the man who is tall happy" mean? I looked at piazza post about it but the video was restricted.
================================================


SELF-ASSESSMENT PROMPTS
------------------------------------------------
In which direction does a tree grow?
It always grows downwards.

Provide as many alternate definitions as you can for "tree," using graph terminology ("closed/open tours", "paths", "cycles", etc). Maximize clarity, succinctness.
A tree is a graph of nodes connected through paths.

Why is a balanced tree allowed a difference of 1 in height between right and left subtrees?
So the tree isn’t one-sided.

Alternate (equivalent, but more succinct?) definitions of "balanced" tree?
The heights of each node in the same level should differ by 1 or less.

Is a perfect tree complete?
Yes, because in both types of trees, every level is filled in. However, complete trees have the possibility of not having the bottom filled in.

Is a complete tree balanced?
Yes, because every level of a complete tree is filled in (except with the possibility of the bottom), so the heights of left and right subtrees of any node differ by less than 1.

Is the Man Who Is Tall Happy?
(Not exactly sure what this question is asking)

What must be true of perfect trees but not others?
Every level is full.
================================================


C'EST POSSIBLE?
------------------------------------------------
< your explanation of whether the tree reconstruction challenge given in class is achievable or not >
Yes, no root has no left subtree


       E
        \
         G
        /
       D
      / \
     K   I
        / \
       N   L
          / \
         O   W
================================================
