package com.study.pratices.hakerank;

import java.util.List;

public class NoPrefixSet2 {

    public void solution(List<String> words){

        String result = null;
        for(String s : words)
        {
            System.out.println(s);
            s = insert(s);
            if(s!=null && result==null)
                result = s;
        }

        if(result==null)
            System.out.println("GOOD SET");
        else
        {
            System.out.println("BAD SET");
            System.out.println(result);
        }
    }

    private Node root = new Node(' ');
    class Node
    {
        char c;
        Node children[];
        boolean isEndOfWord;

        Node(char ch)
        {
            this.c = ch;
            this.children = new Node[10];
            this.isEndOfWord = false;
        }
    }

    private String insert(String s)
    {
        Node node = root;
        String result = null;
        int len = s.length();
        for(int i=0;i<len;i++)
        {
            char c = s.charAt(i);
            if(node.children[c-'a']!=null && node.children[c-'a'].isEndOfWord)
                result = s;
            if(node.children[c-'a']==null)
                node.children[c-'a']=new Node(c);
            node = node.children[c-'a'];
            if(i==len-1)
            {
                node.isEndOfWord = true;
                //check any of children of node is filled if yes, then this is the word with prefix
                for(int x=0;x<=9;x++)
                    if(node.children[x]!=null && result==null)result = s;
            }
        }
        return result;
    }

}