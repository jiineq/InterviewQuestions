# Suppose you're given a binary tree represented as an array. For example, [3,6,2,9,-1,10] represents the following binary tree (where -1 is a non-existent node): 
#         3
#        / \
#       6   2
#      /   /
#     9   10
# Write a function that determines whether the left or right branch of the tree is larger. The size of each branch is the sum of the node values.The function should return the string "Right" if the right side is larger and "Left" if the left side is larger. If the tree has 0 nodes or if the size of the branches are equal, return the empty string. 

# e.g. output of tree above would be "Left" 

def solution(arr):
    # Type your solution here 
    suml = 0;
    sumr = 0;
    lenl = 1;
    lenr = 1;
    curl = 1;
    curr = 1;
    if len(arr) == 0:
        return ""
    for i in arr[1:]:
        if curl == 0 and curr == 0:
            lenl = lenl * 2;
            curl = lenl;
            lenr = lenr * 2;
            curr = lenr;
        if curl != 0:
            #print ("l", i, curl)
            if (i == -1):
                lenl = lenl - 1
            else:
                suml = suml + i;
            curl = curl - 1
        elif curr != 0:
            #print ("r", i)
            if (i == -1):
                lenr = lenr - 1
            else:
                sumr = sumr + i;
            curr = curr - 1
    if (sumr == suml):
        return ""
    if (sumr > suml):
        return "Right"
    else:
        return "Left"
#test = [1,10,5,1,0,6]
#print (solution(test))
