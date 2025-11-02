package week3.polynom;

class Term {
    private double coeff;
    private int degree;


    public Term(double coeff, int degree) {
        this.coeff = coeff;
        this.degree = degree;
    }

    public double getCoeff() {
        return coeff;
    }

    public int getDegree() {
        return degree;
    }

    public String toString()
    {
        String st = "";
        if (coeff==0)
            return st;

        if ( coeff != 1 )
        {
            if (coeff==-1)
                st += "-";
            else st += coeff;
        }
        if (degree>0)
            st+="x";

        if (degree>1)
            st+= "^"+ degree;

        return st;
    }

    public boolean isEqual(Term other)
    {
        return degree == other.degree && coeff == other.coeff;
    }

    public void multiply(double f)
    {
        coeff = coeff*f;
    }

    public void multiply(Term other)
    {
        coeff = coeff* other.coeff;
        degree = degree + other.degree;
    }


    public boolean add(Term other)
    {
        if (other.degree == degree)
        {
            coeff += other.coeff;
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Term terms[] ={ new Term(3,2)
        ,new Term(4,0)
        , new Term(5,1)
        , new Term(1,2)
        , new Term(0,7)
        , new Term(0,0)
        ,new Term(-1,3)};

        for (int i = 0; i < terms.length; i++) {
            System.out.print(terms[i]);

            terms[i].multiply(new Term(1,2));
            System.out.println("  " + terms[i]);
        }




    }
}
