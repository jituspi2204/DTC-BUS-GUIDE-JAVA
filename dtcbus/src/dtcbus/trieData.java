package dtcbus;
import java.util.*;
import java.io.*;
import java.lang.Character;

public class trieData {
    public static class op
    {
        int val;
        String g;
        op(String b, int a)
        {
            val = a;
            g = b;
        }
    }
    public static class Node
    {
        int a = -1;
        char d;
        boolean eow = false;
        ArrayList<Node> child = new ArrayList<>();
    }

    public static void insert(String x, Node root, int no)
    {
        if(x.length() == 0)
        {
            root.eow = true;
            if(root.a == -1)
                root.a = no;
            return;
        }
        String t = x.toLowerCase();
        int index = t.charAt(0);
        if(index >= 48 && index <= 57)
        {
            index = index+25-48;
        }
        else if(t.charAt(0) == '-')
            index  = 36;
        else if(t.charAt(0) == '#')
            index  = 37;
        else if(t.charAt(0) == '/')
            index  = 38;
        else if(t.charAt(0) == '(' || t.charAt(0) == ')')
            index = 39;
        else if(index-'a' < 0)
            index = 40;
        else
        {
            index = index-'a';
        }        
        // else if(t.charAt(0) == '')
        //     index  = 36;
        if(root.child.size() < index+1)
        {
            while(root.child.size() < index+1)
                root.child.add(null);
            // System.out.println(root.child.size());
            Node temp = new Node();
            temp.d = x.charAt(0);
            root.child.set(index, temp);
            String st = x.substring(1);
            insert(st, root.child.get(index), no);
        }
        else if(root.child.get(index) == null)
        {
            Node temp = new Node();
            temp.d = x.charAt(0);
            root.child.set(index, temp);
            String st = x.substring(1);
            insert(st, root.child.get(index), no);
        }
        else
        {
            String st = x.substring(1);
            insert(st, root.child.get(index), no);
        }
       
    }
    public static void display(Node root, String psf)
    {
        if(root.child.size() == 0)
        {
            System.out.println(psf+root.d+ "\t" + root.a);
            return;
        }
        for(int i = 0;i<root.child.size();i++)
        {
            if(root.child.get(i) != null)
            {
                display(root.child.get(i), psf+root.d);
            }
        }
    }
    public static ArrayList<op> search(Node root, String toBeSearched, String psf)
    {
//        toBeSearched.toLowerCase();
        if(root.child.size() == 0)
        {
            if(toBeSearched.length() == 0)
            {
                ArrayList<op> res = new ArrayList<>();
                boolean f = psf.length()>1 && (Character.isUpperCase(root.d) || Character.isDigit(root.d)) && Character.isLowerCase(psf.charAt(psf.length()-1));
                if(f)
                    psf += " ";
                res.add(new op(psf+root.d, root.a));
                return res;
            }
            else if(toBeSearched.length() == 1)
            {
//                toBeSearched.toLowerCase();
                int temp = toBeSearched.charAt(0)-'a';
                if(root.child.get(temp) != null)
                {
                    ArrayList<op> res = new ArrayList<>();
                    boolean f = psf.length()>1 && (Character.isUpperCase(root.d) || Character.isDigit(root.d)) && Character.isLowerCase(psf.charAt(psf.length()-1));
                    if(f)
                        psf += " ";
                    res.add(new op(psf+root.d, root.a));
                    return res;
                }
            }
            else
                return new ArrayList<op>();
        }
        ArrayList<op> res = new ArrayList<>();
        if(toBeSearched.length() == 0)
        {
            for(int i = 0;i<root.child.size();i++)
            {
                if(root.child.get(i) != null)
                {
                    boolean f = psf.length()>1 && (Character.isUpperCase(root.d) || Character.isDigit(root.d)) && Character.isLowerCase(psf.charAt(psf.length()-1));
                    if(f)
                        psf += " ";
                    ArrayList<op> temp = search(root.child.get(i), "", psf+root.d);
                    if(root.eow == true)
                        temp.add(new op(psf+root.d, root.a));
                    if(temp.size()>0)
                    {
                        for(op t : temp)
                            res.add(t);
                    }
                }
            }
        }
        else
        {
//            toBeSearched.toLowerCase();
//            int var = toBeSearched.charAt(0) - 'a';
            int index = toBeSearched.charAt(0);
        if(index >= 48 && index <= 57)
        {
            index = index+25-48;
        }
        else if(toBeSearched.charAt(0) == '-')
            index  = 36;
        else if(toBeSearched.charAt(0) == '#')
            index  = 37;
        else if(toBeSearched.charAt(0) == '/')
            index  = 38;
        else if(toBeSearched.charAt(0) == '(' || toBeSearched.charAt(0) == ')')
            index = 39;
        else if(index-'a' < 0)
            index = 40;
        else
        {
            index = index-'a';
        }
            if(root.child.get(index) != null)
            {
                String st = toBeSearched.substring(1);
                boolean f = psf.length()>1 && (Character.isUpperCase(root.d) || Character.isDigit(root.d)) && Character.isLowerCase(psf.charAt(psf.length()-1));
                if(f)
                    psf += " ";
                ArrayList<op> temp = search(root.child.get(index), st, psf+root.d);
                // if(f)
                //     psf = psf.substring(0, psf.length()-2);
                if(temp.size()>0)
                {
                    for(op t : temp)
                        res.add(t);
                }
            }
        }
        return res;
    }
   
}