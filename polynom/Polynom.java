package week3.polynom;

import java.util.ArrayList;

class Polynom {

    private ArrayList<Term> terms;

    public Polynom() {
        terms = new ArrayList<>();
    }

    public void addTerm(Term t)
    {
        if (t.getCoeff()==0)
            return;

        if (terms.isEmpty())
        {
            terms.add(t);
            return;
        }

        int i=0;

        for (;  i< terms.size() &&  terms.get(i).getDegree()> t.getDegree() ; i++);

        if (i>=terms.size() ||  !terms.get(i).add(t))
            terms.add(i,t);

        if (terms.get(i).getCoeff() ==0)
            terms.remove(i);

    }

    public String toString()
    {
        String st ="";

        for (int t = 0; t < terms.size(); t++) {
            if (t>0 && terms.get(t).getCoeff()>0)
                st+="+";
            st += terms.get(t);
        }
        return st;
    }

    public static void main(String[] args) {
        Polynom p  = new Polynom();

        p.addTerm(new Term(2,3));
        p.addTerm(new Term(-3,4));
        p.addTerm(new Term(3,4));
        p.addTerm(new Term(-3,0));

        System.out.println(p);
    }
}
