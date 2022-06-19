package Stacks_Problems;

// Playing a passing game
// Players numbered from 1 to N
// initially player 1 contains the ball
// operation - 1. pass forward(x) : passed to player numbered x
//             2. pass back (undo) : ball is passed to previous player
// you need to perform N operations and tell which player contains the ball at the end.
// e.g A={5,10,0,2,3,0,0}
// O/P - after iterating over complete array (performed N operations), ball is present with player numbered 5


import java.util.Stack;

public class Passing_Game {

    public static void main(String[] args) {

        int[] arr = {5,10,0,2,3,0,0};

        Stack<Integer> s = new Stack<>();

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>0)
            {
                s.push(arr[i]);
            }
            else
            {
                s.pop();
            }
        }

        if(s.isEmpty())
        {
            System.out.println("ball is present with player 1");
        }
        else
        {
            System.out.println(s.peek());
        }


    }
}
